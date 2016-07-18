package grasp.parsers;

import grasp.components.inputlanguage.*;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class LparseASPLoaderListener extends LparseASPBaseListener {

    private final static Logger log = Logger.getLogger("LparseASPLoaderListener");

    // Mapping of nodes
    private ParseTreeProperty<List<Parameter>> parameterListNodes = new ParseTreeProperty<List<Parameter>>();
    private ParseTreeProperty<Atom> atomNodes = new ParseTreeProperty<Atom>();
    private ParseTreeProperty<Literal> literalNodes = new ParseTreeProperty<Literal>();
    private ParseTreeProperty<List<Literal>> literalListNodes = new ParseTreeProperty<List<Literal>>();
    private ParseTreeProperty<ExtLiteral> extLiteralNodes = new ParseTreeProperty<ExtLiteral>();
    private ParseTreeProperty<Formula> formulaNodes = new ParseTreeProperty<Formula>();
    private ParseTreeProperty<List<Formula>> formulaListNodes = new ParseTreeProperty<List<Formula>>();
    private ParseTreeProperty<Rule> ruleNodes = new ParseTreeProperty<Rule>();
    private ParseTreeProperty<List<Rule>> ruleListNodes = new ParseTreeProperty<List<Rule>>();

    List<Rule> ruleList = new ArrayList<Rule>();

    ///////////////// LISTENERS

    public void exitPos_literal(LparseASPParser.Pos_literalContext ctx) {

        if (ctx.predicate().IDENTIFIER() != null) {
            Atom atom = Atom.build(ctx.predicate().IDENTIFIER().getText());
            if (ctx.list_parameters() != null) {
                atom.setParameters(parameterListNodes.get(ctx.list_parameters()));
            }
            atomNodes.put(ctx, atom);
        } else {
            throw new RuntimeException("I was not expecting this element: "+ctx.getText());
        }
    }

    public void exitLiteral(LparseASPParser.LiteralContext ctx) {

        Atom pos_literal = atomNodes.get(ctx.pos_literal());

        Literal literal = Literal.build(pos_literal);
        if (ctx.MINUS() != null) {
            literal.setNeg(true);
        } else {
            literal.setNeg(false);
        }

        literalNodes.put(ctx, literal);
    }

    public void exitExt_literal(LparseASPParser.Ext_literalContext ctx) {

        ExtLiteral extLiteral = ExtLiteral.build(literalNodes.get(ctx.literal()));

        if (ctx.NOT() != null) {
            extLiteral.setNot(true);
        } else {
            extLiteral.setNot(false);
        }

        extLiteralNodes.put(ctx, extLiteral);
    }

    public void exitList_ext_literals_expressions(LparseASPParser.List_ext_literals_expressionsContext ctx) {

        Formula formula = null;
        List<Formula> formulaList = new ArrayList<Formula>();

        if (ctx.ext_literal() != null) {
            ExtLiteral extLiteral = null;
            extLiteral = extLiteralNodes.get(ctx.ext_literal());
            formula = Formula.build(extLiteral);
            formulaList.add(formula);
        } else {
            throw new RuntimeException("I was not expecting this element: "+ctx.getText());
        }

        if (ctx.list_ext_literals_expressions() != null) {
            formulaList.addAll(formulaListNodes.get(ctx.list_ext_literals_expressions()));
        }

        formulaListNodes.put(ctx, formulaList);
    }

    public void exitList_literals(LparseASPParser.List_literalsContext ctx) {

        Literal literal = null;
        List<Literal> literalList = new ArrayList<Literal>();

        if (ctx.literal() != null) {
            literal = literalNodes.get(ctx.literal());
        } else {
            throw new RuntimeException("I was not expecting this element: "+ctx.getText());
        }

        literalList.add(literal);

        if (ctx.list_literals() != null) {
            literalList.addAll(literalListNodes.get(ctx.list_literals()));
        }

        literalListNodes.put(ctx, literalList);
    }

    public void exitList_parameters(LparseASPParser.List_parametersContext ctx) {

        Parameter parameter = null;
        List<Parameter> parameterList = new ArrayList<Parameter>();

        if (ctx.identifier() != null) {
            parameter = Parameter.build(Literal.build(Atom.build(ctx.identifier().IDENTIFIER().getText())));
        } else if (ctx.constant() != null) {
            parameter = Parameter.build(Integer.parseInt(ctx.constant().INTEGER().getText()));
        } else {
            throw new RuntimeException("I was not expecting this element: "+ctx.getText());
        }

        parameterList.add(parameter);

        if (ctx.list_parameters() != null) {
            parameterList.addAll(parameterListNodes.get(ctx.list_parameters()));
        }

        parameterListNodes.put(ctx, parameterList);
    }

    public void exitChoice(LparseASPParser.ChoiceContext ctx) {
        List<Literal> literalList = literalListNodes.get(ctx.list_literals());

        // read the parameters for the choice operator
        int l, r;
        if (ctx.min != null) {
            l = Integer.parseInt(ctx.min.getText());
        } else {
            l = 0;
        }

        if (ctx.max != null) {
            r = Integer.parseInt(ctx.max.getText());
        } else {
            r = literalList.size();
        }

        // translate the choice operator if boundary cases
        Operator op = Operator.CHOICE;
        if (l == literalList.size() && l == r) op = Operator.AND;
        else if (l == 1 && r == literalList.size()) op = Operator.OR;
        else if (l == 1 && r == 1) op = Operator.XOR;

        Formula formula = Formula.buildFromLiterals(literalList, op);

        formulaNodes.put(ctx, formula);
    }

    public void exitHead(LparseASPParser.HeadContext ctx) {

        Formula formula = null;

        if (ctx.literal() != null) {
            formula = Formula.build(literalNodes.get(ctx.literal()));
        } else if (ctx.choice() != null) {
            formula = formulaNodes.get(ctx.choice());
        } else {
            throw new RuntimeException("I was not expecting this element: "+ctx.getText());
        }

        formulaNodes.put(ctx, formula);
    }

    public void exitBody(LparseASPParser.BodyContext ctx) {
        Formula formula = null;

        if (ctx.choice() != null) {
            formula = formulaNodes.get(ctx.choice());
        } else if (ctx.list_ext_literals_expressions() != null) {
            formula = Formula.buildFromFormulas(formulaListNodes.get(ctx.list_ext_literals_expressions()), Operator.AND);
        } else {
            throw new RuntimeException("I was not expecting this element: "+ctx.getText());
        }

        formulaNodes.put(ctx, formula);
    }

    public void exitConstraint(LparseASPParser.ConstraintContext ctx) {
        Rule rule = new Rule();

        if (ctx.body() != null) {
            rule.setBody(formulaNodes.get(ctx.body()));
        } else {
            throw new RuntimeException("I was not expecting this element: "+ctx.getText());
        }

        ruleNodes.put(ctx, rule);
    }

    public void exitNormrule(LparseASPParser.NormruleContext ctx) {
        Rule rule = new Rule();

        if (ctx.head() != null) {
            rule.setHead(formulaNodes.get(ctx.head()));
        } else {
            throw new RuntimeException("I was not expecting this element: "+ctx.getText());
        }

        if (ctx.body() != null) {
            rule.setBody(formulaNodes.get(ctx.body()));
        } else {
            throw new RuntimeException("I was not expecting this element: "+ctx.getText());
        }

        ruleNodes.put(ctx, rule);
    }


    public void exitAsprule(LparseASPParser.AspruleContext ctx) {
        Rule rule = null;

        if (ctx.constraint() != null) {
            rule = ruleNodes.get(ctx.constraint());
        } else if (ctx.normrule() != null) {
            rule = ruleNodes.get(ctx.normrule());
        }

        ruleNodes.put(ctx, rule);
        ruleList.add(rule);
    }

    public void exitAspfact(LparseASPParser.AspfactContext ctx) {
        Rule rule = new Rule();

        if (ctx.head() != null) {
            rule.setHead(formulaNodes.get(ctx.head()));
        } else {
            throw new RuntimeException("I was not expecting this element: "+ctx.getText());
        }

        ruleNodes.put(ctx, rule);
        ruleList.add(rule);
    }

//    public void exitAtom(LparseASPParser. ctx) {
//        Integer atomId = atomBase.add(ctx.IDENTIFIER().getText());
//        setAtomIdNode(ctx, atomId);
//
//        log.info("attaching atom (id " + atomId + ") to atom node.");
//    }
//
//    public void exitTerm(LparseASPParser.TermContext ctx) {
//
//        Integer formulaId;
//        Integer atomId = getAtomIdNode(ctx.atom());
//
//        Atom atom = atomBase.read(atomId);
//
//        if (ctx.NEG() != null) {
//            log.info("creating formula NEG from atom (id " + atomId + ").");
//            formulaId = formulaBase.build(atom, Op.NEG);
//        } else {
//            log.info("creating formula from atom (id " + atomId + ").");
//            formulaId = formulaBase.build(atom);
//        }
//
//        log.info("attaching formula (id " + formulaId + ") to Term node.");
//        setFormulaIdNode(ctx, formulaId);
//    }
//
//    public void exitList_terms(LparseASPParser.List_termsContext ctx) {
//        if (ctx.COMMA() != null) {
//            Integer formulaId = getFormulaIdNode(ctx.term());
//            addListIdNode(ctx, formulaId);
//            log.info("attaching formula (id " + formulaId + ") to new List_terms node.");
//
//            List<Integer> list = getListIdNode(ctx);
//            List<Integer> childList = getListIdNode(ctx.list_terms());
//            list.addAll(childList);
//            log.info("merging list with child List_terms node.");
//
//        } else {
//            Integer formulaId = getFormulaIdNode(ctx.term());
//            addListIdNode(ctx, formulaId);
//            log.info("attaching single formula (id " + formulaId + ") to new List_terms node.");
//        }
//    }
//
//    public void exitBterm(LparseASPParser.BtermContext ctx) {
//
//        Integer formulaId = null;
//
//        Integer childFormulaId = getFormulaIdNode(ctx.term());
//        if (childFormulaId == null) {
//            Integer atomId = getFormulaIdNode(ctx.term().atom());
//            Atom atom = atomBase.read(atomId);
//            if (ctx.NAF() != null) {
//                log.info("creating formula NAF from atom (id " + atomId + ").");
//                formulaId = formulaBase.build(atom, Op.NAF);
//            }
//        } else {
//            if (ctx.NAF() != null) {
//                log.info("creating formula NAF from formula (id " + childFormulaId + ")");
//                formulaId = formulaBase.add(childFormulaId, Op.NAF);
//            }
//        }
//
//        // when there is not NAF we clone the internal term up
//        if (formulaId == null) {
//            formulaId = childFormulaId;
//        }
//
//        setFormulaIdNode(ctx, formulaId);
//        log.info("attaching formula (id " + formulaId + ") to BTerm node.");
//
//    }
//
//    public void exitList_bterms(LparseASPParser.List_btermsContext ctx) {
//        if (ctx.COMMA() != null) {
//            Integer formulaId = getFormulaIdNode(ctx.bterm());
//            addListIdNode(ctx, formulaId);
//            log.info("attaching formula (id " + formulaId + ") to new List_bterms node.");
//
//            List<Integer> list = getListIdNode(ctx);
//            List<Integer> childList = getListIdNode(ctx.list_bterms());
//            list.addAll(childList);
//            log.info("merging list with child List_bterms node.");
//
//        } else {
//            Integer formulaId = getFormulaIdNode(ctx.bterm());
//            addListIdNode(ctx, formulaId);
//            log.info("attaching single formula (id " + formulaId + ") to new List_bterms node.");
//        }
//    }
//
//    public void exitHead(LparseASPParser.HeadContext ctx) {
//        if (ctx.LACC() == null) { // single term
//            // passing up the child formula
//            setFormulaIdNode(ctx, getFormulaIdNode(ctx.term()));
//        } else { // CHOICE operation
//
//            // get the list of inputs given by the child tree
//            List<Integer> list = getListIdNode(ctx.list_terms());
//
//            // get the min and max options from the operator, if present
//            Integer l, r;
//            Integer size = list.size();
//            if (ctx.l == null) l = 0;
//            else {
//                l = Integer.parseInt(ctx.l.getText());
//                if (l > size) {
//                    l = size;
//                    log.warning("choice left parameter too high (" + l + "), set to the size of the set of inputs (" + size + ").");
//                }
//            }
//            if (ctx.r == null) r = size;
//            else {
//                r = Integer.parseInt(ctx.r.getText());
//                if (r > size) {
//                    log.warning("choice right parameter too high (" + r + "), set to the size of the set of inputs (" + size + ").");
//                    r = size;
//                }
//            }
//
//            // translate the CHOICE operator in more known descriptions
//            // options[0] is the min of inputs to be chosen within the list
//            // options[1] is the max of inputs to be chosen within the list
//
//            Op op = Op.CHOICE;
//            if (l == list.size() && l == r) op = Op.AND;
//            else if (l == 1 && r == list.size()) op = Op.OR;
//            else if (l == 1 && r == 1) op = Op.XOR;
//
//            Integer formulaId;
//
//            if (op == Op.CHOICE) {
//                Integer options[] = new Integer[2];
//                options[0] = l;
//                options[1] = r;
//                // create the CHOICE operation (with options)
//                formulaId = formulaBase.add(list, op, options);
//            } else {
//                // create AND/OR/XOR operations (no options)
//                formulaId = formulaBase.add(list, op);
//            }
//
//            // record the formula on the tree
//            setFormulaIdNode(ctx, formulaId);
//        }
//
//    }
//
//    public void exitBody(LparseASPParser.BodyContext ctx) {
//        if (ctx.LACC() == null) {
//
//            // get the list of inputs given by the child tree
//            List<Integer> list = getListIdNode(ctx.list_bterms());
//
//            // if more then 1 input create the AND operation
//            Integer formulaId;
//            if (list.size() > 1) {
//                formulaId = formulaBase.add(list, Op.AND);
//            } else { // else just copy the inner formula
//                formulaId = list.get(0);
//            }
//
//            // record the formula on the tree
//            setFormulaIdNode(ctx, formulaId);
//
//        } else { // CHOICE operator
//            // TODO
//        }
//    }
//
//    public void exitStatement(LparseASPParser.StatementContext ctx) {
//        if (ctx.IF() != null) { // rule
//
//            Integer headId = getFormulaIdNode(ctx.head());
//            Integer bodyId = getFormulaIdNode(ctx.body());
//
//            ruleBase.add(headId, bodyId);
//
//        } else { // fact
//
//        }
//    }

}


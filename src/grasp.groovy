import grasp.runners.Runner

// command line configuration
def cli = new CliBuilder(header: '\nOptions:', usage: 'grasp [options] <lpfile>')
cli.p(longOpt: 'parse', 'Parse the program')
cli.g(longOpt: 'ground', 'Ground the program')
cli.s(longOpt: 'solve', 'Solve the program')
cli.r(longOpt: 'read', 'Read the results')
def options = cli.parse(args)

println("grasp - groovy wrapper for ASP parser/grounder/solver")

List<String> inputFileList = options.arguments()

if (options.arguments().size() == 0) {
    cli.usage()
} else {
    for (file in inputFileList) {

        Runner runner = new Runner()

        print("reading from file " + file + "... ");
        runner.loadCodeFromFile(file)
        print("program loaded...\n")

        if (options.p) {
            runner.parse()
        }

        if (options.g) {
            runner.ground()
        }

        if (options.s) {
            runner.solve()
        }

        if (options.r) {
            runner.read()
        }
    }
}

# grasp
*a GRoovy wrapper for Answer Set Programming (ASP)*

At the moment grasp is just a wrapper to lparse+smodels. 
In the future, it should include other ASP grounders/solvers, and in an utopistic future, it will host a full ASP suite implemented in Groovy. 

grasp is NOT good for you if you are concerned about efficiency.
grasp is good for you if you want to integrate within your own groovy/java application the capabilities of ASP. 

## Dependencies

Download the binaries of +lparse+ and +smodels+ from http://www.tcs.hut.fi/Software/smodels/
and put them in the bin directory.

Add the following jars at compile time:
* groovy (tested with *groovy-2.4.7*)
* antlr4 (tested with *antlr-4.5-complete*) 
* log4j (tested with *log4j-1.2.17*)

## Components
* parser of ASP programs
* wrapper to ASP solver
* parser ASP solver output
So far, grasp integrate only lparse and smodels.

## Usage



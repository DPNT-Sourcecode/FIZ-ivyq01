package befaster.solutions.HLO;

import befaster.runner.SolutionNotImplementedException;

public class HelloSolution {
    public String hello(String friendName) {
        if(friendName != null) {
            return String.format("Hello, %s!", friendName);
        }
        return "Hello Stranger!";
    }
}


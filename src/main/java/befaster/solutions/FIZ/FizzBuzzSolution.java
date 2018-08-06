package befaster.solutions.FIZ;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {
        String answer;
        String stringNumber = String.valueOf(number);
        boolean number3Condition = number % 3 == 0  || stringNumber.contains("3");
        boolean number5Condition = number %5 == 0 || stringNumber.contains("5");
        if( number3Condition && number5Condition ) {
            answer = "fizz buzz";
        } else if(number5Condition) {
            answer = "buzz";

        } else if(number3Condition) {
            answer = "fizz";
        } else {
            answer = String.valueOf(number);
        }
        return answer;
    }

}

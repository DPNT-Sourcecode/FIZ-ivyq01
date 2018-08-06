package befaster.solutions.FIZ;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {
        String answer;
        if(number % 3 == 0 && number %5 == 0) {
            answer = "fizz buzz";
        } else if(number %5 == 0) {
            answer = "buzz";

        } else if(number %3 == 0) {
            answer = "fizz";
        } else {
            answer = String.valueOf(number);
        }
        return answer;
    }

}

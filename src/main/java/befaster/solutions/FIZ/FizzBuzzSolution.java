package befaster.solutions.FIZ;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {
        String answer = "";
        String stringNumber = String.valueOf(number);
        boolean fizzCondition = number % 3 == 0  || stringNumber.contains("3");
        boolean buzzCondition = number %5 == 0 || stringNumber.contains("5");
        boolean deluxeCondition = (number % 3 == 0  && stringNumber.contains("3")) || (number %5 == 0 && stringNumber.contains("5"));
        String deluxeValue = number%2 == 0 ? "deluxe" : "fake deluxe";

        if(fizzCondition) {
            answer = "fizz";
        } if(buzzCondition) {
            answer = answer.concat(fizzCondition ? " buzz" : "buzz");
        } if(deluxeCondition) {
            answer = answer.concat(fizzCondition || buzzCondition ? " " : "");
            answer = answer.concat(deluxeValue);
        }
        if(answer.equals("")) {
            answer = stringNumber;
        }
        return answer;
    }

}

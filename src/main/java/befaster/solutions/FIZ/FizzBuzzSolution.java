package befaster.solutions.FIZ;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {
        String answer = "";
        String stringNumber = String.valueOf(number);
        boolean number3Condition = number % 3 == 0  || stringNumber.contains("3");
        boolean number5Condition = number %5 == 0 || stringNumber.contains("5");
        boolean containsSameDigits = true;
        for(int i=1; i < stringNumber.length(); i++) {
            if(stringNumber.charAt(i) != stringNumber.charAt(i-1)) {
                containsSameDigits = false;
                break;
            }
        }
        boolean deluxeCondition = number > 10 && containsSameDigits;
        if( number3Condition) {
            answer = "fizz";
        } if(number5Condition) {

            answer = answer.concat(number3Condition ? " buzz" : "buzz");

        } if(deluxeCondition) {
            String deluxeValue = number%2 != 0 ? "fake deluxe" : "deluxe";
            answer = answer.concat(number3Condition || number5Condition ? " " : "");
            answer = answer.concat(deluxeValue);
        }
        if(answer.equals("")) {
            answer = stringNumber;
        }
        return answer;
    }

}

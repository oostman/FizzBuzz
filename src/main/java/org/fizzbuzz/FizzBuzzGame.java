package org.fizzbuzz;

public class FizzBuzzGame {

    public String generateReply(int input) {
        if(isFizz(input) && isBuzz(input)){
            return "Fizz Buzz";
        } else if(isFizz(input)){
            return "Fizz";
        } else if(isBuzz(input)){
            return "Buzz";
        }
        return Integer.toString(input);
    }

    private boolean isFizz(int input) {
        return input % 3 == 0;
    }

    private boolean isBuzz(int input) {
        return input % 5 == 0;
    }


}

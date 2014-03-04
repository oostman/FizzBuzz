package org.fizzbuzz.domain;

import org.fizzbuzz.dto.FizzBuzzResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FizzBuzzService {

    @Autowired
    FizzBuzzGame fizzBuzzGame;

    public FizzBuzzResponse generateReply(List<String> numbers) {
        FizzBuzzResponse fizzBuzzResponse = new FizzBuzzResponse();
        for (String number : numbers) {
            if (isValidNumber(number)) {
                fizzBuzzResponse.addResponse(generateReply(number));
            } else {
                fizzBuzzResponse.addFaultyNumber(number);
            }
        }
        return fizzBuzzResponse;
    }

    private String generateReply(String input) {
        if (isValidNumber(input)) {
            return fizzBuzzGame.generateReply(Integer.parseInt(input));
        }
        return "Invalid number";
    }

    private boolean isValidNumber(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}

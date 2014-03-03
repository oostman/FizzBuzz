package org.fizzbuzz.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FizzBuzzService {

    @Autowired
    FizzBuzzGame fizzBuzzGame;

    public String generateReply(String input) {
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

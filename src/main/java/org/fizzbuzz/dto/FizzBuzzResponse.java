package org.fizzbuzz.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class FizzBuzzResponse implements Serializable {

    private List<String> output = new ArrayList<String>();
    private List<String> faultyNumbers = new ArrayList<String>();

    public void addResponse(String response) {
        this.output.add(response);
    }

    public void addFaultyNumber(String faultyNumber) {
        this.faultyNumbers.add(faultyNumber);
    }

    public List<String> getOutput() {
        return output;
    }

    public List<String> getFaultyNumbers() {
        return faultyNumbers;
    }
}

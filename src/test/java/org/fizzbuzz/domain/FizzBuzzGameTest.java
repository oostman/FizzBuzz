package org.fizzbuzz.domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FizzBuzzGameTest {

    private FizzBuzzGame sut;
    private int nonFizzBuzzNumber = 1;
    private int fizzNumber = 6;
    private int buzzNumber = 10;
    private int fizzBuzzNumber = 30;

    @Before
    public void setup() {
        sut = new FizzBuzzGame();
    }

    @Test
    public void shouldReturnSameNumberWhenNotDividableBy3or5() {
        String expected = Integer.toString(nonFizzBuzzNumber);
        String actual = sut.generateReply(nonFizzBuzzNumber);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnFizzWhenDividableBy3() {
        String actual = sut.generateReply(fizzNumber);

        Assert.assertEquals("Fizz", actual);
    }

    @Test
    public void shouldReturnBuzzWhenDividableBy5() {
        String actual = sut.generateReply(buzzNumber);

        Assert.assertEquals("Buzz", actual);
    }

    @Test
    public void shouldReturnFizzBuzzWhenDividableBy3and5() {
        String actual = sut.generateReply(fizzBuzzNumber);

        Assert.assertEquals("Fizz Buzz", actual);
    }


}

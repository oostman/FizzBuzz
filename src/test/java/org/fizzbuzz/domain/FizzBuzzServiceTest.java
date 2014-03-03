package org.fizzbuzz.domain;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class FizzBuzzServiceTest {

    @InjectMocks
    private FizzBuzzService sut;

    @Mock
    private FizzBuzzGame fizzBuzzGame;

    private String validNumber = "42";
    private String invalidNumber = "fortyTwo";

    @Before
    public void setup() {
        sut = new FizzBuzzService();
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void validNumberShouldBePassedToGame() {
        List<String> validNumberList = new ArrayList<String>();
        validNumberList.add(validNumber);
        sut.generateReply(validNumberList);
        verify(fizzBuzzGame, times(1)).generateReply(Matchers.anyInt());
    }

    @Test
    public void invalidNumberShouldNotBePassedToGame() {
        List<String> invalidNumberList = new ArrayList<String>();
        invalidNumberList.add(invalidNumber);
        sut.generateReply(invalidNumberList);
        verify(fizzBuzzGame, times(0)).generateReply(Matchers.anyInt());
    }

}

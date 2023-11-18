package com.codeeasy.exercise;

import com.codeeasy.com.codeeasy.exercise.FunctionalProgramming;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FunctionalProgrammingTest {
    @Test
    public void sumOfSquaresOfPrime(){
        int startingNumber = 101;
        int count = 51;
        double expected = 770.3433;
        double actual = FunctionalProgramming.sumOfSquaresOfPrime(startingNumber,count);
        assertEquals(expected,actual,0.001);

    }

    private static MathContext setScale() {
        return new MathContext(10, RoundingMode.HALF_EVEN);
    }
}

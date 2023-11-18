package com.codeeasy.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MathUtilTest {

    @Test
    public void isPrime_primeNumber(){
        int number = 19;
        assertTrue(MathUtil.isPrime(number));
    }

    @Test
    public void isPrime_nonPrimeNumber(){
        int number = 20;
        assertFalse(MathUtil.isPrime(number));
    }

    @Test
    public void isPrime_negativeNumber(){
        int number = -20;
        assertFalse(MathUtil.isPrime(number));
    }
}

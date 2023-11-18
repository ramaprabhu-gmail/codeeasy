package com.codeeasy.com.codeeasy.exercise;

import com.codeeasy.util.MathUtil;

import java.math.BigDecimal;
import java.util.stream.Stream;

public class FunctionalProgramming {
    public static double sumOfSquaresOfPrime(int startingNumber, int count) {

        return Stream.iterate(startingNumber,e -> e + 1)
                .filter(MathUtil::isPrime)
                .mapToDouble(Math::sqrt)
                .limit(count)
                .sum();
    }
}

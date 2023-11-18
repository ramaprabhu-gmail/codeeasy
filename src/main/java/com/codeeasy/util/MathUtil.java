package com.codeeasy.util;

import java.util.stream.IntStream;

public class MathUtil {

    private MathUtil(){}
    public static boolean isPrime(Integer number) {
        if(number < 0)
            return false;
        return IntStream.range(2,number/2)
                .noneMatch(i -> number % i ==0);
    }

}

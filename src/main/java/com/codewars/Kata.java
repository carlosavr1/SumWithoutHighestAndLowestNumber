package com.codewars;

import java.util.stream.IntStream;

/**
 * Created by carlvarn on 19/07/2017.
 */
public class Kata {
    public static int sum(int[] numbers)
    {
        int sum = 0;
        if(numbers != null && numbers.length > 1){
            sum = IntStream.of(numbers).sorted().skip(1L).map(i -> -i).sorted().map(i -> -i).skip(1L).sum();
        }
        return sum;
    }
}

package com.codewars;

/**
 * Created by carlvarn on 19/07/2017.
 */

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void BasicTests() {
        assertEquals(16, Kata.sum(new int[] { 6, 2, 1, 8, 10}));
    }
    @Test
    public void NullTests() {
        assertEquals(0, Kata.sum(null));
    }
    @Test
    public void EmptyTests() {
        assertEquals(0, Kata.sum(new int[] {}));
    }
    @Test
    public void Test1() {
        assertEquals(6, Kata.sum(new int[] { 1, 1, 11, 2, 3}));
    }
    @Test
    public void Test2() {
        assertEquals(16, Kata.sum(new int[] { 1, 11, 11, 2, 3}));
    }
    @Test
    public void Test3() {
        assertEquals(5, Kata.sum(new int[] { 1, 5, 11}));
    }
    @Test
    public void Test4() {
        assertEquals(17, Kata.sum(new int[] { 1, 1, 5, 11, 11}));
    }
}
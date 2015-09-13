package com.funcoding.demo;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author SI AHMED OUALI Souhail
 */
public class MergeSortAlgorithmTest {

    @Test
    public void testMergeSortedList() throws Exception {
        Integer[] left = {1, 7, 11, 18, 19};
        Integer[] right = {3, 5, 13};
        Integer[] output = {1, 3, 5, 7, 11, 13, 18, 19};

        List<Integer> sorted = MergeSortAlgorithm.mergeSortedList(Arrays.asList(left), Arrays.asList(right));
        Assert.assertArrayEquals(sorted.toArray(), output);

    }

    @Test
    public void testSort() throws Exception {
        Integer[] values = {1, 7, 11, 18, 19, 3, 5, 13, 20};
        Integer[] output = {1, 3, 5, 7, 11, 13, 18, 19, 20};
        List<Integer> sorted = MergeSortAlgorithm.sort(Arrays.asList(values));
        Assert.assertArrayEquals(sorted.toArray(), output);

    }
}
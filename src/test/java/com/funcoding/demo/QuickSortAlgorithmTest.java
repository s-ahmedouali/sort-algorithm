package com.funcoding.demo;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by root on 13/09/2015.
 */
public class QuickSortAlgorithmTest {

    @Test
    public void testQuickSort() throws Exception {

        Integer[] input = {11, 3, 7, 5, 1};
        Integer[] output = {1, 3, 5, 7, 11};
        List<Integer> sorted = QuickSortAlgorithm.quickSort(Arrays.asList(input));

        Assert.assertArrayEquals(sorted.toArray(), output);

    }
}
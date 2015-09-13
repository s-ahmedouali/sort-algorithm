package com.funcoding.demo;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by root on 13/09/2015.
 */
public class BubbleAlgorithmTest {

    @Test
    public void testSortBubble() throws Exception {

        Integer[] input = {11, 3, 7, 5, 1};
        Integer[] output = {1, 3, 5, 7, 11};
        Integer[] sorted = BubbleAlgorithm.sortBubble(input);


        Assert.assertArrayEquals(sorted, output);
    }

    @Test
    public void testSortBubbleWorstCase() throws Exception {

        Integer[] input = {11, 7, 5, 3, 1};
        Integer[] output = {1, 3, 5, 7, 11};
        Integer[] sorted = BubbleAlgorithm.sortBubble(input);


        Assert.assertArrayEquals(sorted, output);
    }
}
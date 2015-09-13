package com.funcoding.demo;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by root on 13/09/2015.
 */
public class InsertSortAlgorithmTest {

    @Test
    public void testSortWithLinkedList() throws Exception {
        Integer[] input = {11, 3, 7, 5, 1};
        Integer[] output = {1, 3, 5, 7, 11};
        Integer[] sorted = InsertSortAlgorithm.sortWithLinkedList(input);

        Assert.assertArrayEquals(sorted, output);
    }
}
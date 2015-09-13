package com.funcoding.demo;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by SI AHMED OUALI Souhail on 13/09/2015.
 */
public class BinarySearchAlgorithmTest {

    @Test
    public void testSearchSorted() throws Exception {

        Integer result = BinarySearchAlgorithm.search(Arrays.asList(1, 2, 3, 4, 5), 2);
        Assert.assertTrue(result == 0);

    }

    @Test
    public void testSearch() throws Exception {

        Integer result = BinarySearchAlgorithm.search(Arrays.asList(1, 3, 5, 7, 11, 13, 18, 19), 3);
        Assert.assertTrue(result == 0);

    }

    @Test
    public void testSearchFail() throws Exception {

        Integer result = BinarySearchAlgorithm.search(Arrays.asList(1, 3, 5, 7, 11, 13, 18, 19), 0);
        Assert.assertTrue(result == -1);

    }

}
 package com.funcoding.demo;

/**
 * Created by root on 13/09/2015.
 * <p>
 * this implementation is simple, it is extremely inefficient. The worst case, when you want
 * to sort a list that is already sorted in reverse order, is a performance of O(n2): For each iteration, you
 * are only switching one element. The best case is when a list is already sorted: You make one pass
 * through the list, and because you have not switched any elements, you can stop. This has a performance
 * of O(n).
 */
public class BubbleAlgorithm {

    public static Integer[] sortBubble(Integer[] input) {
        Boolean nbrSwitched = false;

        do {
            nbrSwitched = false;
            for (int i = 0; i < input.length - 1; i++) {
                if (input[i + 1] < input[i]) {
                    Integer tmp = input[i + 1];
                    input[i + 1] = input[i];
                    input[i] = tmp;
                    nbrSwitched = true;
                }
            }
        } while (nbrSwitched);
        return input;
    }
}

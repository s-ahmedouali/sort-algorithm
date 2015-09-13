package com.funcoding.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author SI AHMED OUALI Souhail
 */
public class MergeSortAlgorithm {

    public static List<Integer> mergeSortedList(List<Integer> left, List<Integer> right) {
        List<Integer> sorted = new ArrayList<Integer>(left.size() + right.size());

        int ptrLeft = 0;
        int ptrRight = 0;

        while (ptrLeft < left.size() && ptrRight < right.size()) {
            if (left.get(ptrLeft) < right.get(ptrRight)) {
                sorted.add(left.get(ptrLeft));
                ptrLeft++;
            } else {
                sorted.add(right.get(ptrRight));
                ptrRight++;
            }
        }

        while (ptrLeft < left.size()) {
            sorted.add(left.get(ptrLeft));
            ptrLeft++;
        }

        while (ptrRight < right.size()) {
            sorted.add(right.get(ptrRight));
            ptrRight++;
        }
        return sorted;
    }

    public static List<Integer> sort(List<Integer> values) {
        System.out.println(values);
        if (values.size() < 2) {
            return values;
        }
        List<Integer> left = values.subList(0, values.size() / 2);
        List<Integer> right = values.subList(values.size() / 2, values.size());
        return mergeSortedList(sort(left), sort(right));
    }
}

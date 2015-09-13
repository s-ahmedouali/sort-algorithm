package com.funcoding.demo;

import java.util.List;

/**
 * Created by SI AHMED OUALI Souhail on 13/09/2015.
 */
public class BinarySearchAlgorithm {

    public static Integer search(List<Integer> list, Integer nbr) {
        if (list.isEmpty()) {
            return -1;
        }
        Integer middle = list.get(list.size() / 2);
        if (middle == nbr) {
            return 0;
        } else if (nbr < middle) {
            return search(list.subList(0, list.size() / 2), nbr);
        } else {
            return search(list.subList(list.size() / 2 + 1, list.size()), nbr);
        }
    }
}

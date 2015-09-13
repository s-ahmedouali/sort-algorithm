package com.funcoding.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author SI AHMED OUALI Souhail
 */
public class QuickSortAlgorithm {

    public static List<Integer> quickSort(List<Integer> list) {
        System.out.println(list);
        if (list.size() < 2) {
            return list;
        }

        Integer pivot = list.get(0);
        List<Integer> lower = new ArrayList<Integer>();
        List<Integer> higher = new ArrayList<Integer>();

        for (int i = 1; i < list.size(); i++) {
            Integer item = list.get(i);
            if (item > pivot) {
                higher.add(item);
            } else {
                lower.add(item);
            }
        }
        List<Integer> sortedList = new ArrayList<Integer>();
        sortedList.addAll(quickSort(lower));
        sortedList.add(pivot);
        sortedList.addAll(quickSort(higher));
        return sortedList;
    }
}

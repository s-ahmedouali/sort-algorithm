package com.funcoding.demo;

import java.util.LinkedList;
import java.util.List;

/**
 * @author SI AHMED OUALI Souhail
 * <p>
 * The worst-case performance for this algorithm is still O(n2), though: If you attempt to sort an
 * already-sorted list, you need to iterate to the end of the new list with each element to insert.
 */
public class InsertSortAlgorithm {

    public static Integer[] sortWithLinkedList(Integer[] input) {
        //A linked list is very efficient in
        //adding elements in the middle of the list, simply by rearranging the pointers of the nodes in the list.
        //If an ArrayList had been used, adding elements to the middle would be expensive.
        final List<Integer> sortedList = new LinkedList<Integer>();

        originalList:
        for (Integer number : input) {
            for (int i = 0; i < sortedList.size(); i++) {
                if (number < sortedList.get(i)) {
                    sortedList.add(i, number);
                    continue originalList;
                }
            }
            sortedList.add(sortedList.size(), number);

        }
        return sortedList.toArray(new Integer[input.length]);
    }


}

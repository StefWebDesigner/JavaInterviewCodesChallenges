package org.example.classbox.medium;

import java.util.*;

public class RemoveDuplicatesSortedArrayII {

//    Given an integer array nums sorted in non-decreasing order,
//    remove some duplicates in-place such that each unique element appears at most twice.
//    The relative order of the elements should be kept the same.


    public int removeDuplicates(int[] nums) {
        Map<Integer, Integer> tracker = new HashMap<>();
        List<Integer> newList = new ArrayList<>();

        Integer index = 0;
        for(int number : nums) {
            if(!tracker.containsKey(number)) {
                tracker.put(number, 1);
            } else {
                tracker.replace(number, tracker.get(number) + 1);
            }
            if(tracker.get(number) <= 2) {
                newList.add(number);
            }
        }

        return newList.size();
    }

}

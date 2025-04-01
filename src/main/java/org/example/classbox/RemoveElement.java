package org.example.classbox;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if(nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        System.out.println(i);
        return i;
    }

    public int removeElement2(int[] nums, int val) {
        List<Integer> newList = new ArrayList<>();
        for (int element : nums) {
            if (element != val) {
                newList.add(element);
            }
        }
        Collections.sort(newList);
        System.out.println(newList.size());
        System.out.println(newList);
        return newList.size();
    }
}

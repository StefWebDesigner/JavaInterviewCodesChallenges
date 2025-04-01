package org.example.classbox;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSums {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        Integer counter = 0;
        int[] result = new int[2];

        for(Integer element : nums) {
            map.put(element, counter);
            counter++;
        }

        counter = 0;
        for (int item : nums) {
            int complement = target - nums[counter];
            if (map.containsKey(complement) && map.get(complement) != counter) {
                result = new int[]{counter, map.get(complement)};
                return result;
            }
            counter++;
        }

        return new int[] {};
    }
}

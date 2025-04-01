package org.example.classbox;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSums {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        Integer position = 0;
        int[] result = new int[2];

        for(Integer element : nums) {
            map.put(element, position);
            position++;
        }

        position = 0;
        for (int item : nums) {
            int otherPair = target - nums[position];
            if (map.containsKey(otherPair) && map.get(otherPair) != position) {
                result = new int[]{position, map.get(otherPair)};
                return result;
            }
            position++;
        }

        return new int[] {};
    }
}

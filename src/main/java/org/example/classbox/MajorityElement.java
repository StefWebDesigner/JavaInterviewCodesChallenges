package org.example.classbox;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums) {
            if(!map.containsKey(num)){
                map.put(num, 1);
            } else {
                map.put(num, map.get(num) + 1);
            }
        }

        int maxElement = map.entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();
        System.out.println(maxElement);
        return maxElement;

    }
}

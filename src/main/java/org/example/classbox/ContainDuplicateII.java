package org.example.classbox;

import java.util.HashMap;
import java.util.Map;

public class ContainDuplicateII {

    public boolean containsDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        Integer counter = 0;
        for(Integer element : nums) {
            if(map.containsKey(element)) {
                if(counter - map.get(element) <= k){
                    return true;
                }
            }
            map.put(element, counter);
            counter++;
        }
        return false;
    }
}

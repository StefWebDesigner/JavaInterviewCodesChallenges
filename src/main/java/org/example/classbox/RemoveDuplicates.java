package org.example.classbox;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

    public int removeDuplicates(int[] nums) {
        Set<Integer> removeDups = new HashSet<>();
        Arrays.stream(nums).map(num -> num).forEach(removeDups::add);
        int count = removeDups.size();
        return count;
    }

    public int removeDuplicates2(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}

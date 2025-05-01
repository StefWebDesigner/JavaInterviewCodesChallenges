package org.example.classbox.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

//    int[] num9 = {-1,0,1,2,-1,-4};
//    Three sums[[-1, -1, 2], [-1, 0, 1]]

    public List<List<Integer>> threeSum(int[] nums, int target) {
        if (nums.length < 3){
            return new ArrayList<>();
        }

        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i + 2 < nums.length; ++i) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            int l = i + 1;
            int r = nums.length - 1;
            while (l < r) {
                final int sum = nums[i] + nums[l] + nums[r];
                if (sum == target) {
                    ans.add(Arrays.asList(nums[i], nums[l++], nums[r--]));
                    while (l < r && nums[l] == nums[l - 1])
                        ++l;
                    while (l < r && nums[r] == nums[r + 1])
                        --r;
                } else if (sum < target) {
                    ++l;
                } else {
                    --r;
                }
            }
        }

        System.out.println("Three sums" + ans);
        return ans;

    }
}

package org.example.classbox.medium;

import java.util.Arrays;

public class ThreeSumClosest {

//    Given an integer array nums of length n and an integer target, find three integers in nums such that the sum is
//    closest to target.
//    https://leetcode.com/problems/3sum-closest/description/
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        //set the variables
        int ans = 1 << 30;
        int n = nums.length;
        //start up the loop
        for (int i = 0; i < n; ++i) {
            //set up the variables
            int l = i + 1;
            int r = n - 1;
            while (l < r) {
                //Make it sum up
                int sum = nums[i] + nums[l] + nums[r];
                if (sum == target) {
                    return sum;
                }
                //second part
                if (Math.abs(sum - target) < Math.abs(ans - target)) {
                    ans = sum;
                }
                // if sums is bigger then target
                if (sum > target) {
                    --r;
                } else {
                    ++l;
                }
            }
        }
        return ans;
    }
}

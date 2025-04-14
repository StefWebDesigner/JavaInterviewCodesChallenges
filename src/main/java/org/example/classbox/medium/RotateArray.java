package org.example.classbox.medium;

import java.util.Arrays;

public class RotateArray {

    public void rotate(int[] nums, int k) {
                int n = nums.length;
                k %= n;
                // Reverse the entire array
        reversing(nums, 0, n - 1);
                // Reverse the first part (up to k elements)
        reversing(nums,0, k - 1);
                // Reverse the second part (from k to the end of the array)
        reversing(nums, k, n - 1);
        System.out.println(Arrays.toString(nums));
    }

    public void reversing(int[] nums, int i, int j) {
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            ++i;
            --j;
        }
    }



}

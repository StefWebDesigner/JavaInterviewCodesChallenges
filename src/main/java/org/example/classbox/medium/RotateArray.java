package org.example.classbox.medium;

import java.util.Arrays;

public class RotateArray {

    public void rotate(int[] nums, int shift) {
                int n = nums.length;
                //create the proportionality of things for the rotation
        shift %= n;
                // Reverse the entire array
        reversing(nums, 0, n - 1);
        // Reverse the first part (up to k elements)
        //Its taking it form the mid point from the target
        //beging to mid
        reversing(nums,0, shift - 1);
        // Reverse the second part (from k to the end of the array)
        //mid to end
        reversing(nums, shift, n - 1);
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

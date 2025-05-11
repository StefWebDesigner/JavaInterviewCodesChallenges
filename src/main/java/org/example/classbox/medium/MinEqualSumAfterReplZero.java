package org.example.classbox.medium;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/minimum-equal-sum-of-two-arrays-after-replacing-zeros/?envType=daily-question&envId=2025-05-10
//Have the arrays jabe the same sum and repalce all zeros as needed
public class MinEqualSumAfterReplZero {

//    int[] nums1 = {3,2,0,1,0};
//    int[] nums2 = {6,5,0};
//        result -> 12

    //        int[] nums1 = {2,0,2,0};
//        int[] nums2 = {1,4};
//        result -> -1
    public long minSum(int[] nums1, int[] nums2) {
        long s1 = 0;
        long s2 = 0;
        boolean hasZero = false;
        for (int x : nums1) {
            hasZero |= x == 0;
            s1 += Math.max(x, 1);
        }
        for (int x : nums2) {
            s2 += Math.max(x, 1);
        }
        if (s1 > s2) {
            return minSum(nums2, nums1);
        }
        if (s1 == s2) {
            return s1;
        }
        return hasZero ? s2 : -1;
    }
}

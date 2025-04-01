package org.example.classbox;

import java.util.Arrays;

public class MergeSortedArrays {

    public void mergeIntoAnExistingArray( int m, int n) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int[] newNums2 = Arrays.copyOfRange(nums2, 0, n);
        System.out.println(Arrays.toString(newNums2));

        int position = m;

        for(int item : newNums2) {
            nums1[position] = item;
            position++;
        }
        Arrays.sort(nums1);
    }
}



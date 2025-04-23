package org.example.assessment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CountFairPair {

    // Look to make fair pair if they are less = lower and greater = upper
    //Only get the index of the number in question
    //https://leetcode.com/problems/count-the-number-of-fair-pairs/description/?envType=daily-question&envId=2025-04-19

    public long countFairPairs() {

//        int[] nums = {0,1,7,4,4,5};
//        int lower = 3;
//        int upper = 6;
        // // result -> 6

         int[] nums = {1,7,9,2,5};
         int lower = 11;
         int upper = 11;
        // result -> 1

        List<List<Integer>> fairPair = new ArrayList<>();
        long fairPairCount = -1;

        for (int i = 0; i < nums.length; i++) {
            int current = i;
            int j = 0;
            while(j < nums.length){

                int sum = nums[i] + nums[j];
                if(sum >= lower && sum <= upper){
                    List<Integer> newPair = new ArrayList<>();
                    newPair.add(current);
                    newPair.add(j);

                    List<Integer> reveresePair = new ArrayList<>();
                    reveresePair.add(current);
                    reveresePair.add(j);

                    Collections.reverse(reveresePair);

                    if(!fairPair.contains(reveresePair)){
                        fairPair.add(newPair);
                        j++;
                    } else {
                        j++;
                    }
                } else {
                    j++;
                }
            }
            current++;
        }
        fairPairCount = fairPair.size();
        System.out.println(fairPairCount);
        return fairPairCount;
    }

}

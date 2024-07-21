package org.example.codeClasses;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BiggestSum {

        public int bigSum(List<Integer> nums){

            int maxNum = 0;
            int highestValue = 0;
            Map<Integer,Integer> dups = new HashMap<>();

            for (int i = 0; i < nums.size(); i++) {
                if(nums.get(i) > highestValue){
                    highestValue = nums.get(i);
                }
            }

            System.out.println("highest Value recored : " + highestValue);

            int counter = 1;

            for (Integer element : nums) {
                Map<Integer, Integer> tracker = new HashMap<>();
                if(!dups.containsKey(element)){
                    dups.put(element, counter);
                    tracker.put(element, counter);
                }
                else if(dups.containsKey(element)){
                    int temp = dups.get(element) + 1;
                    dups.replace(element, temp);
                }
            }

            System.out.println(" dup list" + dups);

            for (int i = 0; i < nums.size(); i++) {
                if((dups.get(nums.get(i)) > 1)) {
                    int pairSum = highestValue + nums.get(i);
                    if(maxNum < pairSum){
                        maxNum = pairSum;
                        System.out.println("Max Updated : " + maxNum);
                    }
                }
                else if(highestValue == nums.get(i)){
                    System.out.println("Skipped and euqls ");
                } else {
                    int pairSum = highestValue + nums.get(i);
                    if(maxNum < pairSum){
                        maxNum = pairSum;
                        System.out.println("Max Updated : " + maxNum);
                    }
                }
            }
            System.out.println("Max " + maxNum);
            return maxNum;
    }
}

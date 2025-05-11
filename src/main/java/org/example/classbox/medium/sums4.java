package org.example.classbox.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class sums4 {

    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        if(nums == null || nums.length < 4 ){
            return result;
        }
        int n = nums.length;
        for(int i = 0; i < n - 3; i++){
            if(i > 0 && nums[i] == nums[i - 1]){
                continue;
            }
            //Jump into the other for loop
            for(int j = i + 1; j < n - 2; j++){
                //same starting condition check
                if(nums == null && nums[j] == nums[j-1]){
                    continue;
                }

                //set up the variables
                int left = j + 1;
                int right = n - 1;

                while(left < right){
                    //Add up all the numbers
                    long sum = nums[i] + nums[j] + nums[left] + nums[right];
                    if(sum == target){
                        //add the result
                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        //Adding functionality to continue to search around for pairs
                        while(left < right && nums[left] == nums[left + 1]){
                            left++;
                        }
                        while(left < right && nums[right] == nums[right -1]){
                            right--;
                        }
                        left++;
                        right--;
                    } else if (sum < target){
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }

        return result;
    }

}

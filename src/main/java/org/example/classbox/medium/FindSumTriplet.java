package org.example.classbox.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindSumTriplet {

    public List<List<Integer>> findTriplets(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            if(i >  0 && nums[i] == nums[i -1]){
                continue;
            }

            int l = i + 1;
            int r = nums.length -1;

            while(l < r){
                int sum = nums[i] + nums[l] + nums[r];
                if(sum == target){
                    //Achieved the answer -- but waiting to see if more results come up
                    result.add(Arrays.asList(nums[i], nums[l], nums[r]));

                    while( l < r && nums[l] == nums[l + 1]){
                        l++;
                    }
                    while(l < r && nums[r] == nums[r -1]){
                        r--;
                    }

                    l++;
                    r--;
                } else if (sum < target){
                    l++;
                } else {
                    r--;
                }
            }
        }
        System.out.println(result);
        return result;
    }

}

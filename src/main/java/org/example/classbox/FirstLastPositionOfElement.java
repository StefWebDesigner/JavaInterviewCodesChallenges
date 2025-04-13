package org.example.classbox;

import java.util.Arrays;

public class FirstLastPositionOfElement {

    public int[] searchRange() {
        int[] nums = {5,7,7,8,8,10};
        int target = 6;

        int[] result = new int[2];
        int start = -1;
        int end = -1;

        int index = 0;
        for(int element : nums){
            System.out.println("Current index is " + index);
            if(element == target && start == -1){
                start = index;
                System.out.println("start is " + start);
                index++;
            } else if (element == target && start != -1 && end == -1 ){
                end = index;
                System.out.println("end is " + end);
                index++;
            } else {
                index++;
            }
        }

        result[0] = start;
        result[1] = end;

        System.out.println(Arrays.toString(result));
        return result;
    }

}

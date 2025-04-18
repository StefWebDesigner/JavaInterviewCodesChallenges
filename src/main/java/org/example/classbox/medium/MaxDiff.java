package org.example.classbox.medium;

public class MaxDiff {

    public int maxDiff(int[] arr) {
        if(arr == null || arr.length < 2){
            return -1;
        }

        int maxDifference = -1;
        int minElement = arr[0];

        for(int i = 1; i < arr.length; i++){
            if(arr[i] > minElement){
                maxDifference = Math.max(maxDifference, arr[i] - minElement);
            } else {
                minElement = arr[i];
            }
        }

        return maxDifference;
    }

}

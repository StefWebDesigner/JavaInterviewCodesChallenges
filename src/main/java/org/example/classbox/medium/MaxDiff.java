package org.example.classbox.medium;

public class MaxDiff {

    public int maxDiff(int[] arr) {
        //check if its empty
        if(arr == null || arr.length < 2){
            return -1;
        }
        //check if its empty
        int maxDifference = -1;
        int minElement = arr[0];

        for(int i = 1; i < arr.length; i++){
            //Check if the current index has a larger number then the minElement
            if(arr[i] > minElement){
                //Use the Math.max calcuation to see if the a bigger difference
                maxDifference = Math.max(maxDifference, arr[i] - minElement);
            } else {
                //if its not bigger -> then add it as a bigger minElement
                minElement = arr[i];
            }
        }

        return maxDifference;
    }

}

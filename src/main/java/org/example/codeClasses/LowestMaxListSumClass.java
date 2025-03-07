package org.example.codeClasses;

import java.util.Collections;
import java.util.List;

public class LowestMaxListSumClass {

    public void miniMaxSum(List<Integer> arr) {
        // Sort the array to easily find the minimum and maximum sums
        Collections.sort(arr);
        // Initialize sums
        long minSum = 0;
        long maxSum = 0;
        // Calculate the minimum sum (sum of the first 4 elements)
        for (int i = 0; i < 4; i++) {
            minSum += arr.get(i);
        }
        // Calculate the maximum sum (sum of the last 4 elements)
        for (int i = arr.size() - 4; i < arr.size(); i++) {
            maxSum += arr.get(i);
        }
        // Print the results
        System.out.println(minSum + " " + maxSum);
    }



public void miniMaxSum2(List<Integer> arr) {

    int[] lowestToHighest = new int[arr.size()];
    int lowestSum = 0;
    int highestSum = 0;

    Integer counter = 0;
    for(Integer element : arr){
        if(counter != 5){
            lowestToHighest[counter] = arr.get(counter);
            counter++;
        }
    }

    for(int i = 0; i < lowestToHighest.length - 1; i++){
        for(int j = 0; j < lowestToHighest.length - 1; j++){
            if(lowestToHighest[j] > lowestToHighest[j+1]){
                int temp = lowestToHighest[j];
                lowestToHighest[j] = lowestToHighest[j+1];
                lowestToHighest[j+1] = temp;
            }
        }
    }

    int lowestSumming = 0;
    for (int i = 0; i < 4; i++) {
        lowestSumming += lowestToHighest[i];
    }
    lowestSum = lowestSumming;

    int highestSumming = 0;
    for (int i = arr.size() - 4; i < arr.size(); i++) {
        highestSumming = highestSumming + lowestToHighest[i];
    }

    highestSum = highestSumming;
    System.out.print(lowestSum + " " + highestSum);
}



}

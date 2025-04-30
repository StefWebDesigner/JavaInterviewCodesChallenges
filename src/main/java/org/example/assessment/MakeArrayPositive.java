package org.example.assessment;

import java.util.Arrays;
import java.util.List;

public class MakeArrayPositive {

//    https://leetcode.com/problems/minimum-value-to-get-positive-step-by-step-sum/
//Result should return the lowest sum from the array with each subarray pair is not less then 1
public Integer minPositiveArray() {
//    List<Integer> numbers = Arrays.asList(-3,2,-3,4,2); // 5
//    List<Integer> numbers = Arrays.asList(1,2); // 1
    List<Integer> numbers = Arrays.asList(1, -2, -3); // 5

    int minSum = 0;
    int currentSum = 0;

    for (int num : numbers) {
        currentSum += num;
        System.out.println("current sum : " + currentSum);
        minSum = Math.min(minSum, currentSum);
        System.out.println("min sum : " + minSum);
    }

    Integer result = Math.max(1, 1 - minSum);
    System.out.println(result);
    return result;
}





}

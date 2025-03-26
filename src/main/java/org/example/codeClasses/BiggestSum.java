package org.example.codeClasses;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BiggestSum {

    public int maxSumFromTwoPairs(List<Integer> numbers) {
        int maxSum = 0;
        int highestValue = 0;
        int otherPair = 0;
        Map<Integer, Integer> dups = new HashMap<>();

        for (Integer number : numbers) {
            if (highestValue < number) {
                highestValue = number;
                System.out.println("Highest Value is udpated to " + highestValue);
            }
        }

        System.out.println("Highest Value is " + highestValue);
        Integer counter = 1;
        for (Integer element : numbers) {
            if (!dups.containsKey(element)) {
                dups.put(element, counter);
            } else {
                Integer tempCounter = dups.get(element);
                dups.replace(element, tempCounter + 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : dups.entrySet()) {
            Integer evalSumPair = entry.getKey() + highestValue;
            if (entry.getKey() == highestValue) {
                System.out.println("Throwing this variable out");
            } else if (maxSum < evalSumPair) {
                maxSum = evalSumPair;
                otherPair = entry.getKey();
            } else {
                System.out.println(" Pair is to lower to be udpated");
            }
        }

        System.out.println("Other Pair is " + highestValue + " and " + otherPair);
        System.out.println(maxSum);
        return maxSum;
    }
}

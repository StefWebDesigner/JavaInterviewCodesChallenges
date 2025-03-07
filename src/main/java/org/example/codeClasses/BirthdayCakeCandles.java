package org.example.codeClasses;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BirthdayCakeCandles {

    //(Find the most reoccurring number and print it out of that amount)
    public Integer birthdayCakeCandles(List<Integer> candles) {
        Map<Integer, Integer> tracker = new HashMap<>();
        Integer counter = 1;
        Integer mostRoccuringNumber = 0;
        Integer mostRoccuringAmount = 0;
        for(Integer element : candles){
            if(!tracker.containsKey(element)){
                tracker.put(element, counter);
            } else {
                Integer temp = tracker.get(element) + 1;
                tracker.replace(element, temp);
            }
        }

        System.out.println(tracker);

        for(Map.Entry<Integer, Integer> element : tracker.entrySet()){
            if(element.getValue() > mostRoccuringAmount){
                mostRoccuringAmount = element.getValue();
                mostRoccuringNumber = element.getKey();
            }
        }

        System.out.println(mostRoccuringAmount);
        return mostRoccuringAmount;

    }

}

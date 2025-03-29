package org.example.practiceDemos;

import org.example.models.Employee;
import org.example.models.Orders;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class OutputReviewChallenges {


    public Integer findHighestValueMap(){
        Map<String, Integer> map = new HashMap<>();
        map.put("John", 1);
        map.put("Jane", 3);
        map.put("Jack", 1);

        String s = String::toLowerCase;

//        Optional<Map.Entry<String, Integer>> maxEntry = map.entrySet().stream()
//                .max(Map.Entry.comparingByValue());

        Optional<Integer> maxValue = map.entrySet().stream()
                .map(Map.Entry::getValue).max(Integer::compare);

//        System.out.println(maxEntry.get());
        System.out.println(maxValue);

        return maxValue.get();
    }






}


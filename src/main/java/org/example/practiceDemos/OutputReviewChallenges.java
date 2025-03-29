package org.example.practiceDemos;

import org.example.models.Employee;
import org.example.models.Orders;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OutputReviewChallenges {

    public Map<Character, Integer> stringToMap(){
        String word = "mmmooobbkkeeeyy";
        Stream<Character> characterStream = word.chars().mapToObj(c -> (char) c);
            Map<Character, Integer> map = characterStream
                .collect(Collectors.toMap(
                        //Key mapper
                        parts -> parts,
                        //Value Mapper
                        parts -> 1,
                        //Merging function to handle duplcate
                        (existingValue, newValue) -> existingValue + 1
                        ));

            System.out.println(map);
            return map;
}






}


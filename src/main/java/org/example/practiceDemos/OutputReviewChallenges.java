package org.example.practiceDemos;

import org.example.models.Orders;

import java.util.*;
import java.util.stream.Collectors;

public class OutputReviewChallenges {


    public Boolean isoString(String a, String b){
        char[] charA = a.toLowerCase().replaceAll(":\\s","").toCharArray();
        char[] charB = b.toLowerCase().replaceAll(":\\s","").toCharArray();

        if(charA.length != charB.length){
            return false;
        } else {
            Map<Character, Integer> map1 = new HashMap<>();
            Map<Character, Integer> map2 = new HashMap<>();

            //Remember ++i & i for the value
            for(int i = 0; i < charA.length; ++i){
                char element1 = charA[i];
                char element2 = charB[i];

                if(!map1.containsKey(element1)){
                    map1.put(element1, i);
                }

                if(!map2.containsKey(element2)){
                    map2.put(element2, i);
                }

                if(map1.get(element1) !=(map2.get(element2))){
                    System.out.println("false((((((");
                    return false;

                }
            }
            System.out.println("true((((((");
            return true;
        }


    }



}


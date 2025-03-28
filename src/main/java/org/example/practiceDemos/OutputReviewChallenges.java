package org.example.practiceDemos;

import org.example.models.Orders;

import java.util.*;
import java.util.stream.Collectors;

public class OutputReviewChallenges {

    public Boolean isIsomorphic(String word, String word1){
        if(word.length() != word1.length()){
            return false;
        } else {
            Map<Character, Integer> wordCha = new HashMap<>();
            Map<Character, Integer> word1Char = new HashMap<>();
            for(int i = 0; i < word.length(); ++i){
                if(!wordCha.containsKey(word.charAt(i))){
                    char element = word.charAt(i);
                    wordCha.put(element, i);
                }

                if(word1Char.containsKey(word1.charAt(i))){
                    char element = word1.charAt(i);
                    word1Char.put(element, i);
                }

                if (!wordCha.get(word.charAt(i)).equals(word1Char.get(word1.charAt(i)))) {
                    return false;
                }
            }

            return true;

        }
    }



}


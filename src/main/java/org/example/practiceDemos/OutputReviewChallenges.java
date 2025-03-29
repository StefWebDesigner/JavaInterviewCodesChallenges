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


public Character mostRepeatingCharacterStreams(){
        String words = "monkeydddLuffy";
        char mostUsedCharacter = 0;

        Stream<Character> wordstoCharStream = words.chars().mapToObj(c -> (char) c);
        Map<Character, Integer> dups = wordstoCharStream.collect(
                Collectors.toMap(
                        //keymapper
                        part -> part,
                        part -> 1,
                        (existingValue, newValue) -> existingValue + 1
                ));

        for (Map.Entry<Character, Integer> entry : dups.entrySet()) {
            if(entry.getValue() > mostUsedCharacter){
                mostUsedCharacter = entry.getKey();
            }
        }

    System.out.println(mostUsedCharacter);
        return mostUsedCharacter;


//    Optional<Map.Entry<Character, Integer>> maxEntry = dups.entrySet().stream()
//            .max(Map.Entry.comparingByValue());





//    mostUsedCharacter = words.chars().filter(Character::isAlphabetic).mapToObj(c -> (char) c).max(Comparator.naturalOrder()).get();

//    mostUsedCharacter = words.chars().filter(Character::isAlphabetic).mapToObj(c -> (char) c).max(Comparator.comparing(Map.Entry::getKey)).get();






}






}


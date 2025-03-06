package org.example.codeClasses;

import java.util.HashMap;
import java.util.Map;

public class MostReoccuringCharacter {

    public char recurringChar(String str) {

        char[] convertedString = str.toCharArray();
        Map<Character, Integer> newMap = new HashMap<>();
        int higheestValue = 0;
        char mostReocurringCharacger = 0;

        //Track all duplicates
        for(char element : convertedString){
            if(!newMap.containsKey(element)){
                int counter = 1;

                newMap.put(element, counter);
                System.out.println("new entry for element " + element);
            } else {
                int tempCounter = newMap.get(element) + 1;
                newMap.replace(element, tempCounter);
                System.out.println("already exisitng element for element " + element + " and counter " + tempCounter);
            }
        }

        for(Map.Entry<Character, Integer> entry : newMap.entrySet()){

            System.out.println("Checking for the entry value : " + entry.getValue());

            if(higheestValue < entry.getValue()){
                mostReocurringCharacger = entry.getKey();
                higheestValue = entry.getValue();
                System.out.println("Most Character udpated : " + mostReocurringCharacger);
            }
        }

        System.out.println("mostReocurringCharacger : " + mostReocurringCharacger);
        return mostReocurringCharacger;
    }

    public Character mostCharacter(String word){
        String wordCompiled = word.toLowerCase().replace("\\s", "");
        char[] charArrys = wordCompiled.toCharArray();
        Character highestChar = 0;
        Integer vistedCharCount = 0;

        Map<Character, Integer> duplicates = new HashMap<>();

        for(char c : charArrys){
            Integer counter = 1;
            if(!duplicates.containsKey(c)){
                duplicates.put(c, counter);
            } else {
                Integer added = duplicates.get(c) + 1;
                duplicates.replace(c, added);
            }
        }

        for(Map.Entry<Character, Integer> element : duplicates.entrySet()){
            if(vistedCharCount < element.getValue()){
                highestChar = element.getKey();
                vistedCharCount = element.getValue();
            }
        }

        System.out.println(highestChar);
        return highestChar;

    }



}

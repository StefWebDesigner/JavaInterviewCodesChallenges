package org.example.codeClasses;

import java.util.HashMap;
import java.util.Map;

public class MostReoccuringCharacter {

    public char recurringChar(String str) {

        char[] strConvetedChar = str.toCharArray();

        Map<String, Integer> charCounter = new HashMap<>();
        int counter = 1;

        for ( char element : strConvetedChar ) {
            Map<String, Integer> tracker = new HashMap<>();

            String entryConverted = Character.toString(element);

            if(!charCounter.containsKey(entryConverted)){

                charCounter.put(entryConverted, counter);
                tracker.put(entryConverted, counter);
            }
            else if(charCounter.containsKey(entryConverted)){
                int temp = charCounter.get(entryConverted) + 1;
                charCounter.replace(entryConverted, temp);
            }
        }

        int highestNum = 0;
        char[] mostCharOccurances  = new char[1];
        System.out.println("Map : " + charCounter);

        for ( Map.Entry<String, Integer> item : charCounter.entrySet()) {
            if(item.getValue() > highestNum){
                highestNum = item.getValue();
                mostCharOccurances = (item.getKey()).toCharArray();
            }
        }

        System.out.println( "highest number " + highestNum);

        char result = mostCharOccurances[0];
        System.out.println(" result : " + result);

        return result;
    }

}

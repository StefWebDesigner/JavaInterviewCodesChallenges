package org.example.classbox;

import java.util.*;

public class LetterCombinationPhoneNumber {

    public List<String> letterCombinations() {
        String digits = "239";
        String[] phoneMapping  = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        //Set up the variables
        List<String> result = new ArrayList<>();
        //Add an empty space in the result arraylist
        result.add("");

        //Loop & extract the digits of the number
        for(char digit : digits.toCharArray()){
            List<String> temp = new ArrayList<>();
            //Getting the letters from the phone by positoin of the digit
            String letters = phoneMapping[Character.getNumericValue(digit)];
            System.out.println("letters: " + letters);
            System.out.println("result" + result);

            // Mapping the response and adding it to temp to store the possible code combinations
            for (String s : result) {
                System.out.println("s: " + s);
                for (char c : letters.toCharArray()) {
                    temp.add(s + c);
                }
            }
            System.out.println( "temp: " + temp);
            result = temp;

        }

        return result;
    }










}

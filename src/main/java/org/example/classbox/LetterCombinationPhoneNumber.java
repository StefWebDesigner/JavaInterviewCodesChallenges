package org.example.classbox;

import java.util.*;

public class LetterCombinationPhoneNumber {

    public List<String> letterCombinations() {
        String digits = "239";
        String[] phoneMapping  = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> result = new ArrayList<>();

        result.add("");

        for(char digit : digits.toCharArray()){
            List<String> temp = new ArrayList<>();
            String letters = phoneMapping[digit-'0'];
            System.out.println("letters: " + letters);
            System.out.println("result" + result);

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

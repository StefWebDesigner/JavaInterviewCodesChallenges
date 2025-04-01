package org.example.classbox;

import java.util.Arrays;

public class LongestCommonPrefix {

    public String longestCommonPrefix() {
        String[] strs = {"flower", "flow", "flight"};
        String result = "";

        int numberOfStrings = strs.length;
        String firstWord = strs[0];
        //Handles the firstword
        //Index i handles collecting the string till it break
        for (int i = 0; i < firstWord.length(); ++i) {
            //This handles the entire String array
            for (int s = 1; s < numberOfStrings; ++s) {
                //Detects if the sequence has been broken, ties up the string, and returns
                if (strs[s].length() <= i || strs[s].charAt(i) != firstWord.charAt(i)) {
                    return firstWord.substring(0, i);
                }
            }
        }
        return firstWord;

    }


    }



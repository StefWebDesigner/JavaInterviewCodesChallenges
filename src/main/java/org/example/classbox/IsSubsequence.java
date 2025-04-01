package org.example.classbox;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IsSubsequence {
    //s = "abc", t = "ahbgdc"
    public boolean isSubsequenceReal(String word1, String word2) {
        int word1Index = 0;
        int word2Index = 0;

        while (word1Index < word1.length() && word2Index < word2.length()) {
            //check if they equal each other based on their char
            if (word1.charAt(word1Index) == word2.charAt(word2Index)) {
                word1Index++;
            }
            word2Index++;
        }

        //All the sub strings have been accounted for
        if(word1Index == word1.length()) {
            return true;
        } else {
            return false;
        }
    }
}

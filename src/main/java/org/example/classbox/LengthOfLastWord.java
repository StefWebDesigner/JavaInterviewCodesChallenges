package org.example.classbox;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        //Get the length of the string and have that be the end index
        int endIndex = s.length() - 1;
        //Checking for spaces backwards & find the end index
        while (endIndex >= 0 && s.charAt(endIndex) == ' ') {
            endIndex--;
        }
        int startIndex = endIndex;
        //This will find the first index
        while (startIndex >= 0 && s.charAt(startIndex) != ' ') {
            startIndex--;
        }
        return endIndex - startIndex;
        }



    public int lengthOfLastWordSimple(String s) {
        List<String> splitWordsArray = Arrays.asList(s.split(" "));
        System.out.println(splitWordsArray);
        int wordLength = splitWordsArray.get(0).length();
        return wordLength;
    }
}

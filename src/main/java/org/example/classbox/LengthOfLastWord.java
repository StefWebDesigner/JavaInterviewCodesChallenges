package org.example.classbox;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        int endIndex = s.length() - 1;
        while (endIndex >= 0 && s.charAt(endIndex) == ' ') {
            endIndex--;
        }
        int startIndex = endIndex;
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

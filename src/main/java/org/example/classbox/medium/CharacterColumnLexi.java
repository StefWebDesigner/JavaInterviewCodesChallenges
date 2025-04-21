package org.example.classbox.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CharacterColumnLexi {

    public String convert() {
        String [] strArray = {"abc", "def", "ghi", "adg", "beh", "cfi"};
        List<String> list = new ArrayList<>();
        String wordOne = "";
        String wordTwo = "";
        String wordThree = "";
        int averageWordLength = strArray[0].length() -1;

        int i =0;
        wordOne = stringPart(strArray, i);
        wordTwo = stringPart(strArray, i+1);
        wordThree = stringPart(strArray, i+2);
        list.add(wordOne);
        list.add(wordTwo);
        list.add(wordThree);

        System.out.println("word one :" + wordOne);
        System.out.println("word two : " + wordTwo);
        System.out.println("word three : " + wordThree);

        Collections.sort(list);
        String leastLexiString = list.get(0);

        System.out.println(leastLexiString);
        return leastLexiString;
    }

    public String stringPart(String[] strArray, int i){
        int counter = 0;
        int n = strArray.length - 1;
        String concatString = "";

        while(counter < n){
            String word = strArray[counter];
            concatString += word.charAt(i);
            counter++;
        }

        return concatString;
    }

}

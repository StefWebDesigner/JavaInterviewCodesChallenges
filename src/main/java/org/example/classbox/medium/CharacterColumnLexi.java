package org.example.classbox.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CharacterColumnLexi {

    //Convert the string array and create a new string array that uses the index of each of theses strings
    //Then, take lexigraphically find the shortest string

    public String convert() {
        //Set up the variable
        String [] strArray = {"abc", "def", "ghi", "adg", "beh", "cfi"};
        List<String> list = new ArrayList<>();
        String wordOne = "";
        String wordTwo = "";
        String wordThree = "";
        //Get the average length for each word
        int averageWordLength = strArray[0].length() -1;

        //Add the recrusive function to get the information
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

        // Sort the list
        Collections.sort(list);
        //Pick out the first string as the least lexi
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

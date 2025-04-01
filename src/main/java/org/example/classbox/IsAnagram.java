package org.example.classbox;

import java.time.temporal.ChronoField;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class IsAnagram {

    public Boolean isAnagramCollections(String stringOne, String stringTwo) {
        char[] strOneCompiled = stringOne.replaceAll(":\\s", "").toCharArray();
        char[] strTwoCompiled = stringTwo.replaceAll(":\\s", "").toCharArray();
        Boolean isAnagram = true;
        char[] sortedOne = Arrays.copyOf(strOneCompiled, strOneCompiled.length);
        char[] sortedTwo = Arrays.copyOf(strTwoCompiled, strTwoCompiled.length);

        if (strOneCompiled.length != strTwoCompiled.length) {
            System.out.println("False");
            isAnagram = false;
        } else {

            Arrays.sort(sortedOne);
            Arrays.sort(sortedTwo);

            isAnagram = Arrays.equals(sortedOne, sortedTwo);

            if (isAnagram) {
                System.out.println("The Results is true");
                return isAnagram;
            } else {
                System.out.println("The Results is false");
                return isAnagram;
            }

        }
        return isAnagram;
    }

    public void swapCharacters(int i, int j, char[] charArray) {
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
    }

    //Anagram calculator Code Challenge
    public Boolean isAnagram(String stringOne, String stringTwo) {
        String strOneCompiled = stringOne.replaceAll(":\\s", "");
        String strTwoCompiled = stringTwo.replaceAll(":\\s", "");
        Boolean isAnagram = true;

        if (strOneCompiled.length() != strTwoCompiled.length()) {
            System.out.println("False");
            isAnagram = false;
        } else {
            char[] stringOneCharArray = strOneCompiled.toLowerCase().toCharArray();
            char[] stringTwoCharArray = strTwoCompiled.toLowerCase().toCharArray();

            for (int i = 0; i < stringOneCharArray.length; i++) {
                for (int j = 0; j < stringOneCharArray.length; j++) {
                    if (Character.toLowerCase(stringOneCharArray[j]) > Character.toLowerCase(stringOneCharArray[i])) {
                        swapCharacters(i, j, stringOneCharArray);
                    }
                }
            }

            for (int i = 0; i < stringTwoCharArray.length; i++) {
                for (int j = 0; j < stringTwoCharArray.length; j++) {
                    if (Character.toLowerCase(stringTwoCharArray[j]) > Character.toLowerCase(stringTwoCharArray[i])) {
                        swapCharacters(i, j, stringTwoCharArray);
                    }
                }
            }

            isAnagram = Arrays.equals(stringOneCharArray, stringTwoCharArray);

            if (isAnagram) {
                System.out.println("The Results is true");
                return isAnagram;
            } else {
                System.out.println("The Results is false");
                return isAnagram;
            }

        }
        return isAnagram;
    }






}




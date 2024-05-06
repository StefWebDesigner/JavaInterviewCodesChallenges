package org.example.codeClasses;

import java.util.Arrays;

public class Anagram {

    public void swapCharacters(int i, int j, char[] charArray) {
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
    }

    //Anagram calculator Code Challenge
    public Boolean isAnagram(String stringOne, String stringTwo) {
        String strOneCompiled = stringOne.replaceAll("\\s", "");
        String strTwoCompiled = stringTwo.replaceAll("\\s", "");
        Boolean isAnagram = true;

        if (strOneCompiled.length() != strTwoCompiled.length()) {
            isAnagram = false;
        } else {
            char[] stringOneCharArray = strOneCompiled.toLowerCase().toCharArray();
            char[] stringTwoCharArray = strTwoCompiled.toLowerCase().toCharArray();

            for (int i = 0; i < stringOneCharArray.length; i++) {
                for (int j = i + 1; j < stringOneCharArray.length; j++) {
                    if (Character.toLowerCase(stringOneCharArray[j]) > Character.toLowerCase(stringOneCharArray[i])) {
                        swapCharacters(i, j, stringOneCharArray);
                    }
                }
            }

            for (int i = 0; i < stringTwoCharArray.length; i++) {
                for (int j = i + 1; j < stringTwoCharArray.length; j++) {
                    if (Character.toLowerCase(stringTwoCharArray[j]) > Character.toLowerCase(stringTwoCharArray[i])) {
                        swapCharacters(i, j, stringTwoCharArray);
                    }
                }
            }

            isAnagram = Arrays.equals(stringOneCharArray, stringTwoCharArray);

            if (isAnagram) {
                System.out.println("This is testing if the string is an anagram");
                System.out.println("String One Chararray is : " + String.valueOf(stringOneCharArray));
                System.out.println("String Two Chararray is : " + String.valueOf(stringTwoCharArray));
                System.out.println("The Results is true");
                return isAnagram;
            } else {
                System.out.println("This is testing if the string is an anagram");
                System.out.println("String One Chararray is : " + String.valueOf(stringOneCharArray));
                System.out.println("String Two Chararray is : " + String.valueOf(stringTwoCharArray));
                System.out.println("The Results is false");
                return isAnagram;
            }

        }

        System.out.println("This is testing if the string is an anagram");
        System.out.println("Result is true");
        return isAnagram;
    }
}

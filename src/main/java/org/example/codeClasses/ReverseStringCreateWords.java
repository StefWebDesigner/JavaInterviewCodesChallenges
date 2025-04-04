package org.example.codeClasses;

public class ReverseStringCreateWords {

    public String reverseWords(String s) {
       String[] stringArrary = s.split(" ");
       Integer index = stringArrary.length - 1;
       String reversedString = "";

        for (int i = stringArrary.length - 1; i >= 0; i--) {
            reversedString += stringArrary[i] + " ";
       }

        System.out.println(reversedString);
       return reversedString;
    }
}

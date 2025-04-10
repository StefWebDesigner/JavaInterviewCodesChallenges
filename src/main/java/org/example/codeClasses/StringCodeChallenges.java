package org.example.codeClasses;

import java.util.Arrays;
import java.util.List;

public class StringCodeChallenges {


    public void workingWithSubstrings(){
        String stringOne = "Stef the cool bro!";
        int stringSize = stringOne.length();


        String substringHalfExpression = stringOne.substring(0, (stringSize/2));
        System.out.println("Substrings with the first half of the expression : " + substringHalfExpression);

        String substtingUpperExpression = stringOne.substring(6, 18);
        System.out.println("Substring with the second half of the expression " + substtingUpperExpression);
    }

    public List<String> convertStringToArray(){
        String word = "java monkey Python";
        List<String> masterList = Arrays.asList(word.split(" "));
        System.out.println(masterList);
        return masterList;
    }

    public String encryptionCodeChallenge(String message, int shiftKey){
        message = message.toLowerCase();
        String result = "";
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        for(int i = 0; i < message.length(); i++){
            //I alwasy forget the indexOf
            int charPosition = alphabet.indexOf(message.charAt(i));
            int keyVal = (shiftKey + charPosition) % 26;
            // don't forget to make this char
            char replaceKey = alphabet.charAt(keyVal);
            result += replaceKey;
        }
        System.out.println("Encrypted message is : " + result);
        return result;
    }





}

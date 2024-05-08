package org.example.codeClasses;

public class StringCodeChallenges {


    public void workingWithSubstrings(){
        String stringOne = "Stef the cool bro!";
        int stringSize = stringOne.length();


        String substringHalfExpression = stringOne.substring(0, (stringSize/2));
        System.out.println("Substrings with the first half of the expression : " + substringHalfExpression);

        String substtingUpperExpression = stringOne.substring(6, 18);
        System.out.println("Substring with the second half of the expression " + substtingUpperExpression);
    }

    public String encryptionCodeChallenge(String message, int shiftKey){
        message = message.toLowerCase();
        String result = "";
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        for(int i = 0; i < message.length(); i++){
            int charPosition = alphabet.indexOf(message.charAt(i));
            int keyVal = (shiftKey + charPosition) % 26;
            char replaceKey = alphabet.charAt(keyVal);
            result += replaceKey;
        }
        System.out.println("Encrypted message is : " + result);
        return result;
    }



}

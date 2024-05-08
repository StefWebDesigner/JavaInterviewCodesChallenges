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

    public void encryptionCodeChallenge(){

    }



}

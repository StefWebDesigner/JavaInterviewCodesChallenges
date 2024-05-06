package org.example.codeClasses;

public class SortingAlgorithms {

    public void swapCharacters(int i, int j, char[] charArray){
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
    }

    //BubbleSorting Code Challenge
    public String bubbleSorting(String input){
        char[] charArray = input.toCharArray();

        for(int i = 0; i < charArray.length; i++){
            for(int j = i + 1; j < charArray.length; j++){
                if(Character.toLowerCase(charArray[j]) < Character.toLowerCase(charArray[i])){
                    swapCharacters(i, j, charArray);
                }
            }
        }
        String result = String.valueOf(charArray);
        System.out.println("This is the charList that is returned : " + String.valueOf(charArray));
        return result;
    }

}

package org.example;

import org.example.models.CustomerDTO;

import java.util.*;
import java.util.stream.Collectors;

public class PracticeCode {

    public void swapping(int i, int j, char[]arr){
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public  char[] sortingAlg(String word){

        int wordSize = word.length();
        char[] wordCharArray = word.toCharArray();

        for(int i = 0; i < wordCharArray.length; i++){
            for(int j = 0; j < wordCharArray.length; j++){
                if((Character.toLowerCase(wordCharArray[j])> (Character.toLowerCase(wordCharArray[i])))){
                    swapping(i, j, wordCharArray);
                }
            }
        }

        System.out.println("Word : " + word);
        System.out.println(Arrays.toString(wordCharArray));
        return wordCharArray;

    }








    public static void main(String[] args) {

//        CustomerDTO c1 = new CustomerDTO("Stefan", 1, "iPhone", 1000.00);
//        CustomerDTO c2 = new CustomerDTO("Puja", 2, "Samsung", 500.00);
//        CustomerDTO c3 = new CustomerDTO("Ona", 3, "Cricket", 100.00);
//
//        List<CustomerDTO> listOfClients = new ArrayList<>();
//        listOfClients.add(c1);
//        listOfClients.add(c2);
//        listOfClients.add(c3);



        PracticeCode practiceCode = new PracticeCode();
        String word = "hinnah";
        practiceCode.sortingAlg(word);

    }


    }

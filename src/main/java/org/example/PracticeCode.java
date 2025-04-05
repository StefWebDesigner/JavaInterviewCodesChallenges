package org.example;

import org.example.models.CustomerDTO;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

public class PracticeCode {


    public String revereArrayWords(String word){
        String[] wordArray = word.split(" ");
        String reversString = "";

        for(int i = wordArray.length - 1; i >= 0; i--) {
            reversString += reversString + wordArray[i] + " ";
        }
        return reversString;



    }


}

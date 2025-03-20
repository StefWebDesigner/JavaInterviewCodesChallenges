package org.example.practiceDemos;

import org.example.models.Orders;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class OutputReviewChallenges {

    public void fabianci(int n, int firstTerm, int secondTerm){
        System.out.println(n);
        for(int i = 1; i <=n; i++){
            System.out.println(firstTerm);
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }


}


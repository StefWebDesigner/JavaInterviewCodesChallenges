package org.example;

import org.example.models.CustomerDTO;

import java.util.*;
import java.util.stream.Collectors;

public class PracticeCode {

    public int partition (String[] a, int low, int high){
        String pivot = a[high];
        int i = low -1;
        for(int j = low; j < high; j++){
            if(a[j].compareTo(pivot) < 0){
                i++;
                String temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }

        String temp = a[i + 1];
        a[i + 1] = a[high];
        a[high] = temp;

        return i + 1;
    }

    public String[] quickSort(String[] a, int low, int high){
        if(low < high){
            int pi = partition(a, low, high);
            quickSort(a, low, pi - 1);
            quickSort(a, pi+1, high);
        }
        return a;
    }









}

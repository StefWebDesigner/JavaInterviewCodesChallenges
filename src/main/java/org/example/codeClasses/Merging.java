package org.example.codeClasses;

import java.util.Arrays;

public class Merging {

    public int[] mergeList(int [] arrayOne, int[] arrayTwo){
        int totalLength = arrayOne.length + arrayTwo.length;
        int position = 0;
        int[]  intMergeArray = new int[totalLength];
        int size = intMergeArray.length;

        for(int element : arrayOne){
            intMergeArray[position] = element;
            position++;
        }

        for(int elementTwo : arrayTwo){
            intMergeArray[position] = elementTwo;
            position++;
        }

        for(int i = 0; i < size - 1; i++){
            for(int j = 0; j < size - 1; j++){
                if(intMergeArray[j] > intMergeArray[j+1]){
                    int temp = intMergeArray[j];
                    intMergeArray[j] = intMergeArray[j+1];
                    intMergeArray[j+1] = temp;
                }
            }
        }

        System.out.println(" Looking at the merge List Test");
        System.out.println(Arrays.toString(intMergeArray));
        return intMergeArray;



    }








}

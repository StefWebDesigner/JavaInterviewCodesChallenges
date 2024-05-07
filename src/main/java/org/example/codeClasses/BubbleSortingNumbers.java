package org.example.codeClasses;

import java.util.Arrays;

public class BubbleSortingNumbers {

    public void numberBubbleSortingAsc (int [] numberArray){
        int size = numberArray.length;

        for(int i = 0; i < size -1;i++){
            for (int j = 0; j < size - i -1; j++) {
                if(numberArray[j] > numberArray[j+1]){
                    int temp = numberArray[j];
                    numberArray[j] = numberArray[j + 1];
                    numberArray[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted Array in Ascending Order : ");
        System.out.println(Arrays.toString(numberArray));
    }

    public void numberBubbleSortingDesc (int [] numberArray){
        int size = numberArray.length;

        for(int i = 0; i < size - i - 1; i++){
            for(int j = 0; j < size - i - 1; j++){
                if(numberArray[j] < numberArray[j + 1]){
                    int temp = numberArray[j];
                    numberArray[j] = numberArray[j + 1];
                    numberArray[j+1] = temp;
                }
            }
        }

        System.out.println("Sorted Array in Descending Order : ");
        System.out.printf(Arrays.toString(numberArray));
    }


}

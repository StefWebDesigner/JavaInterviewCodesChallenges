package org.example.codeClasses;

import java.util.Arrays;

public class PalidroneNumbers {

    public Boolean isPalidroneNumber(int[] arr){

        Boolean isPaldirone = false;
        int[] reverseArr = new int[arr.length];

        Integer position = 0;
        for(int i = arr.length - 1; i >= 0; i--)   {
            reverseArr[position] = arr[i];
            position++;
        }

        System.out.println("Reveresed Array : " + Arrays.toString(reverseArr));
        System.out.println(" Array : " + Arrays.toString(arr));

        isPaldirone =  Arrays.equals(arr, reverseArr);

        System.out.println(isPaldirone);
        return isPaldirone;

    }

}

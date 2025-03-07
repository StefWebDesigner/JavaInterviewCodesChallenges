package org.example.codeClasses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BubbleSortingArrayList {

    public void integerArrayListSort(List<Integer> arrayList) {

        int[] arr = new int[arrayList.size()];

            Integer counter = 0;
            for(Integer element : arr){
                arr[counter] = arrayList.get(counter);
                    counter++;
            }
            for(int i = 0; i < arr.length - 1; i++){
                for(int j = 0; j < arr.length - 1; j++){
                    if(arr[j] > arr[j+1]){
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                }
            }

        System.out.println("Sorted array convereted Array : " + Arrays.toString(arr));

    }

    public void arrayListSort(List<Integer> arrayList) {
        for (int i = 0; i < arrayList.size() -1; i++) {
            for (int j = 0; j < arrayList.size() - i - 1; j++) {
                if (arrayList.get(j) > arrayList.get(j+1)) {
                    int temp = arrayList.get(j);
                    arrayList.set(j, arrayList.get(j+1));
                    arrayList.set(j+1, temp);
                }
            }
        }

        System.out.println("Newest Sorted array convereted Array : " + arrayList);

    }


}

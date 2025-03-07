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

    //Merging with subArrays
    public void merging(){
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int m = 3;
        int n = 3;

        int counter = 0;
        int totalSize = m + n;
        int[] newArr = new int[totalSize];
        int[] revised1 = Arrays.copyOfRange(nums1, 0, 3);

        for(int element : revised1){
            newArr[counter] = element;
            counter++;
        }

        for(int element : nums2){
            newArr[counter] = element;
            counter++;
        }

        for (int i = 0; i < newArr.length -1 ; i++) {
            for (int j = 0; j < newArr.length -i -1; j++) {
                if(newArr[j] > newArr[j+1]){
                    int temp = newArr[j];
                    newArr[j] = newArr[j+1];
                    newArr[j+1] = temp;
                }
            }
        }



        System.out.println("Stuff + " + Arrays.toString(newArr));

    }


}

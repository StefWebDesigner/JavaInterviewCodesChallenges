package org.example.assessment;

public class BinarySearchInterationTerrible {

    public int binarySearch() {
        int[] array = {-1, 5, 6, 8, 9, 11, 14, 17, 18, 20};
        int target = -1;
        int[] result = new int[2];
        Boolean complete = false;
        int start = 0;
        int end = array.length - 1;
        int arraySize = array.length -1;

        while(!complete) {
            result = searchInteration(array, arraySize, target, start, end);
            if(result[1] == 0) {
                complete = true;
            } else {
                start = result[0];
                end = result[1];
                arraySize = end - start + 1;
                complete = false;
            }
        }

        int index = result[0];
        System.out.println(index);
        return index;
    }

    public int[] searchInteration(int[] array, int arraySize, int target, int start, int end) {
        int midIndex = ((arraySize - 1) / 2) + start;
        int middleNumber = array[midIndex];
        int diff = end - start;

        int[] result = new int[2];
        int x = 0;

        while(x == 0) {
            if(diff == 1) {
                result[0] = array.length - 1;
                x++;
            } else if(target == middleNumber) {
                result[0] = midIndex;
                x++;
            } else if(target > middleNumber) {
                start = midIndex + 1;
                result[0] = start - 1;
                result[1] = end;
                x++;
            } else {
                end = midIndex - 1;
                result[0] = start;
                result[1] = end;
                x++;
            }
        }


        System.out.println("Recursing : "  + result);
        return result;
    }
}

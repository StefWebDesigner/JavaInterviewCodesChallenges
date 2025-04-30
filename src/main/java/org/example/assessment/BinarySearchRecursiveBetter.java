package org.example.assessment;

public class BinarySearchRecursiveBetter {


//    int[] array = {-1, 5, 6, 8, 9, 11, 14, 17, 18, 20};
//    int l = 0;
//    int r = array.length - 1;
//    int target = 18;

    public int binarySearch(int[] array, int l, int r, int target) {


        if(r >= l && l <= array.length - 1) {
            int mid = l + (r - l) / 2;
            if(array[mid] == target){
                System.out.println(mid);
                return mid;
            }
            if(array[mid] > target) {
                int result = binarySearch(array, l, mid - 1, target);
                System.out.println(result);
                return result;
            } else {
                int result = binarySearch(array,  mid + 1, r, target);
                System.out.println(result);
                return result;
            }
        }
        return -1;
    }

//    public int[] searchInteration(int[] array, int arraySize, int target, int start, int end) {
//
//    }
}

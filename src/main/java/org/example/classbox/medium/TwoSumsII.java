package org.example.classbox.medium;

public class TwoSumsII {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length -1;
        int[] result = new int[2];

        while(left < right){
            int sum = numbers[left] + numbers[right];
            if(sum == target){
                result[0] = numbers[left];
                result[1] = numbers[right];
                return result;
            } else if(sum < target){
                left++;
            } else {
                right--;
            }
        }

        return new int[] {-1, -1};

    }
}

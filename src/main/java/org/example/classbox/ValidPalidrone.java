package org.example.classbox;

public class ValidPalidrone {

    public boolean isPalindrome(String word) {
        int low = 0;
        int high = word.length() - 1;

        while (low < high) {
            while (low < high && !Character.isLetterOrDigit(word.charAt(low))){
                ++low;
            }
            while (low < high && !Character.isLetterOrDigit(word.charAt(high))){
                --high;
            }
            if (Character.toLowerCase(word.charAt(low)) != Character.toLowerCase(word.charAt(high))){
                return false;
            }
            ++low;
            --high;
        }

        return true;
    }


}

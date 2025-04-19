package org.example.classbox.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Zigzag {

    public String convert(String s, int numRows) {
         if (numRows == 1) {
                System.out.print(s);
                return s;
         }
            char[] sCharArray = s.toCharArray();
          int n = s.length();

            String[] arr = new String[numRows];
            Arrays.fill(arr, "");

            int row = 0;
            boolean down = true;

            for (int i = 0; i < n; ++i) {
                arr[row] += (sCharArray[i]);

                if (row == numRows - 1) {
                    down = false;
                } else if (row == 0) {
                    down = true;
                }

                if (down) {
                    row++;
                } else {
                    row--;
                }
            }

            String result = "";
            for(String c : arr){
                result += c;
            }
        System.out.println(result);
            return result;
        }

}

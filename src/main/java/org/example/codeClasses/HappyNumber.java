package org.example.codeClasses;

public class HappyNumber {

    static boolean isHappynumber(int n)
    {
        int sum = n, x = n;

        // this loop executes till the sum of square of
        // digits obtained is not a single digit number
        while (sum > 9) {
            sum = 0;

            // this loop finds the sum of square of digits
            while (x > 0) {
                int d = x % 10;
                sum += d * d;
                x /= 10;
            }
            x = sum;
        }
        if (sum == 1 || sum == 7)
            return true;
        return false;
    }




}

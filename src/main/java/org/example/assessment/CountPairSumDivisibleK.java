package org.example.assessment;

public class CountPairSumDivisibleK {

    static int countKdivPairs(int[] A, int n, int K)
    {

        // variable for storing answer
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                // if pair sum is divisible
                if ((A[i] + A[j]) % K == 0)

                    // Increment count
                    count++;
            }
        }

        return count;
    }

}

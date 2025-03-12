package org.example.codeClasses;

import java.util.ArrayList;

public class TheStockSpan {

    static ArrayList<Integer> calculateSpan(int[] arr) {

        int n = arr.length;
        ArrayList<Integer> span = new ArrayList<>();

        // Initialize span list with 1s
        for (int i = 0; i < n; i++) {
            span.add(1);
        }

        // Calculate span for each day
        for (int i = 1; i < n; i++) {

            // Traverse left while arr[i] >= arr[j]
            for (int j = i - 1; j >= 0
                    && arr[i] >= arr[j]; j--) {

                span.set(i, span.get(i) + 1);
            }
        }

        return span;
    }


}

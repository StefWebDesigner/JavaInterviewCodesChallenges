package org.example.classbox.medium;

import java.util.Arrays;

public class RotateImageMatrix {

    public void rotate2(int[][] matrix) {
        int n = matrix.length;
        System.out.println(n);
        for (int i = 0; i < n / 2; ++i) {
            final int mx = n - i - 1;
            for (int j = i; j < mx; ++j) {
                final int offset = j - i;
                final int top = matrix[i][j];
                matrix[i][j] = matrix[mx - offset][i];
                matrix[mx - offset][i] = matrix[mx][mx - offset];
                matrix[mx][mx - offset] = matrix[j][mx];
                matrix[j][mx] = top;
            }
        }
        System.out.println(Arrays.deepToString(matrix));
    }

}

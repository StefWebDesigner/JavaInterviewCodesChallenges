package org.example.classbox.medium;

public class HopSkipJumpMatrix {

    public int hopSkipJump(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int row = 0, col = 0;
        int direction = 0; // 0: right, 1: down, 2: left, 3: up
        int lastVisited = matrix[0][0];
        boolean[][] visited = new boolean[rows][cols];
        visited[0][0] = true;

        int[] dr = {0, 1, 0, -1};
        int[] dc = {1, 0, -1, 0};

        for (int i = 0; i < rows * cols - 1; i++) {
            int moves = (i % 3) + 1;

            for (int j = 0; j < moves; j++) {
                int nextRow = row + dr[direction];
                int nextCol = col + dc[direction];

                if (nextRow >= 0 && nextRow < rows && nextCol >= 0 && nextCol < cols) {
                    row = nextRow;
                    col = nextCol;
                } else {
                    direction = (direction + 1) % 4;
                    break;
                }
            }
            if (!visited[row][col]) {
                lastVisited = matrix[row][col];
                visited[row][col] = true;
            }

        }
        return lastVisited;
    }

    public int hopSkipJumpAnother(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] dp = new int[n][m];

        // Base case
        dp[0][0] = 1;

        // Fill the first column
        for (int i = 1; i < n; i++) {
            dp[i][0] = dp[i - 1][0];
            if (i >= 2) {
                dp[i][0] += dp[i - 2][0];
            }
        }

        // Fill the first row
        for (int j = 1; j < m; j++) {
            dp[0][j] = dp[0][j - 1];
        }

        // Fill the rest of the matrix
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                if (i >= 2) {
                    dp[i][j] += dp[i - 2][j];
                }
            }
        }

        return dp[n - 1][m - 1];
    }


}

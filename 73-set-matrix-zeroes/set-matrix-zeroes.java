class Solution {
    public void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Create arrays to mark zero rows and columns
        boolean[] zeroRows = new boolean[rows];
        boolean[] zeroCols = new boolean[cols];

        // Identify zero rows and columns
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (matrix[row][col] == 0) {
                    zeroRows[row] = true;
                    zeroCols[col] = true;
                }
            }
        }

        // Set zero rows
        for (int row = 0; row < rows; row++) {
            if (zeroRows[row]) {
                for (int col = 0; col < cols; col++) {
                    matrix[row][col] = 0;
                }
            }
        }

        // Set zero columns
        for (int col = 0; col < cols; col++) {
            if (zeroCols[col]) {
                for (int row = 0; row < rows; row++) {
                    matrix[row][col] = 0;
                }
            }
        }
    }
}

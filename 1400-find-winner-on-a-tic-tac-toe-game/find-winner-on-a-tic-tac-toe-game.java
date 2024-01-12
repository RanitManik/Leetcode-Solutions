class Solution {
    public String tictactoe(int[][] moves) {
        int n = 3;
        char[][] grid = new char[n][n];

        // Fill the grid based on moves ==>
        for (int i = 0; i < moves.length; i++) {
            int row = moves[i][0];
            int col = moves[i][1];

            if (i % 2 == 0) {
                grid[row][col] = 'X';
            } else {
                grid[row][col] = 'O';
            }
        }
        // check for the winner ==>
        for (int i = 0; i < n; i++) {
            // Check rows
            if (grid[i][0] == grid[i][1] && grid[i][1] == grid[i][2] && grid[i][0] != '\0') {
                return grid[i][0] == 'X' ? "A" : "B";
            }

            // Check columns
            if (grid[0][i] == grid[1][i] && grid[1][i] == grid[2][i] && grid[0][i] != '\0') {
                return grid[0][i] == 'X' ? "A" : "B";
            }
        }

        // Check diagonals
        if (grid[0][0] == grid[1][1] && grid[1][1] == grid[2][2] && grid[0][0] != '\0') {
            return grid[0][0] == 'X' ? "A" : "B";
        }

        if (grid[0][2] == grid[1][1] && grid[1][1] == grid[2][0] && grid[0][2] != '\0') {
            return grid[0][2] == 'X' ? "A" : "B";
        }

        // Check if the game is pending or a draw
        if (moves.length < n * n) {
            return "Pending";
        } else {
            return "Draw";
        }
    }
}
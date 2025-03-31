class Solution {
    
    // Check if placing the number is safe
    public boolean isSafe(char[][] board, int row, int col, int number) {
        char numChar = (char) (number + '0');

        for (int i = 0; i < board.length; i++) {
            // Check row and column
            if (board[row][i] == numChar || board[i][col] == numChar) {
                return false;
            }
        }

        // Check 3x3 grid
        int startRow = 3 * (row / 3);
        int startCol = 3 * (col / 3);

        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (board[i][j] == numChar) {
                    return false;
                }
            }
        }

        return true;
    }

    // Recursive backtracking function
    private boolean solve(char[][] board, int row, int col) {
        if (row == board.length) {
            return true; // Solution found
        }

        int nextRow = (col == board.length - 1) ? row + 1 : row;
        int nextCol = (col == board.length - 1) ? 0 : col + 1;

        // If cell already filled, move to next cell
        if (board[row][col] != '.') {
            return solve(board, nextRow, nextCol);
        }

        // Try placing numbers 1-9
        for (int i = 1; i <= 9; i++) {
            if (isSafe(board, row, col, i)) {
                board[row][col] = (char) (i + '0');
                if (solve(board, nextRow, nextCol)) {
                    return true;
                }
                board[row][col] = '.'; // Backtrack
            }
        }

        return false;
    }

    // Solve Sudoku
    public void solveSudoku(char[][] board) {
        solve(board, 0, 0);
    }

    // Display Sudoku board
    public static void printBoard(char[][] board) {
        for (char[] row : board) {
            for (char cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }

    // Main method
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Sample input
        char[][] board = {
            {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
            {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
            {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
            {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
            {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
            {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
            {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
            {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
            {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        System.out.println("Sudoku Board before solving:");
        printBoard(board);

        solution.solveSudoku(board);

        System.out.println("\nSudoku Board after solving:");
        printBoard(board);
    }
}

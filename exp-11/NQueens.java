import java.util.*;

public class NQueens {

    static int solutionCount = 0;

    // Check if a queen can be safely placed at board[row][col]
    static boolean isSafe(int[][] board, int row, int col, int n) {
        // Check this row on the left side
        for (int i = 0; i < col; i++) {
            if (board[row][i] == 1) {
                return false;
            }
        }

        // Check upper diagonal on the left side
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        // Check lower diagonal on the left side
        for (int i = row, j = col; j >= 0 && i < n; i++, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        return true;
    }

    // Recursive backtracking function to solve N-Queens
    static void solveNQUtil(int[][] board, int col, int n) {
        // Base case: If all queens are placed, record and print the solution
        if (col >= n) {
            solutionCount++;
            printSolution(board, n);
            return;
        }

        // Try placing queen in all rows of this column
        for (int i = 0; i < n; i++) {
            if (isSafe(board, i, col, n)) {
                // Place queen
                board[i][col] = 1;

                // Recur to place rest of the queens
                solveNQUtil(board, col + 1, n);

                // Backtrack: Remove queen
                board[i][col] = 0;
            }
        }
    }

    // Print the chessboard arrangement
    static void printSolution(int[][] board, int n) {
        System.out.println("Solution " + solutionCount + ":");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 1) {
                    System.out.print(" Q ");
                } else {
                    System.out.print(" . ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    // Solves the N-Queens problem
    static void solveNQueens(int n) {
        int[][] board = new int[n][n];
        solutionCount = 0;

        solveNQUtil(board, 0, n);

        if (solutionCount == 0) {
            System.out.println("No solution exists for N = " + n);
        } else {
            System.out.println("Total solutions found for N = " + n + ": " + solutionCount);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of queens (N): ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid board size. N must be greater than 0.");
        } else {
            solveNQueens(n);
        }

        sc.close();
    }
}

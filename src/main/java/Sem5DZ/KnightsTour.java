package Sem5DZ;

import java.util.Scanner;

public class KnightsTour {
    private int[][] board;
    private int boardSize;
    private int[] moveRow = {2, 1, -1, -2, -2, -1, 1, 2};
    private int[] moveCol = {1, 2, 2, 1, -1, -2, -2, -1};

    public void solveTour(int size) {
        boardSize = size;
        board = new int[boardSize][boardSize];
        int moveNumber = 1;

        // Start the tour from the top-left corner
        int startRow = 0;
        int startCol = 0;
        board[startRow][startCol] = moveNumber;

        // Perform the depth-first search to find the knight's tour
        if (dfs(startRow, startCol, moveNumber + 1)) {
            printBoard();
        } else {
            System.out.println("No solution found!");
        }
    }

    private boolean isValidMove(int row, int col) {
        // Check if the move is within the board bounds and the cell is not visited
        return row >= 0 && row < boardSize && col >= 0 && col < boardSize && board[row][col] == 0;
    }

    private boolean dfs(int row, int col, int moveNumber) {
        if (moveNumber > boardSize * boardSize) {
            // All cells are visited, solution found
            return true;
        }

        // Try all possible moves from the current cell
        for (int i = 0; i < 8; i++) {
            int nextRow = row + moveRow[i];
            int nextCol = col + moveCol[i];

            if (isValidMove(nextRow, nextCol)) {
                board[nextRow][nextCol] = moveNumber;

                if (dfs(nextRow, nextCol, moveNumber + 1)) {
                    return true;
                }

                // Backtrack and undo the move
                board[nextRow][nextCol] = 0;
            }
        }

        return false; // No valid move found
    }

    private void printBoard() {
        for (int[] row : board) {
            for (int cell : row) {
                System.out.printf("%-4d", cell);
            }
            System.out.println();
        }
    }

    public static void runSem5DZ4() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the chessboard: ");
        int size = scanner.nextInt();

        KnightsTour knightsTour = new KnightsTour();
        knightsTour.solveTour(size);
    }
}


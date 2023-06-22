package Sem5DZ;

import java.util.ArrayList;
import java.util.List;

public class QueensSolver {
    private int boardSize;
    private int[][] board;
    private List<int[][]> solutions;

    public QueensSolver() {
        this.boardSize = 8; // Size of the chessboard
        this.board = new int[boardSize][boardSize];
        this.solutions = new ArrayList<>();
    }

    public void solveQueens() {
        placeQueen(0);
        printSolutions();
    }

    private void placeQueen(int column) {
        if (column == boardSize) {
            // All queens have been placed successfully, add the solution
            solutions.add(copyBoard());
            return;
        }

        for (int row = 0; row < boardSize; row++) {
            if (isSafe(row, column)) {
                // Place a queen at the current position
                board[row][column] = 1;

                // Move to the next column and place the next queen
                placeQueen(column + 1);

                // Backtrack and remove the queen from the current position
                board[row][column] = 0;
            }
        }
    }

    private boolean isSafe(int row, int column) {
        // Check if a queen can be placed at the given position without attacking other queens

        // Check if there is a queen in the same row
        for (int i = 0; i < column; i++) {
            if (board[row][i] == 1) {
                return false;
            }
        }

        // Check if there is a queen in the upper diagonal
        int i = row;
        int j = column;
        while (i >= 0 && j >= 0) {
            if (board[i][j] == 1) {
                return false;
            }
            i--;
            j--;
        }

        // Check if there is a queen in the lower diagonal
        i = row;
        j = column;
        while (i < boardSize && j >= 0) {
            if (board[i][j] == 1) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }

    private int[][] copyBoard() {
        // Create a copy of the current board
        int[][] copy = new int[boardSize][boardSize];
        for (int i = 0; i < boardSize; i++) {
            System.arraycopy(board[i], 0, copy[i], 0, boardSize);
        }
        return copy;
    }

    private void printSolutions() {
        System.out.println("Total solutions: " + solutions.size() + "\n");
        for (int[][] solution : solutions) {
            for (int[] row : solution) {
                for (int cell : row) {
                    System.out.print(cell == 1 ? "Q " : "- ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void runSem5DZ3() {
        QueensSolver solver = new QueensSolver();
        solver.solveQueens();
    }
}


import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        initializeTheGame(prepareBoard());

    }

    public static boolean isCellEmpty(String[][] board, int row, int col) {
        return board[row][col].equals("_");

    }

    public static void initializeTheGame(String[][] board) {
        final int NUMBER_OF_TURN = 9;
        boolean isXTurn = true;

        Scanner scanner = new Scanner(System.in);
        String coordinates;
        boolean isEmpty;
        boolean isWinner;
        int[] coordinatesFromInput;

        for (int i = 0; i < NUMBER_OF_TURN; i++) {
            System.out.println("\nIt is" + (isXTurn ? " X" : " Y") + " turn");
            System.out.println("Please enter the row THEN the column, each from 0,1, or 2, separated by a space");

            coordinates = scanner.nextLine();
            coordinatesFromInput = getCoordinates(coordinates);
            isEmpty = isCellEmpty(board, coordinatesFromInput[0], coordinatesFromInput[1]);

            // Loop until the user provides valid coordinates
            while (!isEmpty) {
                System.out.println("\nThis slot is not empty. Please enter valid coordinates.");
                coordinates = scanner.nextLine();
                coordinatesFromInput = getCoordinates(coordinates);
                isEmpty = isCellEmpty(board, coordinatesFromInput[0], coordinatesFromInput[1]);
            }

            // Update the board with "Y"
            board[coordinatesFromInput[0]][coordinatesFromInput[1]] = isXTurn ? "X" : "Y";

            printBoard(board); // Display the updated board
            isWinner = isPlayerWinTheGame(board, isXTurn ? "X" : "Y");

            if (isWinner) {
                System.out.println((isXTurn ? "\n X" : "\n Y") + " is the winner!");
                return;
            }
            isXTurn = !isXTurn; // Switch the turn
        } // end of for-loop
    }

    public static int[] getCoordinates(String coordinates) {
        int x = Integer.parseInt(coordinates.split(" ")[0]);
        int y = Integer.parseInt(coordinates.split(" ")[1]);
        return new int[]{Integer.parseInt(String.valueOf(x)), Integer.parseInt(String.valueOf(y))};
    }

    public static String[][] prepareBoard() {
        String[][] board = new String[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = "_";
            }
        }
        printBoard(board);

        return board;
    }

    public static void printBoard(String[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (j != 2) {
                    System.out.print(board[i][j] + " | ");
                } else {
                    System.out.print(board[i][j]);
                }
            }
            if (i != 2) {
                System.out.println();
                System.out.println("- - - - -");
            }
        }
    } // end of printBoard

    public static boolean isPlayerWinTheGame(String[][] board, String player) {
        // Check rows
        for (int i = 0; i < 3; i++) {
            if (board[i][0].equals(player) && board[i][1].equals(player) && board[i][2].equals(player)) {
                return true; // Player wins by row
            }
        }

        // Check columns
        for (int j = 0; j < 3; j++) {
            if (board[0][j].equals(player) && board[1][j].equals(player) && board[2][j].equals(player)) {
                return true; // Player wins by column
            }
        }

        // Check main diagonal
        if (board[0][0].equals(player) && board[1][1].equals(player) && board[2][2].equals(player)) {
            return true; // Player wins by main diagonal
        }

        // Check anti-diagonal
        return board[0][2].equals(player) && board[1][1].equals(player) && board[2][0].equals(player); // Player wins by anti-diagonal

        // If no win condition is met
    }
}

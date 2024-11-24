import java.util.Random;

public class FunWith2DArrays {
    public static void main(String[] args) {
// 2 row x 3 columns
        int[][] my2DArray = new int[2][3];
        fill2DArray(my2DArray);
        print2DArray(my2DArray);
        //after doubling
        twice2DArray(my2DArray);
        print2DArray(my2DArray);
    } // end main

    public static void fill2DArray(int[][] twoDArr) {
        Random rand = new Random();
        for (int i = 0; i < twoDArr.length; i++) {
            for (int j = 0; j < twoDArr[i].length; j++) {
                // row i, column j
                twoDArr[i][j] = rand.nextInt(100);
            }
        }

    } // end fill2DArray

    public static void print2DArray(int[][] twoDArr) {

        for (int[] arr : twoDArr) {
            for (int num : arr) {
                System.out.print(num + " ");
            } //  end of inner for loop
            System.out.println();
        }

    } // end print2DArray

    public static void twice2DArray(int[][] twoDArr) {
        for (int i = 0; i < twoDArr.length; i++) {
            for (int j = 0; j < twoDArr[i].length; j++) {
                twoDArr[i][j] *= 2;

            }

        }
//
//    } // end of twice2DArray
//    public static void twice2DArrayEnhanced(int[][] twoDArr) {
//        for (int[] row : twoDArr) {        // Enhanced for loop iterates over rows
//            for (int num : row) {         // Iterates over individual elements
//                num *= 2;                 // This modifies the copy of the value, not the original value
//            }
//        }
//    }

    }
}
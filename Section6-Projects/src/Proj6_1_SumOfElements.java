public class Proj6_1_SumOfElements {

    public static void main(String[] args) {
        int[][] myArrayForSum = new int[3][3];
        myArrayForSum[0][0] = 5;
        print2DArray(myArrayForSum);

        System.out.println("Sum is " + getSumOfTheArray( myArrayForSum));


    }

    public static void print2DArray(int[][] twoDArr) {

        for (int[] arr : twoDArr) {
            for (int num : arr) {
                System.out.print(num + " ");
            } //  end of inner for loop
            System.out.println();
        }

    } // end print2DArray

    public static int getSumOfTheArray(int[][] twoDArr) {
        int sum = 0;
        for (int[] arr : twoDArr) {
            for (int num : arr) {
                sum += num;
            }
        }
        return sum;
    }

}

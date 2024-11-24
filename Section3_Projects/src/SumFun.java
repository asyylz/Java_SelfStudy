import java.util.Scanner;

public class SumFun {
    public static void main(String[] args) {
        int number;
        int sum = 0;

        Scanner keyboard = new Scanner(System.in);

        do {

            System.out.println("Enter a number to sum ot negative number to exit.");
            number = keyboard.nextInt();
            if (number > 0) sum += number;
            System.out.println("The sum is: " + sum);

        } while (number > 0);

    } // end main
}


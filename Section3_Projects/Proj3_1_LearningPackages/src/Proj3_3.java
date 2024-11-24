import java.util.Random;
import java.util.Scanner;

public class Proj3_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int number = rand.nextInt(100) + 1;
        int guessNumber;
        System.out.println("Please enter the number  between 1 and 100: ");
        guessNumber = input.nextInt();
        do {
            if (guessNumber > 0 && guessNumber <= 100) {

                if (guessNumber == number) {
                    System.out.println("You have  got it !");
                } else if (guessNumber > number) {
                    System.out.println("You entered high !");
                    System.out.println("Please enter the number between 1 and 100 again: ");
                    guessNumber = input.nextInt();
                } else {
                    System.out.println("You entered low!");
                    System.out.println("Please enter the number between 1 and 100 again: ");
                    guessNumber = input.nextInt();
                }
            } else {

                System.out.println("Invalid input number");
                System.out.println("Please enter the number between 1 and 100 again: ");
                guessNumber = input.nextInt();

            } // end if

        } while (number != guessNumber);

        System.out.println("You got it !  Number is " + number);
    }
}

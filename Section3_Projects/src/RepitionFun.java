import java.util.Scanner;

public class RepitionFun {
    public static void main(String[] args) {
        int input;
        Scanner keyboard = new Scanner(System.in);
        // priming read
        System.out.println("Enter a non-negative integer");
        System.out.println("Or negative number to exit.");  // sentinel value here is negative value
        input = keyboard.nextInt();

        while(input >= 0) {
            System.out.println(input);
            System.out.println("Enter a non-negative integer");
            System.out.println("Or negative number to exit.");
            input = keyboard.nextInt();

        } // end while

        System.out.println("Program exited.");
//        int count = 0;
//        while (count < 10) {
//            System.out.println(count);
//            count++;
//        }

//        int count2 = 15;
//        do {
//            System.out.println(count2);
//            count2++;
//        } while (count2 < 10);


//        for (int i = 0; i < 10; i++) {
//            System.out.println(i);
//        }


    } // end main
}

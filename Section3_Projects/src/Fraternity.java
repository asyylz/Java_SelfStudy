import java.util.Scanner;

public class Fraternity {

    public static void main(String[] args) {

        int age;
        char gender;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age: ");
        age = input.nextInt();

        System.out.println("Enter your gender: ");
        gender = input.next().charAt(0);
        System.out.println("Your gender is " + gender);

        switch (gender) {
            case 'M': {
                if (age >= 19) {
                    System.out.println("You are  eligible for fraternity.");
                }
            }
            break;
            case 'F': {
                System.out.println("You are not eligible for fraternity as a female.");
            }
            break;
            default:
                System.out.println("You are not eligible for fraternity.");
        } // end switch
    } // end main
}

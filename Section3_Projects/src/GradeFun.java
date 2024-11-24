import java.util.Scanner;

public class GradeFun {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char grade;
        System.out.println("Enter the grade: ");
        grade = input.next().charAt(0); // Reads the first character of the input
        switch (grade) {
            case 'A':
            case 'a':
                System.out.println("Great job!");
                break;
            case 'B':
            case 'b':
                System.out.println("Good job!");
                break;
            case 'C':
            case 'c':
                System.out.println("You can do better!");
                break;
            case 'D':
            case 'd':
                System.out.println("You are getting pretty close to failing!");
                break;
            case 'F':
            case 'f':
                System.out.println("You are failing the course!");
                break;
            default:
                System.out.println("Invalid grade!");
        } // end switch
    } // end main
}

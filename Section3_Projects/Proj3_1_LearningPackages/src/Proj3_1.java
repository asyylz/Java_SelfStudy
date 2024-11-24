import java.util.Scanner;

public class Proj3_1 {

    public static void main(String[] args) {

        Scanner  input = new Scanner(System.in);

        int option;
        int numberOfCourses;
        int total;
        System.out.println("Please enter the package : ");
        option = input.nextInt();

        System.out.println("Please enter the number of courses : ");
        numberOfCourses = input.nextInt();

        switch(option){
            case 1: {
                total = 10 + ((numberOfCourses - 2) * 6);
                System.out.println("Total of " + numberOfCourses + " courses is $" + total);
                break;
            }
            case 2: {
                total = 12 + ((numberOfCourses - 4) * 4);
                System.out.println("Total of " + numberOfCourses + " courses is $" + total);
                break;
            }
            case 3: {
                total = 15 + ((numberOfCourses - 6) * 3);
                System.out.println("Total of " + numberOfCourses + " courses is $ " + total);
                break;
            }
        } // end switch

    } // end main
}

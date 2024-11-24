
import java.util.Scanner;

public class NameParser {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Please enter you full name : ");
        String input = scanner.nextLine();
        int spaceIndex = input.indexOf(" ");
        String firstName = input.substring(0, spaceIndex);
        String lastName = input.substring(spaceIndex +1);
        System.out.println(spaceIndex);
        System.out.println(firstName.toUpperCase());
        System.out.println(lastName.toLowerCase());


    }
}

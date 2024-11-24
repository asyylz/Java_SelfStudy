import java.util.ArrayList;
import java.util.Scanner;

public class Proj5_1_NamePermutations {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<String> nameList = new ArrayList<>();
        ArrayList<String> surnameList = new ArrayList<>();

        for (int i = 0; i < 5; i++) {

            System.out.print("Please enter " + (i + 1) + ". full name : ");
            String fullName = input.nextLine();

            int index = fullName.lastIndexOf(" ");
            String firstName = fullName.substring(0, index);
            String lastName = fullName.substring(index + 1);
            nameList.add(firstName);
            surnameList.add(lastName);

        } //  end for-loop

        System.out.println(nameList);
        System.out.println(surnameList);

        // permutation

        for( String name : nameList ) {
            for( String surname : surnameList ) {
                System.out.println(name + " " + surname);
            }
        }

    } // end main


}

import java.util.ArrayList;
import java.util.Scanner;

public class Proj4_3_Parallel {
    public static void main(String[] args) {
        ArrayList<Integer> ages = new ArrayList<>();
        ArrayList<String> names = new ArrayList<>();


        Scanner sc = new Scanner(System.in);
        int age;
        String name;

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a name: ");
            name = sc.nextLine();
            names.add(name);
            System.out.print("Enter an age: ");
            age = sc.nextInt();
            sc.nextLine();
            ages.add(age);

        }

        for (int i = 0; i < ages.size(); i++) {
            System.out.println(names.get(i) + " is " + ages.get(i) + " years old");
        }

    }
}

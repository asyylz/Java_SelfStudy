public class ControlStatementsIntro {
    public static void main(String[] args) {

        // sequential statements
        // selection (decision) statements
        // repetition (loops) statements

        int age = 15;
        System.out.println(age);

        if (age >= 16) {
            System.out.println("You can drive.");
        } else {
            System.out.println("You can't drive!");
        }
        for (int i = 1; i <= age; i++) {
            System.out.println("Happy Birthday " + i);

        }

    } // end main
}

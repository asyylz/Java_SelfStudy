import java.util.Random;

public class DiceSimulation {

    public static void main(String[] args) {
        Random random = new Random();

        for (int i = 1; i <= 10; i++) {
            int dice;
            dice = random.nextInt(6) + 1;
            System.out.println(i + ". roll is " + dice);

        } // end loop
    } // end main
}


import java.util.Random;

public class RandomFun {
    public static void main(String[] args) {
        Random rand = new Random();
        int myRandomNumber;
        myRandomNumber = rand.nextInt();
        System.out.println("Number is:\t"+ myRandomNumber);

        myRandomNumber = rand.nextInt(1000); // 0 - 999
        System.out.println("myRandomNumber through 999 \t: " + myRandomNumber);

        // shifting
        myRandomNumber = rand.nextInt(1000) + 1; // 1 - 1000
        System.out.println("myRandomNumber through 1000 \t: " + myRandomNumber);


    } // end main
}

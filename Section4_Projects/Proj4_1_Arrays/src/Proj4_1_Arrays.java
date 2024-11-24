import java.util.ArrayList;
import java.util.Scanner;

public class Proj4_1_Arrays {
    public static void main(String[] args) {

        //int[] myArray;
       // myArray = new int[10];
        int sizeOfTheArray;
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        sizeOfTheArray = input.nextInt();

        for (int i = 0; i < sizeOfTheArray; i++) {
            System.out.println("Enter the " + (i + 1) + ". element of the array: ");
            arrayList.add(input.nextInt());


        }

        System.out.println("You created this array" + arrayList);

//        for (int i = 0; i <arrayList.size(); i++) {
//            System.out.println(arrayList.get(i));
//        }

        for (Integer integer : arrayList) {
            System.out.println(integer * 2);
        }
    }
}

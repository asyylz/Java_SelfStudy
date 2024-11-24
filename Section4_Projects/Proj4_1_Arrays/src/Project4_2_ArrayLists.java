import java.util.ArrayList;
import java.util.Scanner;

//public class Project4_2_ArrayLists {
//    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>();
//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Please enter a number:");
//        int number = input.nextInt();
//
//        while (number > 0) {
//            list.add(number);
//            System.out.print("Please enter another number:");
//            number = input.nextInt();
//        }
//
//        System.out.println(list.reversed());
//
//    } // end main
//}

public class Project4_2_ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a number:");
        int number = input.nextInt();

        while (number >= 0) {
            list.add(number);
            System.out.print("Please enter another number:");
            number = input.nextInt();
        }

      for (int i = list.size() -1 ; i >=0; i--) {
          System.out.print(list.get(i) + " ");
      }

    } // end main
}
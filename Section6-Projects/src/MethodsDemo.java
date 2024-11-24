public class MethodsDemo {
    public static void main(String[] args) {
        printHello();
        printNumber(10);
        double dResult;
        int result = giveMe10();
        System.out.println(result);

        result = addThese(3, 5);
        System.out.println(result);

        dResult = square(3);
        System.out.println(dResult);


    } // end main

    public static void printHello() {
        System.out.println("hello there");
    }

    public static void printNumber(int a) {
        System.out.println("There number is " + a);

    }

    public static int giveMe10() {
        return 10;
    }

    public static int addThese(int a, int b) {
        return a + b;
    }

    public static double square(double a) {
        return a * a;
    }
}

// static mean method belongs to class, not to a specific object
public class MethodCalls {
    public static void main(String[] args) {
        doSomething();
    } // end main

    public static void doSomething() {
        System.out.println("In do something");
        int result = getSomeValue();
        System.out.println("Result: " + result);
    }

    public static int getSomeValue() {
        return 150;
    }
}

public class StringMethods2 {
    public static void main(String[] args) {
        String myName = "Asiye Yaliz";

        String upper = myName.toUpperCase();
        String lower = myName.toLowerCase();

        int whereIsY = myName.indexOf("Y");

        String lastName = myName.substring(6);

        System.out.println("Upper is " + upper);
        System.out.println("Lower is " + lower);
        System.out.println("Last name is " + lastName);
        System.out.println("Where is Y is " + whereIsY);

    } //  end main
}

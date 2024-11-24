public class StringMethods1 {
    public static void main(String[] args) {
        String name = "John Baugh";
        String name2 = "John Baugh";
        String name3 = "Rob Pervical";
        String challengeName= "Ed Mortram";

        for (int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i) + " ");

        } //  end for
        System.out.println();

        if (name.equals(name2)) { // // true (value-based equality)
            System.out.println("Names are equal.");
        } else {
            System.out.println("Names are not equal.");
        }
        if(name.compareTo(name3) > 0) { //  lexicographically greater than the name
            System.out.println("name > name3");
        }else {
            System.out.println("name <= name3");
        }

        System.out.println("Comparing for the challenge name");
        if(challengeName.compareTo(name) > 0) {
            System.out.println("challengeName > name");
        }else{
            System.out.println("challengeName <= name");
        }
    } // end main
}

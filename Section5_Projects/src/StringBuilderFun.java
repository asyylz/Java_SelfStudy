public class StringBuilderFun {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Asiye Yaliz");

        sb.append(" is awesome.");
        System.out.println(sb);
         sb.insert(5," Serife");

        System.out.println(sb);

        sb.replace( 22,29, "amazing");
        System.out.println(sb);

        sb.delete(6,13);

        System.out.println(sb);

        sb.replace(0,6,"Dr.");

        System.out.println(sb);
    } // end main
}

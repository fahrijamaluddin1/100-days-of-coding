public class Day21 {
    public static void main(String[] args) {

        String angka = "100";
        String desimal = "25.5";
        String benar = "true";

        // String → int
        int a = Integer.parseInt(angka);

        // String → double
        double b = Double.parseDouble(desimal);

        // String → boolean
        boolean c = Boolean.parseBoolean(benar);

        System.out.println("Nilai int: " + a);
        System.out.println("Nilai double: " + b);
        System.out.println("Nilai boolean: " + c);
    }
}

public class Hari16_Modulus {
    public static void main(String[] args) {
        int a = 20;
        int b = 6;

        int sisaBagi = a % b;
        System.out.println("Sisa bagi " + a + " % " + b + " = " + sisaBagi);
        // 20 dibagi 6 = 3 sisa 2, jadi hasilnya 2

        System.out.println("10 % 3 = " + (10 % 3)); // sisa 1
        System.out.println("9 % 3 = " + (9 % 3));   // sisa 0 (habis dibagi)

        double x = 7.5;
        double y = 2.0;
        System.out.println("7.5 % 2.0 = " + (x % y));

        int angka = 15;
        boolean isGenap = (angka % 2 == 0);
        System.out.println(angka + " genap? " + isGenap);
    }
                           }

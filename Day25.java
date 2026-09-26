import java.util.Scanner;

public class Day25 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        System.out.print("Masukkan jari-jari : ");
        String input = a.nextLine();

        int jariBulat = Integer.parseInt(input);
        double jari = (double) jariBulat;

        final double PI = 3.14;

        double hasil = PI * jari * jari;

        hasil = hasil - (hasil * 2);

        String output = String.valueOf(hasil);

        System.out.printf("Luas lingkaran : %s%n", output);
    }
}

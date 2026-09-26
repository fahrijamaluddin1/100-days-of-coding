import java.util.Scanner;

public class Day25 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Masukkan jari-jari : ");
        double jari = a.nextDouble();

        double hasil = (Math.PI * jari* jari);
System.out.println("luas lingkaran : " +hasil);
    }
}

import java.util.Scanner;

public class Day41{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int angka = input.nextInt();

        if (angka < -100 || angka > 100) {
            System.out.println("Angka di luar jangkauan (-100 s.d. 100)");
        } else if (angka == 0) {
            System.out.println("Bilangan Netral (Nol)");
        } else {
            String jenis = (angka > 0) ? "Positif" : "Negatif";
            String angka2 = (angka % 2 == 0) ? "Genap" : "Ganjil";
            System.out.println("Bilangan " + jenis + " - " + angka2);
        }
        }
}

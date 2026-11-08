import java.util.Scanner;

public class Day69 {
    public static void main(String[] args) {
        Scanner z = new Scanner (System.in);
        System.out.print("Masukkan panjang: ");
        int panjang = z.nextInt(); 
        System.out.print("Masukkan lebar: ");
        int lebar = z.nextInt();
        for (int baris = 1; baris < lebar; baris++) {
            for (int kolom  = 0; kolom < panjang; kolom++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }}

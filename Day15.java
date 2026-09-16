import java.util.Scanner;

public class Day15 {
    public static void main(String[] args) {
        Scanner a =new Scanner(System.in);
        System.out.println("Masukkan Nilai A:");
        int NilaiA  = a.nextInt();
        System.out.println("Masukkan Nilai B:");
        int NilaiB = a.nextInt();

        int HasilPerkalian = NilaiA * NilaiB; 
        int HasilPembagian = NilaiA / NilaiB;

        System.out.println("Hasil Perkalian (A * B)"+ HasilPerkalian);
             System.out.println("Hasil Pembagian (A / B)"+ HasilPembagian);


    }
}

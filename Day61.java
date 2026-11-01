import java.util.Scanner;

public class Day61 {
    public static void main(String[] args) {
        Scanner z = new Scanner (System.in);
        System.out.print("Masukkan  angka: ");
        int angka = z.nextInt();
        int total = 1;
        for (int i = 1; i <= angka; i++) {
            total *= i;
        }
            System.out.print("Hasil perkalian angka 1sampai  "+angka+ " = "+ total);
            
        
    }
}

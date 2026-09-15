import java.util.Scanner;

public class Day14 {
public static void main(String[] args) {
    

        Scanner a = new Scanner(System.in);

        System.out.print("Masukkan nilai A: ");
        int nilaiA = a.nextInt();

        System.out.print("Masukkan nilai B: ");
        int nilaiB = a.nextInt();

        int hasilTambah = nilaiA + nilaiB;
        int hasilKurang = nilaiA - nilaiB;

        System.out.println("Hasil Penjumlahan (A + B): " + hasilTambah);
        System.out.println("Hasil Pengurangan (A - B): " + hasilKurang);

    }

          }

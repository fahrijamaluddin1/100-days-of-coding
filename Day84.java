import java.util.Scanner;

public class Day84 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array: ");
        int n = input.nextInt();

        int[] angka = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            angka[i] = input.nextInt();
        }

        int maks = angka[0];

        for (int i = 1; i < angka.length; i++) {
            if (angka[i] > maks) {
                maks = angka[i];
            }
        }

        System.out.println("Angka maksimal: " + maks);

    }
          }

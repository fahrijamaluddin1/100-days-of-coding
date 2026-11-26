import java.util.Scanner;

public class Day86{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array: ");
        int n = input.nextInt();

        int[] angka = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            angka[i] = input.nextInt();
        }

        System.out.print("Masukkan angka yang dicari: ");
        int cari = input.nextInt();

        boolean ketemu = false;
        int indeks = -1;

        for (int i = 0; i < angka.length; i++) {
            if (angka[i] == cari) {
                ketemu = true;
                indeks = i;
                break;
            }
        }

        if (ketemu) {
            System.out.println("Angka " + cari + " ditemukan pada indeks ke-" + indeks);
        } else {
            System.out.println("Angka " + cari + " tidak ditemukan");
        }

    }
}

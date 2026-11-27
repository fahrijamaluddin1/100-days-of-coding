import java.util.Scanner;

public class Day87 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array: ");
        int n = input.nextInt();

        int[] angka = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            angka[i] = input.nextInt();
        }

        System.out.print("Masukkan indeks yang ingin diubah: ");
        int indeks = input.nextInt();

        if (indeks >= 0 && indeks < angka.length) {
            System.out.print("Masukkan nilai baru: ");
            angka[indeks] = input.nextInt();
        } else {
            System.out.println("Indeks tidak valid");
        }

        System.out.println("Isi array sekarang:");
        for (int i = 0; i < angka.length; i++) {
            System.out.println("angka[" + i + "] = " + angka[i]);
        }

    }
                                    }

import java.util.Scanner;

public class Day81 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array: ");
        int n = input.nextInt();

        int[] angka = new int[n];

        for (int i = 0; i < angka.length; i++) {
            System.out.print("Masukkan elemen ke-" + (i + 1) + ": ");
            angka[i] = input.nextInt();
        }

        System.out.println("\nIsi array:");
        for (int i = 0; i < angka.length; i++) {
            System.out.println("angka[" + i + "] = " + angka[i]);
        }
        }
}

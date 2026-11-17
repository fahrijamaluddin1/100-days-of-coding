import java.util.Scanner;

public class Day77 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan sebuah kalimat: ");
        String kalimat = input.nextLine();

        System.out.println("\n=== Method Dasar ===");
        System.out.println("Panjang karakter : " + kalimat.length());
        System.out.println("Huruf besar      : " + kalimat.toUpperCase());
        System.out.println("Huruf kecil      : " + kalimat.toLowerCase());

        System.out.println("\n=== Method Pengecekan ===");
        System.out.println("Kosong?          : " + kalimat.isEmpty());

        System.out.print("Masukkan kata yang dicari: ");
        String cari = input.nextLine();
        System.out.println("Mengandung \"" + cari + "\"? " + kalimat.contains(cari));

        System.out.print("Ketik kata 'java' untuk dicocokkan: ");
        String tebakan = input.nextLine();
        System.out.println("equals           : " + tebakan.equals("java"));
        System.out.println("equalsIgnoreCase : " + tebakan.equalsIgnoreCase("java"));

        System.out.println("\n=== Method Manipulasi ===");
        System.out.println("Setelah trim()   : [" + kalimat.trim() + "]");
        System.out.println("5 karakter awal  : " + kalimat.trim().substring(0, Math.min(5, kalimat.trim().length())));

        System.out.print("Kata yang diganti: ");
        String lama = input.nextLine();
        System.out.print("Diganti dengan   : ");
        String baru = input.nextLine();
        System.out.println("Hasil replace()  : " + kalimat.replace(lama, baru));

    }
}

import java.util.Scanner;

public class Day31 {
    public static void main(String[] args) {
        Scanner z = new Scanner (System.in);
        System.out.print("Masukkan nilai akhir : ");
        int nilai = z.nextInt();
        System.out.print("Masukkan Kehadiran :");
        int kehadiran = z.nextInt();

        boolean lulus = nilai >= 70 && kehadiran >= 75;
        boolean peringatan = nilai <=60 || kehadiran <50;
        boolean tidaklulus = !lulus;

        System.out.println("Lulus :"+lulus);
        System.out.println("Peringatan : "+peringatan);
        System.out.println("Tidak Lulus : "+tidaklulus);
    }
  }

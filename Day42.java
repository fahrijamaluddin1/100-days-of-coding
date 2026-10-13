import java.util.Scanner;

public class Day42 {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);

        System.out.print("Masukkan gaji pokok: ");
        double gajiPokok = z.nextDouble();

        double tunjangan = gajiPokok * 0.10;
        double gajiKotor = gajiPokok + tunjangan;

        double persenPajak;
        if (gajiKotor <= 5000000) {
            persenPajak = 0.05;
        } else if (gajiKotor <= 10000000) {
            persenPajak = 0.10;
        } else {
            persenPajak = 0.15;
        }

        double pajak = gajiKotor * persenPajak;
        double gajiBersih = gajiKotor - pajak;

        System.out.println("Tunjangan  : Rp" + tunjangan);
        System.out.println("Gaji Kotor : Rp" + gajiKotor);
        System.out.println("Pajak      : Rp" + pajak);
        System.out.println("Gaji Bersih: Rp" + gajiBersih);
    }
          }

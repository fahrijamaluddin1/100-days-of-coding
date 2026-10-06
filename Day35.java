import java.util.Scanner;

public class Day35 {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        System.out.print("Masukkan Umur : ");
        int umur = z.nextInt();
        System.out.println("Sudah punya KTP? : ");
        boolean punyaKTP = z.nextBoolean();


        if (umur >= 17) {
            if (punyaKTP) {
                System.out.println("Boleh membuat SIM.");
            } else {
                System.out.println("Buat KTP dulu.");
            }
        } else {
            System.out.println("Belum cukup umur.");
        }
    }
        }

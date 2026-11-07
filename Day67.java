import java.util.Scanner;

public class Day67 {

    public static void main(String[] args) {
        Scanner z = new Scanner (System.in);
        System.out.print("Masukkan panjang sisi: ");
        int panjang = z.nextInt();

        for (int i = 1; i <= panjang; i++) {
            for (int j = 1; j <= panjang; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

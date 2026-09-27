import java.util.Scanner;

public class Day26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jumlahBuku = input.nextInt();
        int jumlahRak = input.nextInt();

        int sisaBuku = jumlahBuku % jumlahRak;

        System.out.println(sisaBuku);
    }
}

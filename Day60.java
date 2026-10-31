import java.util.Scanner;
public class Day60 {
public static void main(String[] args) {
    

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai N: ");
        int n = input.nextInt();

        int total = 0;
        for (int i = 1; i <= n; i++) {
            total += i;
        }

        System.out.println("Jumlah angka 1 sampai " + n + " = " + total);
    }
}

import java.util.Scanner;

public class Day64 {
    public static void main(String[] args) {
        Scanner z = new Scanner (System.in);
        System.out.print("Masukkan N: ");
        int N = z.nextInt();
         int hasil = 1;
         for (int i = 1; i <= N; i++) {
            hasil = hasil *i;
            
         }
         System.out.println(N + " ! = "+  hasil);
    }
}

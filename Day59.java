import java.util.Scanner;

public class Day59 {
    public static void main(String[] args) {
        Scanner z=new Scanner (System.in);
        System.out.print("Masukkan nilai N:");
        int n = z.nextInt();
        System.out.print("Masukkan nilai M: ");
        int m =z.nextInt();
        System.out.println("Kelipatan " + m + " dari 1 sampai " + n + ":");
        for (int i = 1; i <= n; i++) {
            if (i % m==0) {
                System.out.print(i+" ");
                
            }
            
        }
    }
}

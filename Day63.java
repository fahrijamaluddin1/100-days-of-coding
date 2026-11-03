import java.util.Scanner;

public class Day63 {
    public static void main(String[] args) {
        Scanner z = new Scanner (System.in);
        System.out.print("Masukkan N: ");
        int N = z.nextInt();
        System.out.print("Masukkan M: ");
        int M = z.nextInt();
        int hasil =1;
        for (int i = 1; i <= N; i++) {
            hasil = hasil * M;
            
        }
    System.out.println(M+" pangkat "+N+ " = "+ hasil );}
}

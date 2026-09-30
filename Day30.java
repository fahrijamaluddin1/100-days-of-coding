import java.util.Scanner;

public class Day30 {
    public static void main(String[] args) {
        Scanner z  = new Scanner (System.in);
        System.out.print("Angka pertama : ");
        int a = z.nextInt();
        System.out.print("Angka kedua : ");
        int  b = z.nextInt();

        boolean lebihkecil = a<=b;
        boolean lebihbesar = a>=b;

        System.out.println(lebihkecil);
        System.out.println(lebihbesar);
        
    }
}

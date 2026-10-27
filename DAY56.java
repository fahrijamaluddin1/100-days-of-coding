import java.util.Scanner;

public class Day56{
    public static void main(String[] args) {
        Scanner z = new Scanner (System.in);
        System.out.print("Masukkan nilai N: ");
        int n = z.nextInt();
         
        System.out.println("Angka 1 sampai "+ n +":");
        for (int i = 1; i <= n; i++) {
            System.out.print( i + " ");
        
        }
        System.out.println();

        System.out.println("Angka " + n +" sampai 1:");
        for (int i = n; i >= 1; i--) {
            System.out.print(i + " ");
            
        }
    }
}

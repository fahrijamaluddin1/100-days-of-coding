import java.util.Scanner;

public abstract class Day57 {
    public static void main(String[] args) {
        Scanner z = new Scanner (System.in);
        System.out.print("Masukkkan Nilai N: ");
        int n  =z.nextInt();
        
        System.out.print("Ganjil: ");
        for (int i = 1; i <= n; i+=2) {
            System.out.print(i+" ");

        }
        System.out.print("\nGenap: ");
        for (int i = 2; i<= n; i += 2) {
            System.out.print(i+" ");
            
        }
    }
                             }

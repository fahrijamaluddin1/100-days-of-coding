import java.util.Scanner;

public class Day58 {
   public static void main(String[] args) {
    Scanner z = new  Scanner (System.in);
    System.out.print("Masukkan nilai N: ");
    int n =z.nextInt();
    System.out.print("Angka ganjil "+n+ "-1: ");
    for (int i = n; i >= 1; i--) {
        if (i%2!= 0) {
            System.out.print(i+" ");
            
        }
        
    }
    System.out.println();
    
    System.out.print("Angka genap "+n+"-1: ");
    for (int i = n; i >= 1; i--) {
        if (i%2==0) {
            System.out.print(i+" ");
            
        }
        
    }
   } 
}

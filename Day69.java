import java.util.Scanner;

public class Day70 {
   public static void main(String[] args) {
    Scanner z = new Scanner (System.in);
    System.out.print("Masukkan siku-siku: ");
    int siku =  z.nextInt();
    for (int i = 1; i <= siku; i++) {
        for (int j = 1; j <= siku - i; j++) {
            System.out.print(" ");
 }
 for (int j = 1; j <= 2* i  - 1; j++) {
    System.out.print("*");
    
 }System.out.println();
        
    }
  
   } 
}

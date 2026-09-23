import java.util.Scanner;


public class Day22 {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai A: ");
        int a = input.nextInt();
        System.out.print("Masukkan nilai B: ");
        int b = input.nextInt();

        System.out.println("\nSebelum ditukar:");
        System.out.println("A = " + a + ", B = " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("\nSesudah ditukar:");
        System.out.println("A = " + a + ", B = " + b);
    }
  }

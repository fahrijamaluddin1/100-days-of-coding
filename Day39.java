import java.util.Scanner;

public class Day39 {
    public static void main(String[] args) {
   
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        double a = input.nextDouble();

        System.out.print("Masukkan operator (+, -, *, /): ");
        char operator = input.next().charAt(0);

        System.out.print("Masukkan angka kedua: ");
        double b = input.nextDouble();

        double hasil;

        if (operator == '+') {
            hasil = a + b;
            System.out.println("Hasil: " + hasil);
        } else if (operator == '-') {
            hasil = a - b;
            System.out.println("Hasil: " + hasil);
        } else if (operator == '*') {
            hasil = a * b;
            System.out.println("Hasil: " + hasil);
        } else if (operator == '/') {
            if (b != 0) {
                hasil = a / b;
                System.out.println("Hasil: " + hasil);
            } else {
                System.out.println("Error: tidak bisa dibagi dengan nol.");
            }
        } else {
            System.out.println("Operator tidak valid.");
        }

    
    }

}

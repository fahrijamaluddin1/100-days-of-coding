import java.util.Scanner;

public class Day48 {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);

        System.out.print("Masukkan angka pertama : ");
        double a = z.nextDouble();

        System.out.print("Masukkan operator (+, -, *, /) : ");
        char operator = z.next().charAt(0);

        System.out.print("Masukkan angka kedua : ");
        double b = z.nextDouble();

        double hasil = 0;
        boolean valid = true;

        switch (operator) {
            case '+':
                hasil = a + b;
                break;
            case '-':
                hasil = a - b;
                break;
            case '*':
                hasil = a * b;
                break;
            case '/':
                if (b != 0) {
                    hasil = a / b;
                } else {
                    System.out.println("Tidak bisa membagi dengan nol");
                    valid = false;
                }
                break;
            default:
                System.out.println("Operator tidak valid");
                valid = false;
                break;
        }

     
            System.out.println("Hasil : " + a + " " + operator + " " + b + " = " + hasil);
        }
        
          }

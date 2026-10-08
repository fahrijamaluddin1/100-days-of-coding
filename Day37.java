import java.util.Scanner;

public class Day37 {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);

        System.out.print("Masukkan bilangan: ");
        int angka = z.nextInt();

        if (angka > 0) {
            System.out.println(angka + " adalah bilangan positif.");
        } else if (angka < 0) {
            System.out.println(angka + " adalah bilangan negatif.");
        } else {
            System.out.println("Bilangan tersebut adalah nol.");
        }
    }
}

import java.util.Scanner;

public class Day71 {
    public static void main(String[] args) {
Scanner z = new Scanner(System.in);
int total = 0;
int angka;
System.out.print("Masukkan angka :  ");
angka = z.nextInt();
while (angka >= 0)  {
total+= angka;
angka = z.nextInt();

}
System.out.println("Total :" +total);

    }
}

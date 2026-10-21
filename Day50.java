import java.util.Scanner;

public class Day50 {
    public static void main(String[] args) {
        Scanner z = new Scanner (System.in);

        System.out.print("Masukkan angka : ");
        int angka = z.nextInt();
        
        String status = (angka %2==0)? " genap " :  " ganjil";
        
        System.out.println("Jadi bilangan  tersebut adalah, "+ status);
    }
}

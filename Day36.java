import java.util.Scanner;

public class Day36 {
    public static void main(String[] args) {
        Scanner z = new Scanner (System.in);

        System.out.print("Masukkan Angka : ");
        int angka = z.nextInt();

        if (angka %2 ==0){
            System.out.println("Genap");
        }else{
            System.out.println("Ganjil");
        }
    }
}

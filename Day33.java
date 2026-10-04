import java.util.Scanner;

public class Day33 {
    public static void main(String[] args) {
        Scanner z = new Scanner (System.in);
        System.out.print("Masukkan Nama : ");
        String nama = z.nextLine();
        System.out.print("Masukkan Nilai : ");
        int nilai = z.nextInt();

        if(nilai >=75){
            System.out.println("Lulus");

        }else{
            System.out.println("Mengulang");
        }
    }
}

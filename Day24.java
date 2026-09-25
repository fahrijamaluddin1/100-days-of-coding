import java.util.Scanner;

public class Day24 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Masukkann panjang : ");
        byte panjang = a.nextByte();
        System.out.print("Masukkan lebar : ");
        byte lebar  = a.nextByte();

        int hasil = (panjang * lebar);

        System.out.println("Hasilnya  :"+ hasil);
    }
}

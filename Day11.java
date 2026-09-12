import java.util.Scanner;

public class Day11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan nama:");
        String nama = input.nextLine();

        System.out.println("Masukkan umur:");
        int umur =  input.nextInt();

        System.out.println("Tinggi Badan:");
        Double TB = input.nextDouble();

        System.out.println("Berat Badan:");
        Float BB = input.nextFloat();
        
        System.out.println("Masukkan Nilai:");
        Short Nilai = input.nextShort();

        System.out.println("Ukuran Sepatu:");
        byte UkuranSepatu = input.nextByte();

        System.out.println("Kelahiran tahun:");
        long Kelahiran = input.nextLong();

        System.out.println("Ukuran baju:");
        char baju = input.next().charAt(0);

        System.out.println("Apakah Sudah Menikah");
        boolean status = input.nextBoolean();



    }
}

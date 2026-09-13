import java.util.Scanner; // Import class Scanner untuk membaca input dari keyboard

public class Day12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Membuat objek Scanner untuk menerima input

        System.out.println("Masukkan nama:");
        String nama = input.nextLine(); // Membaca input berupa teks (String)

        System.out.println("Masukkan umur:");
        byte umur = input.nextByte(); // Membaca input angka bulat kecil (-128 s/d 127)

        System.out.println("Masukkan Masukkan Tinggi Badan:");
        Double TB = input.nextDouble(); // Membaca input angka desimal presisi tinggi (double)

        System.out.println("Masukkan Berat Badan:");
        Float BB = input.nextFloat(); // Membaca input angka desimal presisi rendah (float)

        System.out.println("Jarak Petoosang Ke New York:");
        Long Jarak = input.nextLong(); // Membaca input angka bulat berukuran besar (long)

        System.out.println("Tahun Lahir :");
        int Kelahiran = input.nextInt(); // Membaca input angka bulat ukuran standar (int)

        System.out.println("Luas Tanah:");
        short Luas = input.nextShort(); // Membaca input angka bulat ukuran sedang (-32768 s/d 32767)

        System.out.println("Masukkan Nilai:");
        char Nilai = input.next().charAt(0); // Membaca 1 karakter pertama dari input teks

        System.out.println("Apakah Anda Lulus");
        boolean Status = input.nextBoolean(); // Membaca input true/false

        // Menampilkan semua data yang sudah diinput ke layar
        System.out.println("Nama :" + nama);
        System.out.println("Umu :" + umur);
        System.out.println("Tinggi Badan:" + TB);
        System.out.println("Berat Badan:" + BB);
        System.out.println("Jarak Petoosang ke New York:" + Jarak);
        System.out.println("Tahun Lahir? :" + Kelahiran);
        System.out.println("Luas Tanah? :" + Luas);
        System.out.println("Masukkan Nilai:" + Nilai);
        System.out.println("Status? :" + Status);
    }
          }

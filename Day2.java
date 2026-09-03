public class Day2 { //Deklarasi class Day2
    public static void main(String[] args) { // Method main() -titik awal program dijalankan. 
        String nama = "Fahri jamaluddin"; //Deklarasi nama bertipe String
        Double nomorsepatu = 39.0; //Deklarasi variabelvnomor sepatu bertipe Double
        char kelas = 'B'; //Deklarasi variabel kelas bertipe char

        System.out.println("masukkan nama :"+ nama); //Cetak+auto ganti baris. 
        System.out.print("masukkan ukuran sepatu :"+nomorsepatu+ "\n"); //Cetak, ganti baris baru manual pakai \n(karena print() tidak otomatis ganti baris). 
        System.out.printf("kelas :%c%n" ,kelas); //placeholder untuk char(kelas), %n = ganti baris


    } //penutup method main
} //penutup class Day2. 

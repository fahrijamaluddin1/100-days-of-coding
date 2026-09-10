public class ConstantaContoh {
    public static void main(String[] args) {
        // Kata kunci "final" membuat variabel menjadi konstanta
        // Artinya nilainya TIDAK BISA diubah setelah diberi nilai awal
        final double PHI = 3.14;                  // konstanta untuk nilai Pi
        final int JUMLAH_HARI_SEMINGGU = 7;        // konstanta jumlah hari dalam seminggu
        final String NAMA_NEGARA = "Indonesia";    // konstanta nama negara

        // Menampilkan nilai konstanta
        System.out.println("Nilai PHI: " + PHI);                         // cetak nilai Pi
        System.out.println("Jumlah hari dalam seminggu: " + JUMLAH_HARI_SEMINGGU); // cetak jumlah hari
        System.out.println("Nama negara: " + NAMA_NEGARA);               // cetak nama negara

        // Jika baris di bawah ini diaktifkan, akan terjadi ERROR
        // karena PHI sudah final (tidak boleh diubah lagi)
        // PHI = 3.15; 
    }
}

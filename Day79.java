public class Day79 {
    public static void main(String[] args) {
        int[] nilai = {80, 75, 90, 65, 85};
        String[] nama = new String[3];

        nama[0] = "Fahri";
        nama[1] = "Andi";
        nama[2] = "Budi";

        System.out.println("Nilai pertama : " + nilai[0]);
        System.out.println("Nilai terakhir: " + nilai[nilai.length - 1]);
        System.out.println("Jumlah nilai  : " + nilai.length);

        nilai[1] = 100;
        System.out.println("Nilai indeks 1 setelah diubah: " + nilai[1]);

        System.out.println("Daftar nama:");
        for (int i = 0; i < nama.length; i++) {
            System.out.println(i + ". " + nama[i]);
        }
    }
}

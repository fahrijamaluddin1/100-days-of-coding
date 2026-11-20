public class Day80 {
    public static void main(String[] args) {
        String[] buah = {"Apel", "Jeruk", "Mangga", "Pisang", "Anggur"};

        System.out.println("Elemen pertama (indeks 0): " + buah[0]);
        System.out.println("Elemen ketiga (indeks 2): " + buah[2]);
        System.out.println("Elemen terakhir (indeks " + (buah.length - 1) + "): " + buah[buah.length - 1]);

        buah[1] = "Semangka";
        System.out.println("Setelah diubah, indeks 1 menjadi: " + buah[1]);

        System.out.println("Jumlah elemen: " + buah.length);
    }
}

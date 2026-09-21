public class Day20 {
    public static void main(String[] args) {
        int umur = 20;
        double tinggi = 170.5;
        char grade = 'A';
        boolean statusAktif = true;

        String strUmur = String.valueOf(umur);
        String strTinggi = String.valueOf(tinggi);
        String strGrade = String.valueOf(grade);
        String strStatus = String.valueOf(statusAktif);

        System.out.println("Umur: " + strUmur);
        System.out.println("Tinggi: " + strTinggi);
        System.out.println("Grade: " + strGrade);
        System.out.println("Status Aktif: " + strStatus);

        System.out.println("Panjang karakter strUmur: " + strUmur.length());
    }
}

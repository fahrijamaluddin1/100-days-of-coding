import java.util.Scanner;

public class Day32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("IPK                  : ");
        double ipk = input.nextDouble();
        System.out.print("Penghasilan orang tua: ");
        int penghasilan = input.nextInt();
        System.out.print("Semester             : ");
        int semester = input.nextInt();
        System.out.print("Beasiswa lain (t/f)  : ");
        boolean beasiswaLain = input.nextBoolean();

        boolean layak = ipk >= 3.5 && penghasilan < 5000000
                        && semester >= 3 && !beasiswaLain;
        boolean semesterGenap = semester % 2 == 0;

        int biayaKuliah = 6000000;
        int biayaAkhir = layak ? biayaKuliah - (biayaKuliah * 50 / 100) : biayaKuliah;

        System.out.println();
        System.out.println("Layak beasiswa     : " + layak);
        System.out.println("Semester genap     : " + semesterGenap);
        System.out.println("Biaya kuliah akhir : " + biayaAkhir);

    }
          }

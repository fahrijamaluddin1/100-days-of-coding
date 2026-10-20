import java.util.Scanner;

public class Day49 {
    public static void main(String[] args) {
        Scanner z = new Scanner (System.in);
        int nilai;
        System.out.print("Masukkan nilai : ");
         nilai = z.nextInt();

        String hasil =(nilai >=70 )? "Lulus " : "Tidak lulus";

        System.out.println("Hasil : "+ hasil);

    }
          }

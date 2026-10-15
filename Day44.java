import java.util.Scanner;

public class Day44 {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        System.out.print("Masukkan nilai: ");

        int  nilai=z.nextInt();
        char predikat ;
        if(nilai <0 || nilai >100){
            System.out.println("Nilai tidak valid");
            return ;

        }else if(nilai>=85){
            predikat='A';

        }else if(nilai>=70){
            predikat='B';

        }else if(nilai>=55){
            predikat='D';

        }else if(nilai>=40){
            predikat='E';

        }else{
            predikat='E';
        }
        System.out.println("Predikat nilai :"+pr);
    }
}

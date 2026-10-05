import java.util.Scanner;

public class Day34 {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        System.out.print("Masukkan umur :");
        int umur = z.nextInt();

        if(umur<=13)
            System.out.println("Anak-Anak");
        else if(umur<=18)
            System.out.println("Remaja");
        else if(umur<=60){
            System.out.println("Dewasa");
        }else{
            System.out.println("Lansia");
        }
        
        
    }
                               }

import java.util.Scanner;

public class Day38 {

    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        

        System.out.println("DAFTAR MENU");
        System.out.println("1.Nasi Goreng");
        System.out.println("2.Mie pangsit");
        System.out.println("3.Bakso Ayam");
        System.out.println("4.Bakso Uratt");
        System.out.println("5.Ikan Nila Bakar");
        int pilihan =z.nextInt();


        if(pilihan ==1){
            System.out.println("Kamu Memilih Nasi Goreng, dengan Harga 10.000");
        }else if(pilihan==2){
            System.out.println("Kamu Memilih Mie Pangsit, Dengan harga 12.000");
        }else if(pilihan==3){
            System.out.println("Kamu  Memilih Bakso Ayam,  Dengan Harga 10.0000");
        }else if(pilihan==3){
            System.out.println("kamu Memilih Bakso urat, Dengan Harga 12.000");
        }else if(pilihan==4){
            System.out.println("Kamu Memiilih Ikan nila bakar, dengan harga 10.000");
        }else{
            System.out.println("Menu Tidak tersedia, Silahkan Pilih 1-5");
        }
        
    }
           }

import java.util.Scanner;

public class Day73 {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        int f ;
        do {
            System.out.println("==MENU===");
            System.out.println("1. Tidur");
            System.out.println("2. Makan");
            System.out.println("3. Ngoding");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");
            f = z.nextInt();
            switch (f) {
                case 1:
                    System.out.println("Dilarang Tidur!");
                    break;
            case 2:
                System.out.println(" Makannya nanti dulu ");
                break;
                case 3:
                    System.out.println("Ngoding itu harus");
                    break;
                    case 4: 
                    System.out.println("Jangan lupa datang lagi");
                    break;

                default:
                    System.out.println("Pilihan tidak tersedia! ");
                    break;
            }
            
        } while (f !=4);
    }
}

import java.util.Scanner;

public class Latihanpercabangan4 {
    public static void main(String[] args) {
        Scanner z = new Scanner (System.in);
        System.out.print("Pilih menu : ");
        int pilihan = z.nextInt();
        String menu = "";
      
        switch (pilihan) {
            case 1 :
                menu = "Nasi Goreng";
               
            break;
                case 2  :
                    menu = "Mie Goreng";
                  
                break;
                    case 3 :
                        menu =  "Ayam Geprek";
                      
                    break;
                        case 4 :
                            menu = "Es Teh";
                          
                break;
        
            default:
                System.out.println("Pilihan tidak tersedia");
                break;
        }
        System.out.println("Anda memilih :"+menu);
    }
}

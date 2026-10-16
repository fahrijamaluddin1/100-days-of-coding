import java.util.Scanner;

public class Day45 {
    public static void main(String[] args) {
        Scanner z  = new Scanner(System.in);
        System.out.print("Masukkan Bulan: ");
        int bulan = z.nextInt();
        String namabulan;

        switch (bulan) {
            case 1:
                namabulan="januari";
                
                break;
        case 2:
            namabulan="Februari";

            break;

            case 3:
                namabulan="Maret";
                break;

                case 4:
                    namabulan="April";
                    break;

                    case 5:
                        namabulan="Mei";
                        break;
            default:
                System.out.println("Bulan tidak tersedia");
                break;
        }
    }
        }

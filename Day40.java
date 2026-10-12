import java.util.Scanner;

public class Day40 {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        
        System.out.println("Masukkan Suhu :");
        int suhu =z.nextInt();
        if(suhu<=20)
            System.out.println("Suhu tersebut dingin");

        else if(suhu<=28)
            System.out.println("Suhu tersebut hangat ");
        
        else{
            System.out.println("Suhu tersebut panas");
        }
    
     }
              }

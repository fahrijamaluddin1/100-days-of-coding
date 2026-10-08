import java.util.Scanner;

public class Day37 {
    public static void main(String[] args) {
        Scanner z = new Scanner (System.in);
        String usernamebenar= "Fahri";
        String passwordbenar = "24-05-2007";

        System.out.print("Masukkan Username : ");
        String username = z.nextLine();
        System.out.print("Masukkan Password : ");
        String password = z.next();

        if (username.equals(usernamebenar)){
        if (password.equals(passwordbenar)){
            System.out.println("Login berhasil");
        
     } else{
        System.out.println("Password  salah ");
     }
     }else{
            System.out.println("Username tidak ditemukan ");

        }
        }
          }

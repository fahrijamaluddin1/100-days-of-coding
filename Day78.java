import java.util.Scanner;

public class Day78 {
    public static void main(String[] args) {
        Scanner z = new Scanner (System.in);
        System.out.print("Username baru:");
        String usernamea = z.nextLine();
        System.out.print("Password baru: ");
        String passworda = z.nextLine();
        System.out.println("Akun berhasil dibuat!");
        System.out.println("===LOGIN===");
        boolean  berhasil = false;
        while (!berhasil) {
            System.out.print("Username: ");
            String username = z.nextLine();
            System.out.print("Password: ");
            String password = z.nextLine();
            if (username.equals(usernamea)&& password.equals(passworda)) {
                System.out.println("Login berhasil! Selamat datang, "+ username+ ".");
                berhasil= true;

                
            }
            else{
                System.out.println("Username atau password salah, coba lagi.");
            }
        }
    }
}

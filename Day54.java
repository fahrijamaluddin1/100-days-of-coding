import java.util.Scanner;

public class Day54 {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        int n = z.nextInt();

        for (int i = 1; i <= n; i++) {
            boolean kelipatan3 = (i % 3 == 0);
            boolean kelipatan4 = (i % 4 == 0);

            if (kelipatan3 != kelipatan4) {
                System.out.print(i + " ");
            }
        }
    }
}

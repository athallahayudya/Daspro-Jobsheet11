import java.util.Scanner;

public class LatIndu062 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai N = ");
        int n = sc.nextInt();

        if (n < 5) {
            System.out.println("Nilai N harus minimal 5");
        } else {
            for (int i = 0; i < n; i++) {
                for (int j = 1; j <= n - i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
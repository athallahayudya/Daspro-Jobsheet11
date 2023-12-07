import java.util.Scanner;

public class LatIndu061 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai N = ");
        int n = sc.nextInt();

        if (n < 3) {
            System.out.println("Nilai N harus minimal 3");
        } else {
            for (int i = 1; i <= n; i++) {
                for (int jrk = 1; jrk <= n - i; jrk++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }

                System.out.println();
            }
        }
    }

}

import java.util.Scanner;

public class LatIndu063 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai N = ");
        int n = sc.nextInt();

        if (n < 3) {
            System.out.println("Nilai N harus minimal 3");
        } else {
            for(int i=0;i<n;i++){
                System.out.print(n+" ");
            }
            System.out.println();
            for(int i=0;i<n-2;i++){
                System.out.print(n+ " ");
                for(int j=0;j<n-2;j++){
                    System.out.print("  ");
                }
                System.out.println(n+"  ");
            }
            for (int i=0;i<n;i++){
                System.out.print(n+" ");
            }
            System.out.println();
        }
    }
}
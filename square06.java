import java.util.Scanner;
public class square06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai N = ");
        int n = sc.nextInt();
        for(int iOuter=1; iOuter<=n; iOuter++){
            for(int i=1; i<n; i++){
            System.out.print("*");
        }
        System.out.println(); 
        }
    }
}
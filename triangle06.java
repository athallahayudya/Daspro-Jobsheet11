import java.util.Scanner;
public class triangle06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai N = ");
        int n = sc.nextInt();

        int i = 0;
        while (i <= n) {
            int j = 0;
            while (j<i) {
                System.out.print("*");
                j++;
            }i++;
            System.out.println(); //Untuk memberikan spasi ke bawah, agar menghasilkan bentuk seperti segitiga
        } 
        
    }
}
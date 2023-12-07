import java.util.Scanner;
public class kasus06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan angka =  "); //memberikan nilai variabel n
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) { //untuk membuat baris
            for (int j = 0; j < n; j++) { //untuk membuat kolom
                
                    System.out.print("*");
            }
            System.out.println(); // menambahkan baris kosong
        }
    
    }
}
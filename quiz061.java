import java.util.Random;
import java.util.Scanner;
public class quiz061 {

    public static void main(String[] args) {
         Random random = new Random();
        Scanner sc = new Scanner(System.in);
        char menu='y';
        do {
            int number = random.nextInt(10) + 1;
            boolean success = false;
            do {
                System.out.print("Tebak angka (1-10): ");
                int answer = sc.nextInt();
                sc.nextLine();

                if (answer > number) {
                    System.out.println("Tebakan Anda lebih besar dari jawaban.");
                } else if (answer < number) {
                    System.out.println("Tebakan Anda lebih kecil dari jawaban.");
                } else {
                    System.out.println("Selamat Tebakan Anda Benar");
                    success = true;
                }
                success = (answer == number);
            } while(!success);
                System.out.print("Apakah Anda ingin mengulang permainan (Y/y)?");
                menu = sc.nextLine().charAt(0);
        } while(menu=='y' || menu=='Y'); 
    }
}
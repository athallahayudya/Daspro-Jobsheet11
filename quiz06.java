import java.util.Random;
import java.util.Scanner;
public class quiz06 {
public static void main(String[] args) {
    Random random = new Random();
    Scanner sc = new Scanner(System.in);

    char menu = 'y';
    do{
        int number = random.nextInt(10)+1;
        boolean success=false;
        do{
            System.out.println("Tebak angka (1-10): ");
            int answer = sc.nextInt();
            sc.nextLine();
            success=(answer==number);
        }while(!success);
        System.out.println("Apakah Anda ingin mengulang permainan(Y/y)?");
        menu = sc.nextLine().charAt(0);
    }while (menu=='y'||menu=='Y'); {
        //
    }
}
    
}
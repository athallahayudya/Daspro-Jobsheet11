import java.util.Scanner;
public class nestedLoop062 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] temps = new double[5][7];
        double[] rataRata = new double[5];

        for (int i = 0; i < temps.length; i++) { 
            System.out.println("Kota ke-" + i);
            double sum = 0; 
            for (int j = 0; j < temps[0].length; j++) { 
                System.out.print("Hari ke-" + (j + 1) + ": "); 
                temps[i][j] = sc.nextDouble(); 
                sum += temps[i][j];
            } 
            //rata-rata
            rataRata[i] = sum / temps[i].length;
            System.out.println(); 
           } 
           //menggunakan forech
        for (int i = 0; i < temps.length; i++) { 
            System.out.print("Kota ke-" + (i + 1) + ": "); 
            for (double suhu : temps[i]) { 
                System.out.print(suhu + " "); 
            } 
            System.out.println("Rata-rata  = " + rataRata[i]);
        }
    }
}
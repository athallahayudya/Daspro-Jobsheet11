import java.util.Scanner;

public class kasir{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int jumlahHari = 30;
        double totalBulanan = 0;


        for (int hari = 1; hari <= jumlahHari; hari++) {
            System.out.println("Hari " + hari + " - Penjualan:");
            double totalHarian = 0;
            for (int item = 1; item <= 3; item++) {  
                System.out.print("Masukkan jumlah " + "item " + item + " yang terjual: ");
                int jumlahItem = scanner.nextInt();

                double hargaItem = 2000;
                double totalItem = hargaItem * jumlahItem;
                System.out.println("Item " + item + " - Total: Rp " + totalItem);
                totalHarian += totalItem;
            }
            System.out.println("Total Penjualan Hari " + hari + ": Rp " + totalHarian);
            System.out.println("------------------------");

            totalBulanan += totalHarian;
        }

        System.out.println("Total Penjualan Bulan Ini: Rp " + totalBulanan);

    }
}
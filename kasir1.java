import java.util.Scanner;

public class kasir1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlahBarang, totalHarga = 0;
        String date;

        System.out.print("Masukkan tanggal: ");
        date = input.nextLine();

        System.out.print("Masukkan jumlah barang: ");
        jumlahBarang = input.nextInt();

        int[] hargaBarang = new int[jumlahBarang]; // membuat array untuk menyimpan harga barang

        for (int i = 0; i < jumlahBarang; i++) {
            System.out.print("Masukkan harga barang ke-" + (i+1) + ": ");
            hargaBarang[i] = input.nextInt();
            totalHarga += hargaBarang[i];
        }
        System.out.println("---------------------------------");
        System.out.println("Struk Belanja Minimarket");
        System.out.println("Tanggal: " + date);
        System.out.println("---------------------------------");
        System.out.println("No. | Barang | Harga");
        System.out.println("-----|------|-----");
        for (int i = 0; i < jumlahBarang; i++) {
            System.out.println((i+1) + " | Barang ke-" + (i+1) + " | " + hargaBarang[i]);
        }
        System.out.println("-----|------|-----");
        System.out.println("Total Harga: " + totalHarga);
        System.out.println("Terima kasih telah berbelanja!");
        System.out.println("---------------------------------");
    }
}
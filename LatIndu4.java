import java.util.Scanner;

public class LatIndu4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] badminton = new String[5];
        String[] tenisMeja = new String[5];
        String[] bolaBasket = new String[5];
        String[] bolaVoly = new String[5];
        String temp;

        System.out.println("Atlet Badminton:");
        for (int i = 0; i < badminton.length; i++) {
            System.out.print("Masukkan Nama Atlet ke-" + (i + 1) + ": ");
            badminton[i] = sc.nextLine();
        }
        System.out.println();
        System.out.println("Atlet Tenis Meja:");
        for (int i = 0; i < tenisMeja.length; i++) {
            System.out.print("Masukkan Nama Atlet ke-" + (i + 1) + ": ");
            tenisMeja[i] = sc.nextLine();
        }
        System.out.println();
        System.out.println("Atlet Basket:");
        for (int i = 0; i < bolaBasket.length; i++) {
            System.out.print("Masukkan Nama Atlet ke-" + (i + 1) + ": ");
            bolaBasket[i] = sc.nextLine();
        }
        System.out.println();
        System.out.println("Atlet Bola Voly:");
        for (int i = 0; i < bolaVoly.length; i++) {
            System.out.print("Masukkan Nama Atlet ke-" + (i + 1) + ": ");
            bolaVoly[i] = sc.nextLine();
        }
        System.out.println();

        System.out.println("Data Nama Atlet Badminton:");
        for (int j = 0; j < badminton.length; j++) {
            for (int i = j + 1; i < badminton.length; i++) {
                if (badminton[i].compareTo(badminton[j]) < 0) {
                    temp = badminton[j];
                    badminton[j] = badminton[i];
                    badminton[i] = temp;
                }
            }
            System.out.println(badminton[j]);
        }
        System.out.println();
        System.out.println("Data Nama Atlet Tenis Meja:");
        for (int j = 0; j < tenisMeja.length; j++) {
            for (int i = j + 1; i < tenisMeja.length; i++) {
                if (tenisMeja[i].compareTo(tenisMeja[j]) < 0) {
                    temp = tenisMeja[j];
                    tenisMeja[j] = tenisMeja[i];
                    tenisMeja[i] = temp;
                }
            }
            System.out.println(tenisMeja[j]);
        }
        System.out.println();
        System.out.println("Data Nama Atlet Basket:");
        for (int j = 0; j < bolaBasket.length; j++) {
            for (int i = j + 1; i < bolaBasket.length; i++) {
                if (bolaBasket[i].compareTo(bolaBasket[j]) < 0) {
                    temp = bolaBasket[j];
                    bolaBasket[j] = bolaBasket[i];
                    bolaBasket[i] = temp;
                }
            }
            System.out.println(bolaBasket[j]);
        }
        System.out.println();
        System.out.println("Data Nama Atlet Bola Voly:");
        for (int j = 0; j < bolaVoly.length; j++) {
            for (int i = j + 1; i < bolaVoly.length; i++) {
                if (bolaVoly[i].compareTo(bolaVoly[j]) < 0) {
                    temp = bolaVoly[j];
                    bolaVoly[j] = bolaVoly[i];
                    bolaVoly[i] = temp;
                }
            }
            System.out.println(bolaVoly[j]);
        }

    }
}
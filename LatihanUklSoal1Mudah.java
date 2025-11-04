package LatihanSoalUkl;

import java.util.Scanner;

public class LatihanUklSoal1Mudah {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan berat paket (kg): ");
        double berat = input.nextDouble();
        System.out.print("Masukkan jarak tempuh (km): ");
        double jarak = input.nextDouble();
        System.out.print("Masukkan panjang paket (cm): ");
        double panjang = input.nextDouble();
        System.out.print("Masukkan lebar paket (cm): ");
        double lebar = input.nextDouble();
        System.out.print("Masukkan tinggi paket (cm): ");
        double tinggi = input.nextDouble();

        double volume = panjang * lebar * tinggi;

        double biayaPerKg;
        if (jarak <= 10) {
            biayaPerKg = 4250;
        } else {
            biayaPerKg = 6000;
        }
        double biaya = berat * biayaPerKg;
        if (volume > 100) {
            biaya += 50000;
        }

        System.out.println("=== RINCIAN BIAYA PENGIRIMAN ===");
        System.out.println("Berat Paket   : " + berat + " kg");
        System.out.println("Jarak Tempuh  : " + jarak + " km");
        System.out.println("Volume Paket  : " + volume + " cm³");
        System.out.println("Total Biaya   : Rp " + biaya);

        input.close();
    }
}

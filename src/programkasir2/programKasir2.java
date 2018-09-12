package programkasir2;

/**
 *
 * @author ALFINA
 */

import java.util.Scanner;

public class programKasir2 {

    public static void main(String[] args) {
        ProgramKasir();

    }

    public static void ProgramKasir() {
        Scanner masuk = new Scanner(System.in);
        String nama;
        double diskonA, diskonB, diskonC;
        int jumlahBarang, hargaBarang = 0;
        int totalHarga, total, bayar = 0, pembayaran;
        int kodeBarang;
        String[] namaBarang = {"Pensil", "Bolpoin", "Map", "Tipe-x", "Rautan"};

        System.out.println("Identitas : Alfina Hidayati / X RPL 6 / 06");
        System.out.println("==SELAMAT DATANG, SELAMAT BERBELANJA==");

        System.out.print("Nama Kasir : ");
        nama = masuk.next();

        System.out.print("Masukkan kode barang : ");
        kodeBarang = masuk.nextInt();

        if (kodeBarang == 1) {
            hargaBarang = 3000;
            System.out.println("Nama barang : " + namaBarang[0]);
            System.out.println("Harga Rp" + hargaBarang);
        } else if (kodeBarang == 2) {
            hargaBarang = 4000;
            System.out.println("Nama barang : " + namaBarang[1]);
            System.out.println("Harga Rp" + hargaBarang);
        } else if (kodeBarang == 3) {
            hargaBarang = 5000;
            System.out.println("Nama barang : " + namaBarang[2]);
            System.out.println("Harga Rp" + hargaBarang);
        } else if (kodeBarang == 4) {
            hargaBarang = 7000;
            System.out.println("Nama barang : " + namaBarang[3]);
            System.out.println("Harga Rp" + hargaBarang);
        } else if (kodeBarang == 5) {
            hargaBarang = 35000;
            System.out.println("Nama barang : " + namaBarang[4]);
            System.out.println("Harga Rp" + hargaBarang);
        } else {
            System.out.println("Tidak ada");
            System.exit(0);
        }

        System.out.print("Masukkan jumlah barang : ");
        jumlahBarang = masuk.nextInt();

        totalHarga = hargaBarang * jumlahBarang;
        System.out.println("Total Harga Rp" + (int) totalHarga);

        if (totalHarga > 500000) {
            diskonC = 0.3;
            total = (int) (totalHarga * diskonC);
            bayar = (int) (totalHarga - total);
            System.out.println("Anda mendapat diskon 50%");
            System.out.println("Bayar Rp" + bayar);
        } else if (totalHarga > 200000) {
            diskonB = 0.2;
            total = (int) (totalHarga * diskonB);
            bayar = (int) (totalHarga - total);
            System.out.println("Anda mendapat diskon 20%");
            System.out.println("Bayar Rp" + bayar);
        } else if (totalHarga > 100000) {
            diskonA = 0.1;
            int diskon1 = 0;
            total = (int) (totalHarga * diskon1);
            bayar = totalHarga - total;
            System.out.println("Anda mendapat diskon 10%");
            System.out.println("Bayar Rp" + bayar);
        } else if (totalHarga < 100000) {
            System.out.println("Bayar Rp" + bayar);
        }

        System.out.print("Masukkan uang bayar Rp");
        pembayaran = masuk.nextInt();

        if (pembayaran == bayar) {
            System.out.println("Uang bayar pas");
        } else if (pembayaran > bayar) {
            int kembalian = pembayaran - bayar;
            System.out.println("Uang pembayaran lebih");
            System.out.println("Uang kembalian Rp" + kembalian);
        } else if (pembayaran < bayar) {
            int kurang = bayar - pembayaran;
            System.out.println("Mohon maaf uang pembayaran kurang Rp" + kurang);
            
            }int kembali = 0;
while (kembali == 1);
            System.out.print("\n Terimakasih Selamat Datang Kembali");
        }

    }


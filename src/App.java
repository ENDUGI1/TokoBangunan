

import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

class App {
    public static void main(String[] args) {
        ArrayList<Barang> dataBarang = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int pilih = 0;

        while (pilih != 5) {
            // output pilihan
            System.out.println("==================================");
            System.out.println("           MENU TOKO BANGUNAN           ");
            System.out.println("==================================");
            System.out.println("1. Tambah Data");
            System.out.println("2. Tampil Data");
            System.out.println("3. Ubah Data");
            System.out.println("4. Hapus Data");
            System.out.println("5. Keluar");
            System.out.println("==================================");
            System.out.print("Masukkan Pilihan: ");


            //agar saat inputan bukan angka tidak error
            try {
                pilih = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Input tidak valid. Silakan masukkan angka.");
                sc.nextLine(); // Membuang karakter newline
                continue;
            }

            switch (pilih) {
                case 1:
                    sc.nextLine(); // Membuang karakter newline
                    System.out.println("\nMasukkan Nama Barang");
                    String nama = sc.nextLine();
                    System.out.println("Masukkan Jenis Barang");
                    String jenisBarang = sc.nextLine();
                    System.out.println("Masukkan Harga");
                    int harga = sc.nextInt();
                    System.out.println("Masukkan Stok");
                    int stok = sc.nextInt();
                    Barang barangBaru = new Barang(nama, jenisBarang, harga, stok);
                    dataBarang.add(barangBaru);
                    System.out.println("\nData berhasil ditambahkan!");
                    break;

                case 2:
                    System.out.println("\n==================================");
                    System.out.println("           DATA BARANG           ");
                    System.out.println("==================================");
                    for (int i = 0; i < dataBarang.size(); i++) {
                        dataBarang.get(i).tampil();
                        System.out.println("==================================");
                    }
                    break;

                case 3:
                    if (dataBarang.size() == 0) {
                        System.out.println("\nTidak ada data barang yang dapat diubah!");
                        break;
                    }
                    System.out.println("\n==================================");
                    System.out.println("           DATA BARANG           ");
                    System.out.println("==================================");
                    for (int i = 0; i < dataBarang.size(); i++) {
                        System.out.println("Barang ke-" + (i+1));
                        dataBarang.get(i).tampil();
                        System.out.println("==================================");
                    }
                    System.out.println("\nUbah data ke berapa");
                    int ubah = sc.nextInt();
                    sc.nextLine();

                    if (ubah < 1 || ubah > dataBarang.size()) {
                        System.out.println("\nData barang tidak ditemukan!");
                        break;
                    }

                    System.out.println("Masukkan Nama Barang Baru");
                    dataBarang.get(ubah - 1).nama = sc.nextLine();

                    System.out.println("Masukkan Jenis Barang Baru");
                    dataBarang.get(ubah - 1).jenisBarang = sc.nextLine();

                    System.out.println("Masukkan Harga Baru");
                    dataBarang.get(ubah - 1).harga = sc.nextInt();

                    System.out.println("Masukkan Stok Baru");
                    dataBarang.get(ubah - 1).stok = sc.nextInt();
                    System.out.println("\nData berhasil diubah!");
                    break;

                case 4:
                    if (dataBarang.size() == 0) {
                        System.out.println("\nTidak ada data barang yang dapat dihapus!");
                        break;
                    }
                    System.out.println("\n==================================");
                    System.out.println("           DATA BARANG           ");
                    System.out.println("==================================");
                    for (int i = 0; i < dataBarang.size(); i++) {
                        System.out.println("Barang ke-" + (i+1));
                        dataBarang.get(i).tampil();
                        System.out.println("==================================");
                    }
                    System.out.println("\nHapus data ke berapa");
                    int hapus = sc.nextInt();

                    if (hapus < 1 || hapus > dataBarang.size()) {
                        System.out.println("\nData barang tidak ditemukan!");
                        break;
                    }

                    dataBarang.remove(hapus - 1);
                    System.out.println("\nData berhasil dihapus!");
                    break;

                default:
                    break;
            }
        }
    }
}
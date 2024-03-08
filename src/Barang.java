class Barang {
    String nama;
    String jenisBarang;
    int harga;
    int stok;

    public Barang(String nama, String jenisBarang, int harga, int stok) {
        this.nama = nama;
        this.jenisBarang = jenisBarang;
        this.harga = harga;
        this.stok = stok;
    }

    void tampil() {
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Barang: " + jenisBarang);
        System.out.println("Harga: " + harga);
        System.out.println("Stok: " + stok);
    }
}
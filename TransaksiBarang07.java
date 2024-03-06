import java.util.Scanner;
class TransaksiBarang07 {
    Barang07[] barangs;
    Barang07[] pembelianBarangs = new Barang07[5];
    int indexPembelian = 0;

    public TransaksiBarang07(Barang07[] barangs) {
        this.barangs = barangs;
    }

    public void tampilkanBarang() {
        System.out.println("=============== Selamat Datang di Rajanya Frozen Food ==============\n");
        System.out.println("Daftar Barang yang Ready : \n");
        for (Barang07 barang : barangs) {
            System.out.println(barang.kode + " - " + barang.nama + " - Harga: " + barang.harga + " - Stok: " + barang.stok);
            System.out.println("====================================================================");
        }
    }

    public void tampilkanBarangPembelian() {
        System.out.println("Daftar Barang Pembelian:");
        for (Barang07 barang : pembelianBarangs) {
            if (barang != null) {
                System.out.println(barang.kode + " - " + barang.nama + " - Harga: " + barang.harga);
            }
        }
    }

    public void melakukanPembelian(String kode) {
        for (Barang07 barang : barangs) {
            if (barang.kode.equals(kode)) {
                if (barang.stok > 0) {
                    pembelianBarangs[indexPembelian] = barang;
                    indexPembelian++;
                    barang.stok--;
                    System.out.println("Barang dengan kode " + kode + " telah dibeli.");
                    return;
                } else {
                    System.out.println("Stok barang dengan kode " + kode + " habis.");
                    return;
                }
            }
        }
        System.out.println("Barang dengan kode " + kode + " tidak ditemukan.");
    }
}

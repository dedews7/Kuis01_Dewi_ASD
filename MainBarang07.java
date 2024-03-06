import java.util.Scanner;

class MainBarang07 {
    public static void main(String[] args) {
        Barang07 barang1 = new Barang07("001", "Ceker Frozen 300gr", 25000.0, 100);
        Barang07 barang2 = new Barang07("002", "Siomay Frozen 200gr", 22000.0, 150);
        Barang07 barang3 = new Barang07("003", "Lumpia Kulit Tahu Frozen 250gr", 15000.0, 200);
        Barang07 barang4 = new Barang07("004", "Chicken Wings Frozen 300gr", 20000.0, 120);
        Barang07 barang5 = new Barang07("005", "Pisang Coklat Frozen 250gr", 18000.0, 180);

        Barang07[] daftarBarang = {barang1, barang2, barang3, barang4, barang5};

        TransaksiBarang07 transaksi = new TransaksiBarang07(daftarBarang);
        transaksi.tampilkanBarang();

        Scanner scanner = new Scanner(System.in);

        int choice = 0;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tampilkan Daftar Barang");
            System.out.println("2. Melakukan Pembelian");
            System.out.println("3. Tampilkan Daftar Pembelian");
            System.out.println("0. Keluar");

            System.out.print("Pilih menu: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    transaksi.tampilkanBarang();
                    break;
                case 2:
                    System.out.print("Masukkan kode barang yang ingin dibeli: ");
                    String kodeBeli = scanner.next();
                    transaksi.melakukanPembelian(kodeBeli);
                    break;
                case 3:
                    transaksi.tampilkanBarangPembelian();
                    break;
                case 0:
                    System.out.println("\n============= Terima kasih, Jangan Lupa Kembali Lagi ya! =============\n");
                    break;
                default:
                    System.out.println("Menu tidak valid.");
            }
        } while (choice != 0);
    }
}
package Catatankeuanganpribadi;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KeuanganApp {

    private final List<Transaksi> transaksiList;

    public KeuanganApp() {
        transaksiList = new ArrayList<>();
    }
    public void tambahTransaksi(Transaksi t) {
    transaksiList.add(t);
    System.out.println("Transaksi berhasil ditambahkan!\n");
    }
    
    public void tampilkanSemua() {
    if (transaksiList.isEmpty()) {
        System.out.println("Belum ada transaksi.\n");
        return;
    }
    System.out.println("======== DAFTAR TRANSAKSI ========");
    for (Transaksi t : transaksiList) {
        System.out.println(t.getInfoTransaksi());
    }
    System.out.println("===================================\n");
    }
    public double hitungSaldo() {
    double saldo = 0;
    for (Transaksi t : transaksiList) {
        if (t instanceof Pemasukan) {
            saldo += t.getNominal();
        } else if (t instanceof Pengeluaran) {
            saldo -= t.getNominal();
        }
    }
    return saldo;
    }
    public static void main(String[] args) {
        KeuanganApp app = new KeuanganApp();
        Scanner sc = new Scanner(System.in);
        int pilih;
        do {
            System.out.println("=== MENU CATATAN KEUANGAN ===");
            System.out.println("1. Tambah Pemasukan");
            System.out.println("2. Tambah Pengeluaran");
            System.out.println("3. Tampilkan Semua Transaksi");
            System.out.println("4. Hitung Saldo");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1 -> {
                    System.out.print("Tanggal (dd/mm/yyyy): ");
                    LocalDate tgl = LocalDate.parse(sc.nextLine(), Transaksi.TANGGAL_FMT);
                    System.out.print("Nominal: ");
                    double nominal = sc.nextDouble(); sc.nextLine();
                    System.out.print("Kategori: ");
                    String kategori = sc.nextLine();
                    System.out.print("Keterangan: ");
                    String ket = sc.nextLine();
                    System.out.print("Sumber pemasukan: ");
                    String sumber = sc.nextLine();
                    app.tambahTransaksi(new Pemasukan(tgl, nominal, kategori, ket, sumber));
                }
                case 2 -> {
                    System.out.print("Tanggal (dd/mm/yyyy): ");
                    LocalDate tgl = LocalDate.parse(sc.nextLine(), Transaksi.TANGGAL_FMT);
                    System.out.print("Nominal: ");
                    double nominal = sc.nextDouble(); sc.nextLine();
                    System.out.print("Kategori: ");
                    String kategori = sc.nextLine();
                    System.out.print("Keterangan: ");
                    String ket = sc.nextLine();
                    System.out.print("Metode pembayaran: ");
                    String metode = sc.nextLine();
                    app.tambahTransaksi(new Pengeluaran(tgl, nominal, kategori, ket, metode));
                }
                case 3 -> app.tampilkanSemua();
                case 4 -> System.out.printf("Saldo anda saat ini: Rp%,.2f\n\n", app.hitungSaldo());
                case 0 -> System.out.println("Terima kasih! Program selesai.");
                default -> System.out.println("Pilihan tidak valid.\n");
            }
        } while (pilih != 0);

        sc.close();
    }

}

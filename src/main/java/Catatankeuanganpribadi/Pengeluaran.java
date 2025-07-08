package Catatankeuanganpribadi;

import java.time.LocalDate;

public class Pengeluaran extends Transaksi {
    private String metodePembayaran;

    public Pengeluaran(LocalDate tanggal, double nominal, String kategori, String keterangan, String metodePembayaran) {
    super(tanggal, nominal, kategori, keterangan);
    this.metodePembayaran = metodePembayaran;
}

}

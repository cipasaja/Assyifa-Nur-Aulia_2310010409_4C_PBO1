package Catatankeuanganpribadi;

import java.time.LocalDate;

public class Pengeluaran extends Transaksi {
    private String metodePembayaran;

    public Pengeluaran(LocalDate tanggal, double nominal, String kategori, String keterangan, String metodePembayaran) {
    super(tanggal, nominal, kategori, keterangan);
    this.metodePembayaran = metodePembayaran;
}
    public String getMetodePembayaran() { return metodePembayaran; }
    public void setMetodePembayaran(String metodePembayaran) { this.metodePembayaran = metodePembayaran; }

    @Override
public String getInfoTransaksi() {
    return String.format("[PENGELUARAN] %s | %s | -Rp%,.2f | Metode: %s | %s",
        formatTanggal(), getKategori(), getNominal(), metodePembayaran, getKeterangan());
}

}

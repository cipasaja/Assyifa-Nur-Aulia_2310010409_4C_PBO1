package Catatankeuanganpribadi;

import java.time.LocalDate;

public class Transaksi {
    private LocalDate tanggal;
    private double nominal;
    private String kategori;
    private String keterangan;
    
public Transaksi(LocalDate tanggal, double nominal, String kategori, String keterangan) {
    this.tanggal = tanggal;
    this.nominal = nominal;
    this.kategori = kategori;
    this.keterangan = keterangan;
}
}



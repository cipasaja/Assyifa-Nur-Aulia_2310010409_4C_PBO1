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
public LocalDate getTanggal() { return tanggal; }
public void setTanggal(LocalDate tanggal) { this.tanggal = tanggal; }

public double getNominal() { return nominal; }
public void setNominal(double nominal) { this.nominal = nominal; }

public String getKategori() { return kategori; }
public void setKategori(String kategori) { this.kategori = kategori; }

public String getKeterangan() { return keterangan; }
public void setKeterangan(String keterangan) { this.keterangan = keterangan; }

}



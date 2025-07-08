package Catatankeuanganpribadi;

import java.time.LocalDate;

public class Pemasukan {
    private String sumber;

    public Pemasukan(LocalDate tanggal, double nominal, String kategori, String keterangan, String sumber) {
        super(tanggal, nominal, kategori, keterangan);
        this.sumber = sumber;
}
    public String getSumber() { return sumber; }
    public void setSumber(String sumber) { this.sumber = sumber; }


}

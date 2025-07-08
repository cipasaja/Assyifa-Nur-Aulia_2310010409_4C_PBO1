package Catatankeuanganpribadi;

import java.time.LocalDate;

public class Pemasukan {
    private String sumber;

    public Pemasukan(LocalDate tanggal, double nominal, String kategori, String keterangan, String sumber) {
        super(tanggal, nominal, kategori, keterangan);
        this.sumber = sumber;
}

}

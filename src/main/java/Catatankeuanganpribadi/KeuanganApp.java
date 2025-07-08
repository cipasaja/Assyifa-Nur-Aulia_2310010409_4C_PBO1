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

}

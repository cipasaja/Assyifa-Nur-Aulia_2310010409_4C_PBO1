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

}

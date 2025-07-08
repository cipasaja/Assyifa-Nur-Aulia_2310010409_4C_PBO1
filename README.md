# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi catatan keuangan pribadi menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini digunakan untuk mencatat transaksi pemasukan dan pengeluaran secara sederhana. Program ini akan menerima input dari user seperti tanggal, nominal, kategori, keterangan, serta sumber atau metode pembayaran, lalu menyimpan dan menampilkan data tersebut. Di akhir, user dapat melihat semua transaksi yang telah dicatat serta total saldo.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overriding, Seleksi, Perulangan, IO Sederhana, ArrayList, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Transaksi`, `Pemasukan`, `Pengeluaran`, dan `KeuanganApp` adalah contoh dari class.

```java
public abstract class Transaksi { ... }

public class Pemasukan extends Transaksi { ... }

public class Pengeluaran extends Transaksi { ... }

public class KeuanganApp { ... }
```

2. **Object** adalah instance dari class. Pada kode ini, objek dibuat dalam program utama:

```java
Transaksi t = new Pemasukan(tgl, nominal, kategori, ket, sumber);
app.tambahTransaksi(t);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `tanggal`, `nominal`, `kategori`, `keterangan`, `sumber`, dan `metodePembayaran` adalah contoh atribut.

```java
private LocalDate tanggal;
private double nominal;
private String kategori;
private String keterangan;
private String sumber;
private String metodePembayaran;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Contohnya:

```java
public Transaksi(LocalDate tanggal, double nominal, String kategori, String keterangan) { ... }

public Pemasukan(LocalDate t, double n, String k, String ket, String s) {
    super(t, n, k, ket);
    this.sumber = s;
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Misalnya:

```java
public void setNominal(double nominal) {
    this.nominal = nominal;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut:

```java
public double getNominal() {
    return nominal;
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi `private` dan hanya bisa diakses melalui method `getter/setter`.

```java
private LocalDate tanggal;
private String kategori;
```

8. **Inheritance** adalah pewarisan sifat dari superclass ke subclass. `Pemasukan` dan `Pengeluaran` mewarisi `Transaksi`.

```java
public class Pemasukan extends Transaksi { ... }
public class Pengeluaran extends Transaksi { ... }
```

9. **Overriding** adalah ketika subclass mengganti isi method superclass. Pada kode ini:

```java
@Override
public String getInfoTransaksi() {
    return String.format("[PEMASUKAN] %s | %s | Rp%,.2f | Sumber: %s | %s", ...);
}
```

10. **Seleksi** adalah pengambilan keputusan menggunakan `if`, `else if`, dan `switch`.

```java
if (t instanceof Pemasukan) {
    saldo += t.getNominal();
} else if (t instanceof Pengeluaran) {
    saldo -= t.getNominal();
}
```

11. **Perulangan** digunakan untuk mencetak seluruh transaksi yang tersimpan:

```java
for (Transaksi t : transaksiList) {
    System.out.println(t.getInfoTransaksi());
}
```

12. **Input Output Sederhana** digunakan untuk membaca dan menampilkan data:

```java
Scanner sc = new Scanner(System.in);
System.out.print("Tanggal: ");
String inputTanggal = sc.nextLine();
```

13. **Array** (menggunakan `ArrayList`) menyimpan banyak transaksi:

```java
private final List<Transaksi> transaksiList = new ArrayList<>();
```

14. **Error Handling** (bisa dikembangkan):

```java
try {
    LocalDate tgl = LocalDate.parse(input, Transaksi.TANGGAL_FMT);
} catch (Exception e) {
    System.out.println("Format tanggal salah!");
}
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Overriding     |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | ArrayList      |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Assyifa Nur Aulia  
NPM : 2310010409

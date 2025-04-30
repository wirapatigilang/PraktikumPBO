// Nama : Lalu Gilang Wirapait - 24060123140162
// Tanggal : 23 April 2025
// Nama File : Main.java
// Deskripsi : Main

import java.util.ArrayList;

public class TestPolimorfisme {
    public static void main(String[] args) {
        Pegawai pegawai1 = new Programmer("Mira");
        Pegawai pegawai2 = new Manajer("Joko");
        Manajer pegawai3 = new Manajer("Argo");

        ArrayList<Pegawai> emps = new ArrayList<>();
        emps.add(pegawai1);
        emps.add(pegawai2);
        emps.add(pegawai3);

        for (Pegawai emp : emps) {
            emp.tampilData();
        }
    }
}

// PERTANYAAN : 
// 1. Jelaskan manfaat polimorfisme pada kasus ini.
// 2. Apabila pada main program perlu menambahkan pegawai4 dan pegawai5! Apa permasalahan yang muncul jika diterapkan tanpa polimorfisme (inclusion)?

// JAWABAN : 
// 1. Polimorfisme membuat kode di main lebih ringkas dan memudahkan penanganan berbagai objek dengan cara yang sama.
// 2. Tanpa polimorfisme, objek harus disimpan sesuai tipe aslinya, sehingga tidak bisa dimasukkan ke dalam satu array bertipe Pegawai.
// Nama : Lalu Gilang Wirapait - 24060123140162
// Tanggal : 23 April 2025
// Nama File : Pegawai.java
// Deskripsi : Menyimpan Parent, Pegawai


public class Pegawai {
    private String nama;
    private int gajiPokok = 5000000;

    public Pegawai(){
        nama = "";
    }
    public Pegawai(String nama){
        this.nama = nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void tampilData() {
        System.out.println("Nama : " + nama + ", Gaji Pokok: " + gajiPokok);
    }
}
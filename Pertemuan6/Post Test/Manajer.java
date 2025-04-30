
// Nama : Lalu Gilang Wirapait - 24060123140162
// Tanggal : 23 April 2025
// Nama File : Manajer.java
// Deskripsi : Menyimpan Child, Manager

public class Manajer extends Pegawai {
    private int tunjangan = 700000;

    public Manajer(String nama) {
        super(nama);
    }

    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Tunjangan : " + tunjangan);
    }
}
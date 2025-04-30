// Nama : Lalu Gilang Wirapait - 24060123140162
// Tanggal : 23 April 2025
// Nama File : Programmer.java
// Deskripsi : Menyimpan Child, Programmer


public class Programmer extends Pegawai{
    private int bonus = 450000;

    public Programmer(String nama) {
        super(nama);
    }

    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Bonus : " + bonus);
    }
}
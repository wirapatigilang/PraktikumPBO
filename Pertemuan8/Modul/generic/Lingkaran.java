/*
 * FIle : Lingkaran.java
 * Deskirpsi : impelmentasi Lingkaran sebagai BangunDatar
 * Nama/Nim : Lalu Gilang Wirapati/24060123140162
 * Tanggal : 7 May 2025
 */


public class Lingkaran extends BangunDatar{
    private double jejari;

    public Lingkaran(double jejari) {
        this.jejari = jejari;
    }

    public double hitungKeliling() {
        return 2*jejari*3.14;
    }
}

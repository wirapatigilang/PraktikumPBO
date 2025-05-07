/*
 * FIle : BangunDatarGeneric.java
 * Deskirpsi : kelas konstruksi generic untuk BangunDatar
 * Nama/Nim : Lalu Gilang Wirapati/24060123140162
 * Tanggal : 7 May 2025
 */


public class BangunDatarGeneric <T extends BangunDatar> {
    private T bangunDatar;

    public void set (T tipeBangunDatar) {
        bangunDatar = tipeBangunDatar;
    }

    public T get() {
        return bangunDatar;
    }

    public double hitungKeliling () {
        return bangunDatar.hitungKeliling();
    }
}

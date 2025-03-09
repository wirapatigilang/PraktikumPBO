
/*
 * File : Asersi2
 * Deskripsi : Program untuk demi asersi, yang akan menolak input jari jari
 * lingkarang yang bernilai nol
 */


class Lingkaran{
    private double jariJari;
    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    public double hitungKeliling() {
        double keliling = 2*Math.PI*jariJari;
        return keliling;
    }
}


public class Asersi2 {
    public static void main(String[] args) {
        double jariJari=0;
        assert(jariJari>0):"Jari-jari tidak boleh nol!";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("Keliling Lingkaran : " + kelilingLingkaran);
    }
}

/*Kesalahan dalam code ini adalah jari jari di inisialisasi sebelum assersi.

maka progra akan tetap membuat objek lingkaran dengan nilai 0
yang tidak sesuai dengan tujuan assersi
 */

/* Nama File : Garis.java */
/* Deskripsi : berisi konstruktor dan beberapa method dalam class garis */
/* Pembuat : Lalu Gilang Wirapati*/
/* Tanggal : 19 Februari 2025*/



public class Garis {
    private Titik titik1;
    private Titik titik2;
    public static int counterGaris = 0;

    // Konstruktor
    public Garis() {
        this.titik1 = new Titik();
        this.titik2 = new Titik(1,1);
        counterGaris++;
    }

    public Garis(Titik titik1, Titik titik2) {
        this.titik1 = titik1;
        this.titik2 = titik2;
        counterGaris++;
    }


    // Getter
    public Titik getTitik1() {
        return titik1;
    }

    public Titik getTitik2() {
        return titik2;
    }

    public int getCounterGaris() {
        return counterGaris;
    }

    // Setter
    public void setTitik1(Titik T) {
        this.titik1 = T;
    }

    public void setTitik2(Titik T) {
        this.titik2 = T;
    }


    // Method
    public double panjangGaris() {
        return Math.sqrt((titik1.getAbsis()-titik2.getAbsis())*(titik1.getAbsis()-titik2.getAbsis())+(titik1.getOrdinat()-titik2.getOrdinat())*(titik1.getOrdinat()-titik2.getOrdinat()));
    }

    public double getGradient() {
        return (titik2.getOrdinat()-titik1.getOrdinat())/(titik2.getAbsis()-titik1.getAbsis());
    }

    public Titik getTengah() {
        Titik titikTengah = new Titik();
        titikTengah.setAbsis((titik1.getAbsis()+titik2.getAbsis())/2);
        titikTengah.setOrdinat((titik1.getOrdinat()+titik2.getOrdinat())/2);
        return titikTengah;
    }

    public boolean isSejajar(Garis G) {
        return this.getGradient() == G.getGradient();
    }

    public boolean isTegakLurus(Garis G) {
        return this.getGradient() * G.getGradient() == -1;
    }

    public void printGaris() {
        System.out.println("Titik Awal : " + this.getTitik1().getAbsis() + "," + this.titik1.getOrdinat());
        System.out.println("Titik Akhir : " + this.getTitik2().getAbsis() + "," + this.titik2.getOrdinat());

    }

    public String getPersamaan() {
        double m = this.getGradient();
        double c = this.titik1.getOrdinat() - m * this.titik1.getAbsis();

        return "y = " + m + "x + " + c;
    }
}

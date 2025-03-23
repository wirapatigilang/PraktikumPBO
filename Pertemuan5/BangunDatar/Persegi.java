package Java.Praktikum.PraktikumPBO.Pertemuan5.BangunDatar;

public class Persegi extends BangunDatar {
    private double sisi;
    private static int counterPersegi = 0;

    // Method
    public Persegi () {
        setJmlSisi(4);
        this.sisi = 0;
        counterPersegi++;
    }

    public Persegi (String warna, String border, double sisi) {
        super(4,warna,border);
        this.sisi = sisi;
        counterPersegi ++;
    }

    public double getSisi () {
        return this.sisi;
    }

    public void setSisi (double sisi) {
        this.sisi = sisi;
    }

    public double getLuas () {
        return this.sisi * this.sisi;
    }

    public double getKeliling () {
        return  this.sisi * 4;
    }

    public double getDiagonal () {
        return Math.sqrt(2)*this.sisi;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Sisi : " + getSisi());
    }
}

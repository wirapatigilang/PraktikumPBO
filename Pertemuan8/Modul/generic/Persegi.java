
public class Persegi extends BangunDatar{
    private double sisi;

    public Persegi(double sisi) {
        this.sisi=sisi;
    }

    public double hitungKeliling() {
        return 4*this.sisi;
    }

    public double hitungLuas () {
        return this.sisi*this.sisi;
    }
}

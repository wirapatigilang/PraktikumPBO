public class Persegi extends BangunDatar implements IResize{
    private double sisi;

    // Method
    public Persegi () {
        setJmlSisi(4);
        this.sisi = 0;
    }

    public Persegi (String warna, String border, double sisi) {
        super(4,warna,border);
        this.sisi = sisi;
    }

    public double getSisi () {
        return this.sisi;
    }

    public void setSisi (double sisi) {
        this.sisi = sisi;
    }

    @Override
    public double getLuas () {
        return this.sisi * this.sisi;
    }

    @Override
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

    public void zoomIn(){
        this.sisi = sisi * 1.1;
    }

    public void zoomOut() {
        this.sisi = sisi*0.9;
    }
}


public class Lingkaran extends BangunDatar{
    
    private double jari;

    //Methode
    public Lingkaran() {
        this.jari = 0;
        setJmlSisi(1);
    }

    public Lingkaran (double diameter, String warna, String border) {
        super(1, warna, border);
        this.jari = diameter/2;
        
    }

    public double getJari () {
        return this.jari;
    }

    public void setJari (double jari) {
        this.jari = jari;
    }

    @Override
    public double getLuas () {
        return Math.PI*jari*jari;
    }

    @Override
    public double getKeliling () {
        return Math.PI*jari*2;
    }

    @Override
    public void printInfo () {
        super.printInfo();
        System.out.println("Jari : " + getJari());
    }




    
}

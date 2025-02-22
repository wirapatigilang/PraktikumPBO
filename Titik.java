/* Nama File : Titik.java */
/* Deskripsi : berisi konstruktor dan beberapa method dalam class titik */
/* Pembuat : Lalu Gilang Wirapati*/
/* Tanggal : 19 Februari 2025*/


public class Titik {
    private double absis;
    private double ordinat;
    static int counter;


    // Konstruktor
    public Titik() {
        this.absis = 0;
        this.ordinat = 0;
        counter++;
    }

    public Titik(double x, double y) {
        this.absis = x;
        this.ordinat = y;
        counter++;
    }

    // Setter
    public void setAbsis(double x){
        this.absis = x;
    }

    public void setOrdinat(double y){
        this.ordinat = y;
    }

    // Getter
    public double getOrdinat() {
        return this.ordinat;
    }

    public double getAbsis() {
        return this.absis;
    }

    public int getCounter() {
        return counter;
    }

    // Method

    public void printTitik () {
        System.out.println("Absis : " + getAbsis() + "\nOrdinat : " + getOrdinat());
    }

    public void geserTitik(double x, double y) {
        this.absis = this.absis + x;
        this.ordinat = this.ordinat + y;
    }


    public int getKuadran() {
        if (getAbsis() >= 0 && getOrdinat() >= 0) {
            return 1;
        } else if (getAbsis() < 0 && getOrdinat() >= 0) {
            return 2;
        } else if (getAbsis() < 0 && getOrdinat() < 0) {
            return 3;
        } else {
            return 4;
        }
    }

    public double getJarakPusat() {
        return Math.sqrt((getAbsis()*getAbsis()) + (getOrdinat()*getOrdinat()));
    }

    public double getJarak(Titik T) {
        return Math.sqrt(((getAbsis()-T.getAbsis()) * (getAbsis())-T.getAbsis()) + ((getOrdinat() - T.getOrdinat()) * (getOrdinat() - T.getOrdinat())));
    }

    public void refleksiY() {
        setAbsis(getAbsis()* -1);    
    }

    public void refleksiX() {
        setOrdinat(getOrdinat()* -1);    
    }

    public double getRefleksiY(Titik T) {
        return T.getAbsis()*-1;
    }

    public double getRefleksiX(Titik T) {
        return T.getOrdinat()*-1;
    }


    
}

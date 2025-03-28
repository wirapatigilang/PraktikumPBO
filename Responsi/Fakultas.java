public class Fakultas {

    private String nama;
    private double tarifUKT;
    private double gajiPokok;

    public Fakultas () {
        this.nama = "";
        this.tarifUKT = 0;
        this.gajiPokok = 0;
    }

    public Fakultas (String nama, double tarifUKT, double gajiPokok) {
        this.nama = nama;
        this.tarifUKT = tarifUKT;
        this.gajiPokok = gajiPokok;
    }

    // setter
    public void setNama (String nama) {
        this.nama = nama;
    }

    public void setTarifUKT(double tarifUKT) {
        this.tarifUKT = tarifUKT;
    }

    public void setGajiPokok(double gajiPokok){
        this.gajiPokok = gajiPokok;
    }

    // Setter
    public String getNama () {
        return this.nama;
    }

    public double getTarifUKT () {
        return this.tarifUKT;
    }

    public double getGajiPokok () {
        return this.gajiPokok;
    }


}

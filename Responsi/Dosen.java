public class Dosen extends Karyawan {
    private Fakultas fakultas;
    private static int counter;

    public Dosen () {
        super();
        this.fakultas = new Fakultas();
        counter++;
    }

    public Dosen (String nama, String email, String nip, int masaKerja, Fakultas fakultas) {
        super(nama, email, nip, masaKerja);
        this.fakultas = fakultas;
        counter ++;
    }

    // Setter
    public void setFakultas (Fakultas fakultas) {
        this.fakultas = fakultas;
    }

    // Getter
    public Fakultas getFakultas () {
        return this.fakultas;
    }

    public int getCounter () {
        return counter;
    }

    @Override
    public double hitungGaji() {
        return (getFakultas().getGajiPokok()) + (getFakultas().getGajiPokok()*1/100*getMasaKerja());
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Gaji : " + hitungGaji());
    }
}

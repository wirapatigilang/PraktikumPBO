
public abstract class Karyawan extends CivitasAkademika {
    protected String nip;
    protected int masaKerja;

    public Karyawan(){
        super();
        this.nip = "";
        this.masaKerja = 0;
    }

    public Karyawan(String nama, String email, String nip, int masaKerja) {
        super(nama, email);
        this.nip = nip;
        this.masaKerja = masaKerja;
    }

    // getter
    public String getNIP () {
        return this.nip;
    }

    public int  getMasaKerja () {
        return this.masaKerja;
    }

    // setter
    public void setNIP (String nip){
        this.nip = nip;
    }

    public void setMasaKerja (int masaKerja) {
        this.masaKerja = masaKerja;
    }

    public abstract  double hitungGaji();

    @Override
    public void displayInfo() {
    super.displayInfo();
    System.err.println("NIP : " + getNIP());
    System.err.println("Masa Kerja : " + getMasaKerja());
    }
}

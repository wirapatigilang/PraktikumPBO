import java.time.LocalDate;

public class Dosen extends Pegawai{

    protected String fakultas;

    // Method

    public Dosen () {
        super();
        this.fakultas = "";
    }

    public Dosen (String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, int gajiPokok, String fakultas){
        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.fakultas = fakultas;
    }

    public void setFakultas (String fakultas) {
        this.fakultas = fakultas;
    }

    public String getFakultas () {
        return this.fakultas;
    }

    @Override
    public void PrintInfoPegawai() {
        System.out.println("NIP : " + nip);
        super.PrintInfoPegawai();
        System.err.println("Fakkultas : " + fakultas);
    }




    

}

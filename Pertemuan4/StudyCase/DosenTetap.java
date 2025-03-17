import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;


public class DosenTetap extends Dosen {
    
    private String nomorIDN;

    // Konstruktor
    public DosenTetap () {
        super();
        this.nomorIDN = "";
    }

    public DosenTetap (String nip, String nama,  String nomorIDN, LocalDate tanggalLahir, LocalDate tmt, int gajiPokok, String fakultas) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok, fakultas);
        this.nomorIDN = nomorIDN;

    }
    

    // Setter
    public void setNomorIDN (String nomorIDN) {
        this.nomorIDN = nomorIDN;
    }

    // Getter 
    public String getNomorIDN () {
        return this.nomorIDN;
    }

    public String getBUP() {
        LocalDate bupDate = getTanggalLahir().plusYears(65).plusMonths(1);
        return bupDate.format(DateTimeFormatter.ofPattern("d MMMM yyyy"));
    }


    private double getTunjangan () {
        Period masaKerja = Period.between(tmt, LocalDate.now());
        int tahunMasaKerja = masaKerja.getYears();
        return getGajiPokok() * tahunMasaKerja * 0.02;
    }

    @Override
    public void PrintInfoPegawai () {
        
        Period masaKerja = Period.between(tmt, LocalDate.now());
        int tahunMasaKerja = masaKerja.getYears();

        System.out.println("NIDN : " + nomorIDN);
        super.PrintInfoPegawai();
        System.out.println("Jabatan : Dosen Tetap");
        System.out.println("BUP : " + getBUP());
        System.out.println("Gaji Pokok : Rp" + getGajiPokok());
        System.out.println("Tunjangan : 2% * " + tahunMasaKerja + " * Rp" + getGajiPokok() + " = Rp" + getTunjangan());

    }


    

}

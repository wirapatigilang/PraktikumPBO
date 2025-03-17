import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Tendik extends Pegawai {
    private String bidang;

    public Tendik () {
        super();
        this.bidang  = "";
    }

    public Tendik (String nip, String nama, String bidang, LocalDate tanggalLahir, LocalDate tmt, int gajiPokok) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.bidang = bidang;
    }

    //Setter
    public void setBidang (String bidang) {
        this.bidang = bidang;
    }
    

    // Getter
    public String getBidang () {
        return this.bidang;
    }

    // Method Lainnya

    public String getBUP() {
        LocalDate bupDate = tanggalLahir.plusYears(55);
        return bupDate.format(DateTimeFormatter.ofPattern("d MMMM yyyy"));
    }

    public double getTunjangan () {
        Period masaKerja = Period.between(tmt, LocalDate.now());
        int tahunMasaKerja = masaKerja.getYears();

        return tahunMasaKerja * getGajiPokok() * 0.01;
    }


    @Override
    public void PrintInfoPegawai () {
        
        Period masaKerja = Period.between(tmt, LocalDate.now());
        int tahunMasaKerja = masaKerja.getYears();

        super.PrintInfoPegawai();
        System.out.println("Jabatan : Dosen Tetap");
        System.out.println("BUP : " + getBUP());
        System.out.println("Gaji Pokok : Rp" + getGajiPokok());
        System.out.println("Tunjangan : 1% * " + tahunMasaKerja + " * Rp" + getGajiPokok() + " = Rp" + getTunjangan());

    }
}


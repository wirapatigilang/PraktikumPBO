
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;


public class Pegawai {
    
    protected  String nip;
    protected  String nama;
    protected  LocalDate tanggalLahir;
    protected  LocalDate tmt;
    protected  int gajiPokok;


    // Method

    public Pegawai () {
        this.nip = "";
        this. nama = "";
        this.tanggalLahir = LocalDate.of(0000, 1, 1);
        this.tmt = LocalDate.of(0000, 1, 1);
        this.gajiPokok = 0;
    }

    public Pegawai (String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, int gajiPokok) {
        this.nip = nip;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.tmt = tmt;
        this.gajiPokok = gajiPokok;

    }

    // Setter dan Getter
    public  String getNip () {
        return this.nip;
    }

    public void setNip (String nip) {
        this.nip = nip;
    }

    public String getNama () {
        return this.nama;
    }

    public void setNama (String nama) {
        this.nama = nama;
    }


    public LocalDate getTanggalLahir() {
        return this.tanggalLahir;
    }
    
    public void  setTanggalLahir (LocalDate tanggalLahir){
        this.tanggalLahir = tanggalLahir;
    }

    public LocalDate getTMT () {
        return this.tmt;
    }

    public void setTMT (LocalDate tmt){
        this.tmt = tmt;
    }


    public int getGajiPokok () {
        return this.gajiPokok;
    }

    public void setGajiPokok (int gajiPokok) { 
        this.gajiPokok = gajiPokok;
    }


    public String getMasaKerja () {
        Period period = Period.between(tmt, LocalDate.now());
        int tahun = period.getYears();
        int bulan = period.getMonths();

        return tahun + " Tahun " + bulan + " Bulan";
    }

    public void PrintInfoPegawai() {

        @SuppressWarnings("deprecation")
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("id", "ID"));
        System.out.print("Nama : " + getNama() + "\n" +
                         "Tanggal Lahir : " + getTanggalLahir().format(formatter) + "\n" +
                         "TMT : " + getTMT().format(formatter) + "\n" +
                         "Masa Kerja : " + getMasaKerja() + "\n");
    }


}

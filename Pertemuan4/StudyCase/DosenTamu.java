
import java.time.LocalDate;
import java.time.Period;

class DosenTamu extends Dosen {

    private String nomorIDK;
    private final LocalDate kontrak;

    // Konstruktor
    public DosenTamu (){
        super();
        this.nomorIDK = "";
        this.kontrak = LocalDate.of(0, 0, 0);
    }
    
    public DosenTamu (String nip,  String nomorIDK, String nama, LocalDate tanggalLahir, LocalDate tmt, int gajiPokok, String fakultas, LocalDate kontrak) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok, fakultas);
        this.nomorIDK = nomorIDK;
        this.kontrak = kontrak;

    }

    // Setter
    public void setNomorIDK (String nomorIDK) {
        this.nomorIDK = nomorIDK;
    }

    // Getter
    public String getNomorIDK () {
        return this.nomorIDK;
    }

    public LocalDate getKontrak () {
        return this.kontrak;
    }

    public String getKontrakHabis() {
        Period remaining = Period.between(LocalDate.now(), kontrak);
        return String.format("%d Tahun %d Bulan", remaining.getYears(), remaining.getMonths());
    }

    private double getTunjangan () {
        return 0.025 * getGajiPokok();
    }


    @Override
    public void PrintInfoPegawai () {
        System.out.println("NIDN : " + getNomorIDK());
        super.PrintInfoPegawai();
        System.out.println("Jabatan : Dosen Tamu");
        System.out.println("Kontrak Berakhir Dalam  : " + getKontrakHabis());
        System.out.println("Gaji Pokok : Rp" + getGajiPokok());
        System.out.println("Tunjangan : 2.5% * Rp"+ getGajiPokok() + " = Rp"+ getTunjangan());

    }
}
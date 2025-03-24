import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


class PNS extends Manusia implements Pajak {
    private String nip;
    private static int counterPNS = 0;

    public PNS(String nama, String tgl_mulai_kerja, String alamat, double pendapatan, String nip) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }
    
    @Override
    public int hitungMasaKerja() {
        return (int) ChronoUnit.YEARS.between(tgl_mulai_kerja, LocalDate.now()) + 2; // A=2
    }

    @Override
    public double hitungPajak() {
        return 0.1 * pendapatan;
    }

    public static int getCounterPNS() {
        return counterPNS;
    }
}
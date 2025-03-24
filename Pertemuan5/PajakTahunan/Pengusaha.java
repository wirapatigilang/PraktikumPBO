import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

class Pengusaha extends Manusia implements Pajak {
    private String npwp;
    private static int counterPengusaha = 0;

    public Pengusaha(String nama, String tgl_mulai_kerja, String alamat, double pendapatan, String npwp) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }
    
    @Override
    public int hitungMasaKerja() {
        return (int) ChronoUnit.YEARS.between(tgl_mulai_kerja, LocalDate.now()) + 1; // B=1
    }

    @Override
    public double hitungPajak() {
        return 0.15 * pendapatan;
    }

    public static int getCounterPengusaha() {
        return counterPengusaha;
    }
}
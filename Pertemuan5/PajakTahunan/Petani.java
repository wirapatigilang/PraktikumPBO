import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

class Petani extends Manusia implements Pajak {
    private String asal_kota;
    private static int counterPetani = 0;

    public Petani(String nama, String tgl_mulai_kerja, String alamat, double pendapatan, String asal_kota) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.asal_kota = asal_kota;
        counterPetani++;
    }
    
    @Override
    public int hitungMasaKerja() {
        return (int) ChronoUnit.YEARS.between(tgl_mulai_kerja, LocalDate.now()) + 4; // C=4
    }

    @Override
    public double hitungPajak() {
        return 0;
    }

    public static int getCounterPetani() {
        return counterPetani;
    }
}

public class TenagaPendidikan extends Karyawan{
    private static int counter;

    public TenagaPendidikan() {
        super();
        counter++;
    }

    public TenagaPendidikan(String nama, String email, String nip, int masaKerja) {
        super(nama, email, nip, masaKerja);
        counter ++;
    }

    public static int getCounter() {
        return counter;
    }

    @Override
    public double  hitungGaji() {
        return (4000000) + (0.001 * 4000000 * getMasaKerja());
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Gaji : "+hitungGaji());
    }
}

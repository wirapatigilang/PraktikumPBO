
import java.time.LocalDate;




public class Main {

    public static void main(String[] args) {
    System.out.println("\n\n Dosen Tetap\n");

    DosenTetap Dosen2 = new DosenTetap("9545647548", "Lalu Gilang Wirapati", "78647324", LocalDate.of(2005, 7, 27), LocalDate.of(2023, 9, 1), 5000000, "Fakultas Sain dan Matematika");
    Dosen2.PrintInfoPegawai();

    
    System.out.println("\n\n Dosen Tamu\n");

    DosenTamu Dosen3 = new DosenTamu("9545603946", "7864273", "Hilma Alifah Baskoro", LocalDate.of(2004, 9, 22), LocalDate.of(2020, 1, 1), 4500000, "Fakultas Kedokteran", LocalDate.of(2030, 7, 1));
    Dosen3.PrintInfoPegawai();

    System.out.println("\n\n Tenaga Pendidikan\n");

    Pegawai TP1 = new Tendik("9314057391", "Indra Purwanto", "Akademik", LocalDate.of(2003, 9, 12), LocalDate.of(2020, 3, 9), 3000000);
    TP1.PrintInfoPegawai();



    }





    
}

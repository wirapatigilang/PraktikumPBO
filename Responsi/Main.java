public class Main {
    public static void main(String[] args) {
        // Membuat objek Fakultas
        Fakultas FSM = new Fakultas("Sains dan Matematika", 5000000, 8000000);
        Fakultas FIB = new Fakultas("Ilmu Budaya", 4000000, 7000000);

        // Membuat objek Mahasiswa
        Mahasiswa mhs1 = new Mahasiswa("Lalu Gilang Wirapati", "wirapatigilang@gmail.com", "220001", 4, FSM);
        Mahasiswa mhs2 = new Mahasiswa("Dyu Renes Jaladri", "dyurenes@gemail.com", "220002", 6, FIB);
        
        // Membuat objek Dosen
        Dosen dosen1 = new Dosen("Prof Hedar Ali", "hedaraliganteng@gmail.com", "D12345", 10, FSM);
        Dosen dosen2 = new Dosen("Prof Tio Wanto", "tiowanto@email.com", "D67890", 15, FIB);
        
        // Membuat objek Tenaga Kependidikan
        TenagaPendidikan tp1 = new TenagaPendidikan("Gibran lawapres", "gibranlawapres@gmail.com", "T001", 8);
        TenagaPendidikan tp2 = new TenagaPendidikan("Fatih Sum Ting Wong", "fatihstw@email.com", "T002", 12);
        
        // Menampilkan informasi Mahasiswa
        System.out.println("=== Informasi Mahasiswa ===");
        mhs1.displayInfo();
        System.out.println();
        mhs2.displayInfo();
        System.out.println();
        
        // Menampilkan informasi Dosen
        System.out.println("=== Informasi Dosen ===");
        dosen1.displayInfo();
        System.out.println();
        dosen2.displayInfo();
        System.out.println();
        
        // Menampilkan informasi Tenaga Pendidikan
        System.out.println("=== Informasi Tenaga Kependidikan ===");
        tp1.displayInfo();
        System.out.println();
        tp2.displayInfo();
        System.out.println();
        
        // Menampilkan jumlah objek yang telah dibuat
        System.out.println("Total Mahasiswa: " + mhs1.getCounter());
        System.out.println("Total Dosen: " + dosen1.getCounter());
        System.out.println("Total Tenaga Kependidikan: " + tp1.getCounter());
    }
}

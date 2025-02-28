public class MMahasiswa {

    public static void main(String[] args) {

        Dosen Wira = new Dosen("123", "Wira", "Informatika");
        MataKuliah PBO = new MataKuliah("PBO", "Pemrograman Berbasis Objek", 3);
        MataKuliah ASA = new MataKuliah("ASA", "Analisa Strategi Algrotima", 3);

        Kendaraan XSR155 = new Kendaraan("DR 4406 MW" ,"Motor");
        Kendaraan BMWE30 = new Kendaraan("G 1 LANG", "Mobil");

        Mahasiswa Gilang = new Mahasiswa("162", "Gilang", "Informatika", Wira, XSR155);

        Gilang.addMatKul(ASA);
        Gilang.addMatKul(PBO);

        Gilang.detailMahasiswa();
        System.out.println("Banyak Mata Kuliah : " + Gilang.getJumlahMatkul());
        System.out.println("Banyak SKS : " + Gilang.getJumlahSKS());

        Mahasiswa Lalu = new Mahasiswa("163", "Lalu", "Informatika");
        Lalu.setDosenWali(Wira);
        Lalu.addMatKul(ASA);
        Lalu.setKendaraan(BMWE30);

        Lalu.detailMahasiswa();


    }


}

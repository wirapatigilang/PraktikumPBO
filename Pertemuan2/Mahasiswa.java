/* Nama File : Mahasiswa.java */
/* Deskripsi : Berisi Konstruktor dan method untuk Mahasiswa */
/* Pembuat : Lalu Gilang Wirapati*/
/* Tanggal : 1 Maret 2025*/

import java.util.ArrayList;

public class Mahasiswa {
    private String nim;
    private String nama;
    private String prodi;
    ArrayList <MataKuliah> listMatKul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    // Konstruktor
    public Mahasiswa () {
        this.nim = "";
        this.nama = "";
        this.prodi = "";
        this.listMatKul = new ArrayList<>();
        this.dosenWali = new Dosen();
        this.kendaraan = new Kendaraan();
    }

    public Mahasiswa (String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatKul = new ArrayList<>();
        this.dosenWali = new Dosen();
        this.kendaraan = new Kendaraan();

    }

    public Mahasiswa(String nim, String nama, String prodi, Dosen dosenWali, Kendaraan kendaraan) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatKul = new ArrayList<>();
        this.dosenWali = dosenWali;
        this.kendaraan = kendaraan;

    }

    // Setter
    public void setNim (String nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setProdi (String prodi) {
        this.prodi = prodi;
    }

    public void setMatKul (ArrayList <MataKuliah> listMatKul) {
        this.listMatKul = listMatKul;
    }

    public void setDosenWali (Dosen dosenWali) {
        this.dosenWali = dosenWali;
    }

    public void setKendaraan (Kendaraan kendaraan) {
        this.kendaraan = kendaraan;
    }

    // Getter 
    public String getNIM () {
        return this.nim;
    }

    public String getNama () {
        return this.nama;
    }

    public String getProdi () {
        return this.prodi;
    }

    public ArrayList <MataKuliah> getListMatKul () {
        return this.listMatKul;
    }

    public Dosen getDosenWali () {
        return this.dosenWali;
    }

    public Kendaraan getKendaraan () {
        return this.kendaraan;
    }

    // Method
    public void addMatKul (MataKuliah newMatKul) {
        listMatKul.add(newMatKul);
    }

    public void printMahasiswa () {
        System.out.println("Nim : " + nim);
        System.out.println("Nama : " + nama);
        System.out.println("Prodi : " + prodi);
    }

    public void detailMahasiswa () {
        System.out.println("Nim : " + nim);
        System.out.println("Nama : " + nama);
        System.out.println("Prodi : " + prodi);
        System.out.println("Dosen Wali : " + dosenWali.getNama());
        System.out.println("Mata Kuliah :");
        int i;
        for (i = 0; i<listMatKul.size(); i++) {
            System.out.println(listMatKul.get(i).getNama());
        }

    }

    public int getJumlahMatkul () {
        int i;
        int count = 0;
        for (i = 0; i < listMatKul.size(); i++){
            count = count + 1;
        }
        return count;
    }

    public int getJumlahSKS () {
        int i;
        int count = 0;
        for (i = 0; i < listMatKul.size(); i++) {
            count = count + listMatKul.get(i).getSKS();
        }
        return count;
    }
}

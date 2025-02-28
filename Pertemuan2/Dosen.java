/* Nama File : Dosen.java */
/* Deskripsi : Berisi Konstruktor dan method untuk Dosen */
/* Pembuat : Lalu Gilang Wirapati*/
/* Tanggal : 19 Februari 2025*/


public class Dosen {
    private String NIP;
    private String Nama;
    private String Prodi;

    // Konstruktor
    public Dosen() {
        this.NIP = "-";
        this.Nama =  "-";
        this.Prodi = "-";
    }

    public Dosen (String NIP, String Nama, String Prodi) {
        this.NIP = NIP;
        this.Nama = Nama;
        this. Prodi = Prodi;
    }
    // Setter 
    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public void SetNIP(String NIP) {
        this.NIP = NIP;
    }
    
    public void setProdi(String Prodi) {
        this.Prodi = Prodi;
    }

    // Getter
    public String getNama() {
        return this.Nama;
    }

    public String getNIP() {
        return this.NIP;
    }

    public String getProdi() {
        return this.Prodi;
    }


}

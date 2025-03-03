/* Nama File : Kendaraan.java */
/* Deskripsi : Berisi Konstruktor dan method untuk Kendaraan */
/* Pembuat : Lalu Gilang Wirapati*/
/* Tanggal : 1 Maret 2025*/

public class Kendaraan {
    private String noPlat;
    private String jenis;

    // Konstruktor
    public Kendaraan () {
        this.noPlat = "-";
        this.jenis = "-";
    }

    public Kendaraan (String noPlat, String jenis) {
        this.noPlat = noPlat;
        this.jenis = jenis;
    } 

    // Setter
    public void setNoPlat(String noPlat) {
        this.noPlat =noPlat;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    // Getter
    public String getNoPlat() {
        return this.noPlat;
    }

    public String getJenis() {
        return this.jenis;
    }
    
}

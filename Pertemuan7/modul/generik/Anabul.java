/* Nama File    : Anabul.java
 * Deskripsi    : Anabul (Superclass)
 * Pembuat      : Lalu Gilang Wirapati
 * Tanggal      : 4 Mei 2025
 */

 public abstract class Anabul {
    private String nama;

    public Anabul(){
        nama = "";
    }

    public Anabul (String nama){
        this.nama = nama;
    }

    public String getNama(){
        return nama;
    }

    public void setNama(String n){
        nama = n;
    }
    
    public abstract void Gerak();
    public abstract void Bersuara();
}
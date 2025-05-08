public class Anabul {
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
    
    public void Gerak() {
        System.out.println(nama + "bergerak");
    }

    public void Bersuara() {
        System.out.println(nama + "bersuara");
    }
}

public class Menu {
    private String nama;
    private double harga;
    private int stok;

    public Menu(String nama, double harga, int stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    public String getNama(){
        return this.nama;
    }

    public double getHarga() {
        return this.harga;
    }

    public int getStok() {
        return this.stok;
    }

    public void setNama (String nama){
        this.nama = nama;
    }

    public void setHarga (double harga) {
        this.harga= harga;
    }

    public void setStok (int stok) {
        this.stok = stok;
    }

    public void kurangiStok(int jumlah) {
        // ToDo 1 : Tambahkan metode untuk mengurangi jumlah stok
        this.stok -= jumlah;
    }
}

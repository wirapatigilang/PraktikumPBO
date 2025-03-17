
public class BangunDatar {
    private int jmlSisi;
    private String warna;
    private String border;
    public static int counterBangunDatar=0;

    // Methode
    public BangunDatar() {
        this.jmlSisi = 0;
        this.warna = "";
        this.border = "";
        counterBangunDatar += 1;
    }

    public BangunDatar (int jmlSisi, String warna, String border) {
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar +=1;
    }

    // Getter
    public int getJmlSisi() {
        return this.jmlSisi;
    }

    public String getWarna() {
        return this.warna;
    }

    public String getBorder() {
        return this.border;
    }

    // Setter
    public void setJmlSisi (int jmlSisi) {
        this.jmlSisi = jmlSisi;
    }

    public void setWarna (String warna) {
        this.warna = warna;
    }

    public void setBorder (String border) {
        this.border = border;
    }

    public void printInfo () {
        System.out.println("Jumlah Sisi : " + getJmlSisi());
        System.out.println("warna : " + getWarna());
        System.out.println("border : " + getBorder());
    }

}

/*
1. Tambahkan keyword final pada kelas BangunDatar. Bagaimana pengaruhnya terhadap kelas
Persegi dan Lingkaran? 
2. Hapus kembali keyword final pada kelas BangunDatar, lalu tambahkan keyword final pada method
printInfo() di dalam kelas BangunDatar. Bagaimana pengaruhnya dengan method printInfo() pada
kelas Persegi dan Lingkaran?

Jawab:
1. Apabila bangun datar diberikan final, maka tidak akan bisa mewarisi ke subclass d bawahnya
2. gabisa memanggil super PrintInfo, yang mengakibatkan harus menulis ulang setiap code di subclass
*/
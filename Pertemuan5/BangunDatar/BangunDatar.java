
public abstract class BangunDatar {
    protected  int jmlSisi;
    protected  String warna;
    protected  String border;
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

    abstract public double getLuas();

    abstract public double getKeliling();

}

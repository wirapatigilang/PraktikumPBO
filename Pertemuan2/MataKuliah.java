/* Nama File : MataKuliah.java */
/* Deskripsi : Berisi Konstruktor dan method untuk MataKuliah */
/* Pembuat : Lalu Gilang Wirapati*/
/* Tanggal : 1 Maret 2025*/

public class MataKuliah {
    private String idMatKul;
    private String nama;
    private int SKS;

    //Konstruktor

    public MataKuliah () {
        this.idMatKul = "-";
        this.nama = "-";
        this.SKS = 0;
    }

    public MataKuliah (String idMatKul,String nama, int SKS) {
        this.idMatKul = idMatKul;
        this.nama = nama;
        this.SKS = SKS;
    }

    // Setter

    public void setIdMatKul(String idMatKul) {
        this.idMatKul = idMatKul;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setSKS(int SKS) {
        this.SKS = SKS;
    }

    // Getter

    public String getIdMatKul() {
        return this.idMatKul;
    }

    public String getNama () {
        return this.nama;
    }

    public int getSKS () {
        return this.SKS;
    }




}

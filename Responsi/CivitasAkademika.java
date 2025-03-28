
public abstract class CivitasAkademika {
    protected String nama;
    protected String email;

    public CivitasAkademika() {
        this.nama = "";
        this.email = "";
    }

    public CivitasAkademika(String nama, String email) {
        this.nama = nama;
        this.email = email;
    }

    // getter
    public String getNama () {
        return this.nama;
    }

    public String getEmail () {
        return this.email;
    }

    // setter
    public void setNama (String nama) {
        this.nama = nama;
    }

    public void setEmail (String email) {
        this.email = email;
    }

    public void displayInfo () {
        System.err.println("Nama : " + getNama());
        System.err.println("Email : " + getEmail());
    }
}

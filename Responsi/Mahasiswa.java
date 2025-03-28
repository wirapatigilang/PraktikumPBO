
public class Mahasiswa extends CivitasAkademika {
    private String nim;
    private int semester;
    private Fakultas fakultas;
    static int counter;

    public Mahasiswa (){
        super();
        this.nim = "";
        this.semester = 0;
        this.fakultas = new Fakultas();
        counter++;
    }

    public Mahasiswa (String nama, String email, String nim, int semester, Fakultas fakultas) {
        super(nama, email);
        this.nim = nim;
        this.semester = semester;
        this.fakultas = fakultas;
        counter++;
    }

    // setter
    public void setNIM (String nim) {
        this.nim = nim;
    }

    public void setSemester (int semester) {
        this.semester = semester;
    }

    public void  setFakultas (Fakultas fakultas) {
        this.fakultas = fakultas;
    }

    // getter
    public String getNIM () {
        return this.nim;
    }

    public int getSemester () {
        return this.semester;
    }

    public Fakultas getFakultas () {
        return this.fakultas;
    }

    public double hitungUKT () {
        return getFakultas().getTarifUKT() - (getSemester()*5/100)*getFakultas().getTarifUKT();
    }

    @Override
    public void  displayInfo () {
        super.displayInfo();
        System.out.println("NIM : " + getNIM());
        System.out.println("Semester : " + getSemester());
        System.out.println("Fakultas : " + getFakultas().getNama());
        System.out.println("UKT : " + hitungUKT());
    }

    public int getCounter() {
        return counter;
    }
}

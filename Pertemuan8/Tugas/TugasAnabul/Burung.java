public class Burung extends Anabul {
    public Burung(){
        super();
    }

    public Burung(String nama) {
        super(nama);
    }

    @Override
    public void Gerak() {
        System.out.println(getNama() + " bergerak terbang");
    }

    @Override
    public void Bersuara() {
        System.out.println(getNama() + " bersuara Cuit");
    }
}
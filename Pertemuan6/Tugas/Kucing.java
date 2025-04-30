class Kucing extends Anabul {

    public Kucing(){
        super();
    }   
    public Kucing(String nama) {
        super(nama);
    }

    @Override
    public void Gerak() {
        System.out.println(getNama() + " bergerak melata");
    }

    @Override
    public void Bersuara() {
        System.out.println(getNama() + " bersuara Meong");
    }
}
public class Main {
    public static void main(String[] args) {
        Anjing a = new Anjing();
        Datum<Anabul> x = new Datum<>();
        x.setIsi(a);
        x.getIsi().Bersuara();
        x.getIsi().Gerak();
        x.setIsi(new Burung());
        x.getIsi().Gerak();
        x.getIsi().Bersuara();

    }
}
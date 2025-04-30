import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Anabul anabul1 = new Kucing("budi");
        Anabul anabul2 = new Anjing("budii");
        Anabul anabul3 = new Burung("budiii");

        ArrayList<Anabul> anabuls = new ArrayList<>();
        anabuls.add(anabul1);
        anabuls.add(anabul2);
        anabuls.add(anabul3);

        for (Anabul h : anabuls) {
            h.Gerak();   
            h.Bersuara();
            System.out.println();
        }
    }
}
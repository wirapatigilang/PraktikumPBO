import java.util.ArrayList;

public class KoleksiAnabul <T extends Anabul> {
    private ArrayList<T> WadahAnabul;
    private int nbElm;

    public KoleksiAnabul() {
        WadahAnabul = new ArrayList<>();
        nbElm = 0;
    }

    public void tambahAnabul(T anabul) {
        WadahAnabul.add(anabul);
        nbElm++;
    }

    public void removeAnabul(int index) {
        WadahAnabul.remove(index);
        nbElm--;
    }

    public void showAll() {
        System.out.println("-- Daftar Semua Anabul --");
        

        for (int i = 0; i < WadahAnabul.size(); i++){
            T anabul = WadahAnabul.get(i);

            System.out.println("Anabul #" + (i+1));
            System.out.println("Nama : " + anabul.getNama());
            System.out.println("Tipe : " + anabul.getClass().getSimpleName());
            System.out.print("Suara : ");
            anabul.Bersuara();
            System.out.print("Gerakan : ");
            anabul.Gerak();

        }


        System.out.println("Total Anabul : " + this.nbElm);
    }




}

import java.util.ArrayList;

public class Koleksi {
    private ArrayList<Character> wadah;
    private int nbElm;

    public Koleksi(int size){
        this.wadah = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            wadah.add('-');
        }
        this.nbElm = 0;
    }

    public ArrayList<Character> getIsi() {
        return wadah;
    }

    public void setIsi (int index, char value) {
        if (index >= 0 && index < wadah.size()) {
            wadah.set(index, value);
        }
        else {
            System.out.print("Index yang anda masukkan salah");
        }
    }

    public int getSize (){
        return wadah.size();
    }

    public void add (char value) {
        if (nbElm < wadah.size()) {
            wadah.set(nbElm, value);
            nbElm++;
        } else {
            System.out.println("Wadah sudah penuh, tidak bisa menambahkan character baru");
        }
    }


    public void delete (int index) {
        if (index >= 0 && index < nbElm) {
            for (int i = index; i < nbElm - 1; i++) {
                wadah.set(i, wadah.get(i + 1));
            }
            wadah.set(nbElm - 1, '-');
            nbElm--;
        } else {
            System.out.println("Index yang anda masukkan salah");
        }
    }

    public void showAll () {
        for (int i = 0; i < nbElm; i++) {
            System.out.print(wadah.get(i) + " ");
        }
    }
}


public class Main {
    public static void main(String[] args) {

        Anabul anabul1 = new Kucing("MIMI");
        Anabul anabul2 = new Anjing("GUGU");
        Anabul anabul3 = new Burung("CICI");
        Anabul anabul4 = new Burung("CUIT");
        Anabul anabul5 = new Kucing("MUMU");
        Anabul anabul6 = new Anjing("BOB");
        Anabul anabul7 = new Burung("KIW");
        Anabul anabul8 = new Kucing("BETI");
        Anabul anabul9 = new Anjing("GAGA");
        Anabul anabul10 = new Burung("PIPIT");


        KoleksiAnabul<Anabul> Petshop = new KoleksiAnabul<>();
        Petshop.tambahAnabul(anabul1);
        Petshop.tambahAnabul(anabul2);
        Petshop.tambahAnabul(anabul3);
        Petshop.tambahAnabul(anabul4);
        Petshop.tambahAnabul(anabul5);
        Petshop.tambahAnabul(anabul6);
        Petshop.tambahAnabul(anabul7);
        Petshop.tambahAnabul(anabul8);
        Petshop.tambahAnabul(anabul9);
        Petshop.tambahAnabul(anabul10);

        Petshop.showAll();


        System.out.println("Menghapus Salah satu anabul");
        Petshop.removeAnabul(3);
        Petshop.showAll();

    }
}
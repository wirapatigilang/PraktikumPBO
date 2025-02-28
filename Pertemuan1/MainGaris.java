
/* Nama File : Titik.java */
/* Deskripsi : berisi main garis */
/* Pembuat : Lalu Gilang Wirapati*/
/* Tanggal : 19 Februari 2025*/



public class MainGaris {

    public static void main(String[] args) {
        Garis G1 = new Garis();

        System.out.println("Garis 1\n");
        G1.setTitik1(new Titik(0,0));
        G1.setTitik2(new Titik(2,2));
        G1.getTitik1().printTitik();
        G1.getTitik2().printTitik();
        System.out.println("\n");
        System.out.println("Banyak garis : " + Garis.counterGaris);

        System.out.println("Panjang Garis G1 : " + G1.panjangGaris());
        System.out.println("Gradient G1 : " + G1.getGradient());

        System.out.println("\nTitik Tengah G1");
        G1.getTengah().printTitik();



        Garis G2 = new Garis(new Titik(1,1), new Titik(3,3));
        System.out.println("\nGaris 2");
        G2.getTitik1().printTitik();
        G2.getTitik2().printTitik();
    
        System.out.println("Apakah Garis Sejajar : " + G1.isSejajar(G2));

        Garis G3 = new Garis(new Titik(0,1), new Titik(1,0));
        System.out.println("\nGaris 2");
        G3.getTitik1().printTitik();
        G3.getTitik2().printTitik();

        System.out.println("Apakah Garis Tegak Lurus : " + G2.isTegakLurus(G3));

        System.out.println("\n");
        G1.printGaris();
        System.out.println("\n");
        G2.printGaris();
        System.out.println("\n");
        G3.printGaris();
        System.out.println(G3.getPersamaan());
    }


    

}   


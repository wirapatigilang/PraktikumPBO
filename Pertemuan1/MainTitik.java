/* Nama File : Titik.java */
/* Deskripsi : berisi main titik */
/* Pembuat : Lalu Gilang Wirapati*/
/* Tanggal : 19 Februari 2025*/


public class MainTitik {
    
    public static void main(String[] args) {
        Titik T1 = new Titik();

        T1.setAbsis(9.0);
        T1.setOrdinat(8.0);
        T1.geserTitik(-6, -4);

        System.out.println("Absis : " + T1.getAbsis());
        System.out.println("Ordinat : " + T1.getOrdinat());
        System.out.println("Jumlah Titik : " + Titik.counter);
        System.out.println("Berada di Kuadran : " + T1.getKuadran());
        System.out.println("Jarak ke titik Pusat : " + T1.getJarakPusat());

        Titik T2 = new Titik(10,10);

        // System.out.println("\nAbsis : " + T2.getAbsis());
        // System.out.println("Ordinat : " + T2.getOrdinat()); 
        T2.printTitik();  
        System.out.println("Jumlah Titik : " + Titik.counter);
        System.out.println("Jarak ke T1 : " + T2.getJarak(T1));
        T2.refleksiX();
        T2.refleksiY();
        System.out.println("Absis setelah refleksi : " + T2.getAbsis());
        System.out.println("Ordinat setelah refleksi : " + T2.getOrdinat()); 
        
    }
    
}

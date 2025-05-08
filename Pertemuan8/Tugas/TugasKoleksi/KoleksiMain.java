public class KoleksiMain {
    public static void main(String[] args) {
        Koleksi K1 = new Koleksi(10); // inisialisasi dengan kapasitas tetap 10

        K1.showAll();

        System.out.println("Mengisi Koleksi dengan Character");
        K1.add('G');
        K1.add('I');
        K1.add('L');
        K1.add('A');
        K1.add('N');
        K1.add('G');

        K1.showAll();
        System.out.println("\nJumlah isi aktif: 6");
        System.out.println("Kapasitas wadah: " + K1.getSize());

        System.out.println("\nMengubah isi Koleksi (SetIsi index 5 menjadi 'W')");
        K1.setIsi(5, 'W');
        K1.showAll();

        System.out.println("\nMenghapus isi koleksi pada index 0");
        K1.delete(3);
        K1.showAll();
        System.out.println("\nJumlah isi aktif setelah hapus: 5");
        System.out.println("Kapasitas wadah: " + K1.getSize());
    }
}

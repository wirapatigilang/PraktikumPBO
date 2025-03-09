/* Nama File    : MTiket.java
 * Deskripsi    : Class Tiket
 * Pembuat      : Lalu Gilang Wirapati / 24060123140162
 * Tanggal      : 9 Maret 2025
 */

public class Tiket {
    public static void pesanJumlahTiket(int jumlahTiket) {
        // Asumsi jumlah tiket yang tersedia (boleh diganti)
        int tiketTersedia = 100;

        // Assertion untuk memastikan jumlah pesanan lebih diari 0
        assert(jumlahTiket > 0) : "JJumlah pemesanan tidak boleh nol";

        // Assertion untuk memastikan pemesanan tidak melebihi dari tiket yang tersedia
        assert(jumlahTiket <= tiketTersedia):"Jumlah pemesanan melebihi tiket yang tersedia!";
        System.out.println("Pemesanan tiket sebanyak " + jumlahTiket + "berhasil");
    }

    public static void isEWallet(int EWallet){
        // Memeriksa apakah index e-wallet yang dipilih valid
        if (EWallet > 0 && EWallet <=4){
            System.out.println("Pemesanan tiket selesai menggunakan e-wallet : " + getEWallet(EWallet)) ;
        } 
        // Assertioin untuk memastikan ewallet yang dipilih valid
        else {
            assert(EWallet > 0 && EWallet <= 4): "Pilihan e-wallet tidak valid";

        }
    }

    private static String getEWallet(int index) {
        switch (index) {
            case 1:
                return "OVO";
            case 2:
                return "GoPay";
            case 3:
                return "Dana";
            case 4:
                return "LinkAja";
            default:
                return "";
        }
    }
}

    

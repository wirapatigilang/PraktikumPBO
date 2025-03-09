


public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException{
        if (angka == 13) {
            throw new AngkaSialException();
        }
        System.out.println(angka + "bukan angka sial");
    }

    public static void main(String [] args) {
        AngkaSial as = new AngkaSial();
        try {
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        } catch(AngkaSialException ase) {
            System.out.println(ase.getMessage());
            System.out.println("Hati hati memasukkan angka");
        }
    }
}

/*Pertanyaan 1 : ketika cobaAngka(10) dipanggil, tdiak ada pengecualian maka baris 12 di cetak
- ketika cobaAngka(13) dipanggil : karena 13, maka exception dilempar sebelum mencari baris 12 sehingga pada baris 12 tidak di eksusi
- cobaAngka(12) tidak dieksusi karena exception sudah terjadi, sehingga program langsung melompat ke blok catch
Pertanyaan 2 : Baris 21 diekskusi karena exception dilemarkan oleh cobaAngka(13)
 */

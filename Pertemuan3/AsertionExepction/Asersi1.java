
/*
 * File : Asersi.java
 * Deskripsi : Program untuk menunjukkan asersi
 */

 public class Asersi1 {
    public static void main (String[] args) {
        int x = 0;
        if (x>0){
            System.out.println("X adalah bilangan postiif");
        } else {
            assert(x<0) : "ada keasalahan pada kode";
            System.out.println("X adalah bilangan negatif");
        }
    }
 }
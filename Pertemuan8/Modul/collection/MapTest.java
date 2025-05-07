/*
 * FIle : MapTest.java
 * Deskirpsi : program penggunaan objek Map sebagai collection class
 * Nama/Nim : Lalu Gilang Wirapati
 * Tanggal : 7 May 2025
 */


import java.util.*;

public class MapTest {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>() ;

        map.put(1, "satu");
        map.put(2, "dua");

        System.out.println(map.get(2));

        Set<Integer> key = map.keySet();
    }
}

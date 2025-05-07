/*
 * FIle : ArrayListTest.java
 * Deskirpsi : program penggunaan objek Array List sebagai collection class
 * 
 * 
 */

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();

        strings.add("praktikum");
        strings.add("collection");
        strings.add("dan generics");

        strings.remove("praktikum");

        for (String s : strings) {
            System.out.println(s+" ");
        }
    }
    
}

package Homework;

import java.util.ArrayList;

public class day18_ArrayListTask6 {
    public static void main(String[] args) {
        //6. Write a Java program to remove the third element from a array list.
        ArrayList<String> name = new ArrayList<>();
        name.add("Nihal");
        name.add("Gul");
        name.add("Mert");
        name.add("Elif");
        name.add("Ayse");
        System.out.println(name);
        name.remove(3);
        System.out.println(name);
        name.remove("Ayse");
        System.out.println(name);

    }
}

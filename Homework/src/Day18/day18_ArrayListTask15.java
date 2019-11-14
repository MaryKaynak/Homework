package Day18;

import java.util.ArrayList;

public class day18_ArrayListTask15 {
    public static void main(String[] args) {
        //15. Write a Java program to join two array lists.
        ArrayList<String> names = new ArrayList<>();
        names.add("Nihal");
        names.add("Gul");
        names.add("Mert");
        System.out.println(names);
        ArrayList<String> names1 = new ArrayList<>();
        names1.add("Elif");
        names1.add("Mertcan");
        names1.add("Can");
        System.out.println(names1);
        ArrayList<String> nam = new ArrayList<>();
        nam.addAll(names);
        nam.addAll(names);
        System.out.println(nam);

    }
}

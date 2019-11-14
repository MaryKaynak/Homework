package Day18;

import java.util.ArrayList;

public class day18_ArrayListTask16 {
    public static void main(String[] args) {
        //16. Write a Java program to clone an array list to another array list.
        ArrayList<String> names = new ArrayList<>();
        names.add("Nihal");
        names.add("Gul");
        names.add("Mert");
        System.out.println(names);
        ArrayList<String> names1 =  (ArrayList<String>)(names.clone());
        System.out.println(names1);
    }
}

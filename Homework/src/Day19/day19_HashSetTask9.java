package Day19;

import java.util.ArrayList;
import java.util.HashSet;

public class day19_HashSetTask9 {
    public static void main(String[] args) {
        //9. Write a Java program to convert a hash set to a List/ArrayList.
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Nissan");
        hashSet.add("Mercedes");
        hashSet.add("Toyota");
        hashSet.add("Tesla");
        hashSet.add("Audi");
        System.out.println( hashSet);
        ArrayList<String> arrayList = new ArrayList<>(hashSet);
            System.out.print(arrayList);
        }
    }


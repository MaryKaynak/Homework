package Day19;

import java.util.HashSet;
import java.util.TreeSet;

public class day19_HashSetTask8 {
    public static void main(String[] args) {
        //8. Write a Java program to convert a hash set to a tree set.
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Orange");
        hashSet.add("Red");
        hashSet.add("Pink");
        hashSet.add("Red");
        hashSet.add("White");
        System.out.println(hashSet);
        TreeSet<String> treeSet = new TreeSet<>(hashSet);
        for (String color : treeSet) {
            System.out.println(color);
        }

        }

        }



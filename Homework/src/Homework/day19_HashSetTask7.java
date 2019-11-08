package Homework;

import java.util.HashSet;

public class day19_HashSetTask7 {
    public static void main(String[] args) {
        //7. Write a Java program to convert a hash set to an array.
        HashSet<String> hashSet = new HashSet<>();
         hashSet.add("Apple");
         hashSet.add("Banana");
         hashSet.add("Grape");
         hashSet.add("Plum");
         hashSet.add("Blueberry");
         System.out.println(hashSet);
         String[] myarray = new String[hashSet.size()];
         hashSet.toArray(myarray);
        for (String fruit : myarray) {
            System.out.print(fruit + " ");
        }


    }
}
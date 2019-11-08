package Homework;

import java.util.HashSet;

public class day19_HashSetTask10 {
    public static void main(String[] args) {
       // 10. Write a Java program to compare two hash set.
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(30);
        hashSet.add(40);
        hashSet.add(50);
        System.out.println(hashSet);
        HashSet<Integer> newHashset = new HashSet<>();
        newHashset.add((15));
        newHashset.add((25));
        newHashset.add((30));
        newHashset.add((35));
        newHashset.add((10));
        System.out.println(newHashset);
        boolean value = hashSet.equals(newHashset);
        System.out.println(value);
        if(hashSet == newHashset){
            System.out.println("Two hashsets is equals");

        }else{
            System.out.println("Two hashsets not equal");
        }

    }
}

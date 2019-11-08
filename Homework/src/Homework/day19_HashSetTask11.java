package Homework;

import java.util.HashSet;
import java.util.TreeSet;

public class day19_HashSetTask11 {
    public static void main(String[] args) {// iki seti karsilastirip ayni elemanlari bul
        //11. Write a Java program to compare two sets and retain elements which are same on both sets.
        HashSet<String> name = new HashSet<>();
        name.add("Yusuf");
        name.add("Yunus");
        name.add("Emre");
        name.add("Zeynep");
        name.add("Nevval");
        System.out.println("Names : " + name);
        TreeSet<String> middleName = new TreeSet<>();
        middleName.add("Yusuf");
        middleName.add("Jonah");
        middleName.add("Mary");
        middleName.add("Zeynep");
        middleName.add("Hilal");
        System.out.println("Middle names: " + middleName);
        middleName.retainAll(name);
        System.out.println("Same name: " + middleName);

    }
}

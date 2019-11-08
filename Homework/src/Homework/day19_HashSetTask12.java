package Homework;

import java.util.HashSet;

public class day19_HashSetTask12 {
    public static void main(String[] args) {
        //12. Write a Java program to remove all of the elements from a hash set.
        HashSet<String> country = new HashSet<>();
        country.add("Turkey");
        country.add("USA");
        country.add("Greece");
        country.add("Bulgaria");
        country.add("Germany");
        System.out.println(country);
        country.removeAll(country);
        System.out.println(country);


    }
}

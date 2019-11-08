package Homework;

import java.util.HashSet;

public class day19_HashSetTask6 {
    public static <HasSet> void main(String[] args) {
        HashSet<String> fruit = new HashSet<>();
        fruit.add("Apple");
        fruit.add("Orange");
        fruit.add("Plum");
        fruit.add("Strawberry");
        fruit.add("Melon");
        System.out.println("Fruit:" + fruit);
        HashSet<String> clonefruit = new HashSet<>();

       clonefruit = (HashSet) fruit.clone();
        System.out.println("Clone:" + clonefruit);
    }
}

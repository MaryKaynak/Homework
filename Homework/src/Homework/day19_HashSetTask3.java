package Homework;

import java.util.HashSet;
import java.util.Set;

public class day19_HashSetTask3 {
    public static void main(String[] args) {
        Set<String> color = new HashSet<>();
        color.add("Red");
        color.add("Blue");
        color.add("Black");
        color.add("Pink");
        color.add("Yellow");
        System.out.println( "Color size is :" + color.size());
    }
}

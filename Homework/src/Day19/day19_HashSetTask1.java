package Day19;

import java.util.HashSet;
import java.util.Set;

class day19_HashSetTask1 {
    public static void main(String[] args) {
        //1. Write a Java program to append the specified element to the end of a hash set.
        Set<String> color = new HashSet<>();
        color.add("Red");
        color.add("Blue");
        color.add("Black");
        color.add("Pink");
        color.add("Yellow");
        System.out.println(color);
    }
}

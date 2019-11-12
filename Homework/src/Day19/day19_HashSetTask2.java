package Day19;

import java.util.HashSet;
import java.util.Set;

public class day19_HashSetTask2 {
    public static void main(String[] args) {
        //2. Write a Java program to iterate through all elements in a hash list.
        Set<String> color = new HashSet<>();
        color.add("Red");
        color.add("Blue");
        color.add("Black");
        color.add("Pink");
        color.add("Yellow");
        for (String a : color) {
            System.out.println(a);
        }
        }
        }


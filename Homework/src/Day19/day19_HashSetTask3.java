package Day19;

import java.util.HashSet;
import java.util.Set;

public class day19_HashSetTask3 {
    public static void main(String[] args) {
        //3. Write a Java program to get the number of elements in a hash set.
        Set<String> color = new HashSet<>();
        color.add("Red");
        color.add("Blue");
        color.add("Black");
        color.add("Pink");
        color.add("Yellow");
        System.out.println( "Color size is :" + color.size());
    }
}

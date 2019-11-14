package Day18;

import java.util.ArrayList;

public class day18_ArrayListTask21 {
    public static void main(String[] args) {
        //21. Write a Java program to replace the second element of a ArrayList with the specified element.
        ArrayList<String> color = new ArrayList<>();
        color.add("White");
        color.add("Blue");
        color.add("Black");
        color.add("Pink");
        color.add("Red");
        System.out.println(color);
        color.set(0,"Burgundy");
        System.out.println(color);
    }
}

package Day18;

import java.util.ArrayList;

public class day18_ArrayListTask5 {
    public static void main(String[] args) {
        //5. Write a Java program to update specific array element by given element.
        ArrayList<String> color = new ArrayList<>();
        color.add("Yellow");
        color.add("Blue");
        color.add("Gray");
        color.add("Burgundy");
        color.add("Orange");
        System.out.println(color);
        color.set(2,"White");
        System.out.println(color);

    }
}

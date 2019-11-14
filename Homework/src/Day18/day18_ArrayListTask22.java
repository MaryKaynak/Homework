package Day18;

import java.util.ArrayList;

public class day18_ArrayListTask22 {
    public static void main(String[] args) {
        //22. Write a Java program to print all the elements of a ArrayList using the position of the elements.
        ArrayList<String> color = new ArrayList<>();
        color.add("White");
        color.add("Blue");
        color.add("Red");
        color.add("Pink");
        color.add("Orange");
        System.out.println(color);
     //   for (int i = 0; i < color.size(); i++) {
          //System.out.println(color.get(i));
        for (String s : color) {
            System.out.print(s + " ");
        }
        }
        }



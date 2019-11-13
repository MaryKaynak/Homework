package Day18;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class day18_ArrayListTask13 {
    public static void main(String[] args) {
        //13. Write a Java program to compare two array lists.
        ArrayList<String> list = new ArrayList<>();
        list.add("Lion");
        list.add("Dog");
        list.add("Tiger");
        list.add("Cat");
        list.add("Lizard");
        list.add("Elephant");
        list.add("Cow");
        System.out.println(list);


        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Lion");
        list1.add("Dog");
        list1.add("Tiger");
        list1.add("Cat");
        list1.add("Lizard");
        list1.add("Elephant");
        list1.add("Cow");
        System.out.println(list1);

         boolean bool = list.equals(list1);
        System.out.println(bool);


    }
}

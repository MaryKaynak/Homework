package Homework;

import javax.print.DocFlavor;
import java.util.ArrayList;

public class day18_ArrayListTask2 {
    public static void main(String[] args) {
        //2. Write a Java program to iterate through all elements in a array list.
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Beige");
        colors.add("Blue");
        colors.add("Black");
        colors.add("Burgundy");
        colors.add("Brown");
        for (String clr : colors) {
            System.out.println(clr);
        }
    }
}

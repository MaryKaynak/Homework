package Homework;

import java.util.ArrayList;

public class day18_ArrayListTask7 {
    public static void main(String[] args) {
        //7. Write a Java program to search an element in a array list.
        ArrayList<String> color = new ArrayList<>();
        color.add("White");
        color.add("Red");
        color.add("Blue");
        color.add("Pink");
        color.add("Black");
        System.out.println(color);
        if(color.contains("Pink")){
            System.out.println("It has pink");
        }else{
            System.out.println("Doesn't have pink");
        }
          boolean containBlue = false;
        for (String s : color) {
            if(color.equals("Blue")){
                containBlue = true;
        }
         }
        System.out.println("It has Blue");
    }
}
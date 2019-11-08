package Homework;

import java.util.ArrayList;
import java.util.Collections;

public class day18_ArrayListTask4 {
    public static void main(String[] args) {
        //4. Write a Java program to retrieve an element (at a specified index) from a given array list.
        ArrayList<String> animals = new ArrayList<>();
        animals.add("Butterfly");
        animals.add("Ladybug");
        animals.add("Bee");
        animals.add("Fish");
        animals.add("Turtle");
        System.out.println(animals);
      // Collections.reverse(animals);
       // System.out.println(animals);
        System.out.println("******************************************");
       ArrayList<String> animal = new ArrayList<>();
        for (int i = animals.size() - 1; i >= 0; i--) {
            String a = animals.get(i);
            animal.add(a);
        }
        animals = animal;
        System.out.println(animals);
    }
}

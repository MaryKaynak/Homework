package Homework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class day18_ArrayListTask9 {
    public static void main(String[] args) {
        //9. Write a Java program to copy one array list into another.
        List<String> number = new ArrayList<>();
        number.add("One");
        number.add("Two");
        number.add("Three");
        number.add("Four");
        System.out.println("Before copy:" + number);

        List<String> number1 = new ArrayList<>();
        number1.add("Six");
        number1.add("Seven");
        number1.add("Eight");
        number1.add("Nine");
      //  System.out.println(number1);
        Collections.copy(number,number1);
        System.out.println("After copy:" + number);
        System.out.println("After copy:" + number1);

    }
}
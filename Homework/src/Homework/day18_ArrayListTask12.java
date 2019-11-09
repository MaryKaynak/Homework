package Homework;

import java.util.ArrayList;
import java.util.List;

public class day18_ArrayListTask12 {
    public static void main(String[] args) {
        //12. Write a Java program to extract a portion of a array list.(.sublist( 0, 4 );
        List<String> city = new ArrayList<>();
        city.add("New Jersey");
        city.add("New York");
        city.add("Miami");
        city.add("Las Vegas");
        city.add("Chicago");
        city.add("Washington D.C.");
        System.out.println("Before:" + city);
        List<String> city1 = city.subList(0,3);
        System.out.println("After:" + city1);

    }
}

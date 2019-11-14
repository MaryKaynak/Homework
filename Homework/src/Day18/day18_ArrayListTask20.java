package Day18;

import java.util.ArrayList;

public class day18_ArrayListTask20 {
    public static void main(String[] args) {

//20. Write a Java program to increase the size of an array list.
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        System.out.println(numbers.size());
        numbers.add(60);
        numbers.add(70);
        numbers.add(80);
        System.out.println(numbers.size());
    }
}

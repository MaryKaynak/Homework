package Day18;

import java.util.ArrayList;

public class day18_ArrayListTask3 {
    public static void main(String[] args) {
        //3. Write a Java program to insert an element into the array list at the first position.
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        System.out.println(numbers);
        numbers.add(0,60);
        System.out.println(numbers);
    }
}

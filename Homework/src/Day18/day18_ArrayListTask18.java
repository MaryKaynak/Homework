package Day18;

import java.util.ArrayList;

public class day18_ArrayListTask18 {
    public static void main(String[] args) {
        //18. Write a Java program to test an array list is empty or not.
        ArrayList<Integer> number = new ArrayList<>();
        number.add(1);
        number.add(2);
        number.add(3);
        number.add(4);
        number.add(5);
        System.out.println(number);
        System.out.println(number.isEmpty());
        number.clear();
        System.out.println(number.isEmpty());

    }
}

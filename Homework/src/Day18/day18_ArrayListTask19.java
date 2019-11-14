package Day18;

import java.util.ArrayList;

public class day18_ArrayListTask19 {
    public static void main(String[] args) {
        //19. Write a Java program to trim the capacity of an array list the current list size.

        ArrayList<Integer> number = new ArrayList<>(9);
        number.add(1);
        number.add(11);
        number.add(12);
        number.add(13);
        number.add(14);
        System.out.println(number);
        number.trimToSize();
        System.out.println(number);
    }
}

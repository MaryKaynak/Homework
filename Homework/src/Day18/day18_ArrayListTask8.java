package Day18;

import java.util.ArrayList;
import java.util.Collections;

public class day18_ArrayListTask8 {
    public static void main(String[] args) {
        //8. Write a Java program to sort a given array list.
        ArrayList<Character> letters = new ArrayList<>();
        letters.add('T');
        letters.add('H');
        letters.add('A');
        letters.add('M');
        letters.add('O');
        letters.add('K');
        System.out.println(letters);
        Collections.sort(letters);
        System.out.println(letters);
    }
}

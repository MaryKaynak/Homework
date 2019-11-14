package Day18;

import java.util.ArrayList;
import java.util.Collections;

public class day18_ArrayListTask17 {
    public static void main(String[] args) {
        //17. Write a Java program to empty an array list.
        ArrayList<Integer> number = new ArrayList<>();
        number.add(1);
        number.add(12);
        number.add(31);
        number.add(51);
        number.add(17);
        System.out.println(number);
        number.removeAll(number);
        System.out.println(number);
        }
    }


package Day19;

import java.util.HashSet;
import java.util.Set;

public class day19_HashSetTask4 {
    public static void main(String[] args) {
        //4. Write a Java program to empty an hash set.
        Set<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        System.out.println(numbers);
         numbers.clear();
        System.out.println(numbers);

        }
    }

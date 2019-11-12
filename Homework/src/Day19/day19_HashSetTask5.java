package Day19;

import java.util.HashSet;
import java.util.Set;

public class day19_HashSetTask5 {
    public static void main(String[] args) {
        //5. Write a Java program to test a hash set is empty or not.
        Set<Integer> number = new HashSet<>();
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(40);
        number.add(50);
       // System.out.println(number);
        System.out.println("number: " + number.isEmpty());
        if(number.isEmpty()){
            System.out.println("It is emty");
        }else{
            System.out.println(number);
        }
    }
}

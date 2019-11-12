package Day18;

import java.util.ArrayList;
import java.util.Collections;

public class day18_ArrayListTask11 {
    public static void main(String[] args) {
        //11. Write a Java program to reverse elements in a array list.
        ArrayList<String> flowers = new ArrayList<>();
        flowers.add("Tulip");
        flowers.add("Cactus");
        flowers.add("Jessamine");
        flowers.add("Lilac");
        flowers.add("Violet");
        System.out.println("Befor:" + flowers);
       // Collections.reverse(flowers);
      //  System.out.println(flowers);

        ArrayList<String> flowers1 = new ArrayList<>();
        for (int i = flowers.size() - 1; i >= 0; i--) {
            String element = flowers.get(i);
           flowers1.add(element);
        }
            flowers = flowers1;
        System.out.println("After:" + flowers);
    }

}
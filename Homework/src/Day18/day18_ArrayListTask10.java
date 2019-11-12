package Day18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class day18_ArrayListTask10 {
    public static void main(String[] args) {
        //10. Write a Java program to shuffle elements in a array list.[advanced]
        List<String> list = new ArrayList<>();
        list.add("Tulip");
        list.add("Rose");
        list.add("Lily");
        list.add("Lavender");
        list.add("Snowdrop");
        System.out.println("Before suffer:" + list);
        Collections.shuffle(list);
        System.out.println("After suffle:");
        for (String s : list) {
            System.out.println(s);
        }
    }
}

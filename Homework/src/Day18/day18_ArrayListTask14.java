package Day18;

import java.util.ArrayList;
import java.util.Collections;

public class day18_ArrayListTask14 {
    public static void main(String[] args) {
        //14. Write a Java program of swap two elements in an array list.
        ArrayList<String> name = new ArrayList<>();
        name.add("Yusuf");
        name.add("Yunus");
        name.add("Zeynep");
        name.add("Hilal");
        for (String s : name) {
            System.out.println( s);

        }
            Collections.swap(name, 0, 3);
        System.out.println("++++++++++++++++++++++++++++");
            for (String s1 : name) {
                System.out.println(s1);

            }
        }
    }


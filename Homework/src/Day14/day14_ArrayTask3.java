package Day14;

import java.util.concurrent.atomic.AtomicInteger;

public class day14_ArrayTask3 {
    public static void main(String[] args) {
        //Task 3. write a for loop that finds an average for the array
        int[] myarray = {2, 4, 6, 8, 10, 12, 14};
        int sum = 0;
        for (int mynumber : myarray) {
            sum = sum + mynumber;

        }
        double average = sum / myarray.length;
        System.out.println("Average: " + average);
    }
}
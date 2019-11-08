package Homework;

public class day14_ArrayTask2 {
    public static void main(String[] args) {
      int[]  array = {10,15,20,25,30,35,40};
      int minnumber = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            int mynumber = array[i];
            if(mynumber < minnumber){
                minnumber = mynumber;
            }
        }
        System.out.println("Min number is: " + minnumber);
    }
}

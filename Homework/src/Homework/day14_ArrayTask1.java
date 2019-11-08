package Homework;

public class day14_ArrayTask1 {
    public static void main(String[] args) {
        int[] myArray = {34, 5, 6, 2, 3, 78, 1};
         int maxnumber = Integer.MIN_VALUE;
        for (int i = 0; i < myArray.length; i++) {
            int mynumber = myArray[i];
            if(mynumber > maxnumber){
                maxnumber = mynumber;
            }
        }
        System.out.println("Max number is: " + maxnumber);
    }
}


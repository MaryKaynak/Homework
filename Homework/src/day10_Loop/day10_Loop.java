package day10_Loop;

import java.util.Scanner;

public class day10_Loop {
    public static void main(String[] args) {
        /**
         * Write a program the prompts the user to input a positive integer.
         * It should the print the multiplication table of tha number
         * Ex if user enters 3
         * Then it should print 3, 6,9,12,15,18,21,24,27,30
         */
         Scanner scan = new Scanner(System.in);
        System.out.print("Enter your number:");
        int number = scan.nextInt();
        for (int i = 0; i <= 10; i++) {

            System.out.println(number + " X " + i + " = " + (i * number));
        }
    }
}

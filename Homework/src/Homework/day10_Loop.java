package Homework;

import java.util.Scanner;

public class day10_Loop {
    public static void main(String[] args) {

         Scanner scan = new Scanner(System.in);
        System.out.print("Enter your number:");
        int number = scan.nextInt();
        for (int i = 0; i <= 10; i++) {

            System.out.println(number + " X " + i + " = " + (i * number));
        }
    }
}

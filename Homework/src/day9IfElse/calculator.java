package day9IfElse;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        String operator;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number:");
        int number1 = scan.nextInt();
        System.out.println("Enter second number:");
        int number2 = scan.nextInt();
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Please enter operator:");
        operator = scan1.next();

        if (operator.equals("-")) {
            System.out.println("Your subtraction:" + (number1 - number2));
        }
        if (operator.equals("*")) {
            System.out.println("Your multiplication:" + (number1 * number2));

        }
        if (operator.equals("/")) {
            System.out.println("Your divided:" + (number1 / number2));
        }
        if (operator.equals("+")) {
            System.out.println("Your sum:" + (number1 + number2));
        }
    }
}

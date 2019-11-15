package HomeWork_reversNumber;

public class reverseNumbers {
    public static void main(String[] args) {
        int num = 1234, reversed = 0;
        while(num != 0) {
            int a = num % 10;
            reversed = reversed * 10 + a;
            num /= 10;
        }
        System.out.println("Reversed Number: " + reversed);
    }
}

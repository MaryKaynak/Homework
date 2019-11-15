package HomeWork_reversNumber;

public class reverseNumber1 {
    public static void main(String[] args) {
        int number = 4789;
        int reversed = 0;
        for(;number != 0;number /= 10){
            int a = number %10;
            reversed = reversed * 10 + a;
        }
        System.out.println("Reversed number:" + reversed );
    }
}

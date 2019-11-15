package HomeWork_reversNumber;

public class reverseNumber2 {
    public static void main(String[] args) {
        String number = Integer.toString(4789);
        StringBuilder reversenum = new StringBuilder();
        reversenum.append(number);
        reversenum = reversenum.reverse();

        System.out.println(reversenum);
    }
}



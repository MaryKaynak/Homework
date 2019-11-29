package day36;

public class TODOTRYCATCHHOMEWORK {
    // 1. use string "HelloWorld" and get char at index 100
    // 2. create array of size 10, create a loop from 0 to 100, and try to print every element in array
    public static void main(String[] args) {


        String a = "HelloWorld";
        try {
            a.charAt(100);
        } catch (Exception ex) {
            ex.printStackTrace();
        }// String Index Out Of Bounds Exception

        int[] array = new int[10];
          try{
              int b = array[100];
          }catch (Exception ex){
              ex.printStackTrace();

          }//Array Index Out Of Bounds Exception
    }
}

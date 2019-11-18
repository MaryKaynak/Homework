package day15;

public class homeWork2 {
    public static void main(String[] args) {
        int[] arr = {10, 1, 1, 1, 7, 4, 5, 2, 2};

        boolean arrayHasOne = false;
        boolean arrayHasTwo = false;
        boolean arrayHasOneAndTwo = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arrayHasOne = true;
            }
            if (arr[i] == 2) {
                arrayHasTwo = true;
            }
        }

        if (arrayHasOne) {
            System.out.println("array has 1");
        }
        if (arrayHasTwo) {
            System.out.println("array has 2");
        }
        arrayHasOneAndTwo = arrayHasOne && arrayHasTwo;
        if (arrayHasOneAndTwo) {
            System.out.println("array has 1 and 2");
        }

    }
}



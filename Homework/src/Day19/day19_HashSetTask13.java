package Day19;

public class day19_HashSetTask13 {
    public static void main(String[] args) {
        //13. Write a Java Program to find duplications
        int[] myarray = {2, 4, 4, 6, 7, 7, 8, 9, 10};
        for (int i = 0; i < myarray.length - 1; i++) {
            for (int i1 = i + 1; i1 < myarray.length; i1++) {
                if (myarray[i] == myarray[i1] && i != i1) {
                    System.out.println(myarray[i1]);
                }
            }

        }
        String[] color = {"Red", "Pink", "White", "Red", "Black", "White"};
        for (int i = 0; i < color.length - 1; i++) {
            for (int j = i + 1; j < color.length; j++) {
                if (color[i].equals(color[j]) && i != j) {
                    System.out.println(color[j]);
                }
            }
        }

    }

    }

package Homework;

public class day21_Methods{

  public static void sentence(){


      String sentence = "The quick brown fox jumps over the lazy dog.";
      System.out.println(sentence);
      String[] words = sentence.split(" ");
      System.out.println(" Number of words in the string:" + words.length);
    }


    public static void main(String[] args) {

     sentence();

    }
}


package day20_Map;

import java.util.Arrays;

public class day20_map1 {
    public static void main(String[] args) {
        String  a = "cat";
        String  b = "car";
        isAnagram(a,b);
    }
    public static void isAnagram(String a, String b){
        String a1 = a.replaceAll("\\s","");
        String b1 = b.replaceAll("\\s","");
        boolean status = true;
        if(a.length() != b.length()){
            status = false;
        }else{
            char[] array1 = a.toLowerCase().toCharArray();
            char[] array2 = b.toLowerCase().toCharArray();
            Arrays.sort(array1);
            Arrays.sort(array2);
            status = Arrays.equals(array1,array2);
        }
        if(status){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }
}

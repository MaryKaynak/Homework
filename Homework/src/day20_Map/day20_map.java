//   Given two strings s and t ,
//   write a java program to determine if t is an anagram of s.

package day20_Map;

import java.util.Arrays;

public class day20_map {
    public static boolean areAnagram(char[] anagram, char[] nagaram) {
        int a = anagram.length;
        int b = nagaram.length;
        if (a != b)
            return false;
        Arrays.sort(anagram);
        Arrays.sort(nagaram);
        for (int i = 0; i < a; i++) {
            if (anagram[i] != nagaram[i])
                return false;
            return true;
        }
        return false;
    }
            public static void main (String[] args){
            char anagram[] = {'a', 'n', 'a', 'g', 'r', 'a', 'm'};
            char nagaram[] = {'n', 'a', 'g', 'a', 'r', 'a', 'm'};
            if(areAnagram(anagram,nagaram)) {
                System.out.println(true);
            } else
                System.out.println(false);
        }
    }


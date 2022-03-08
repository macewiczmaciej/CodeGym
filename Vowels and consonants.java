package en.codegym.task.jdk13.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Vowels and consonants
*/

public class Solution {
    public static char[] vowels = new char[]{'a', 'e', 'i', 'o', 'u'};

    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Character> vovelList = new ArrayList<>();
        ArrayList<Character> consonantslist = new ArrayList<>();
        String text = reader.readLine().replace(" ", "");

        for (int i = 0; i < text.length(); i++) {
            if (isVowel(text.charAt(i)) == true) {
                vovelList.add(text.charAt(i));
            } else {
                consonantslist.add(text.charAt(i));
            }
        }
        for (char c : vovelList){
            System.out.print(c+" ");
        }
        System.out.println();
        for (char c : consonantslist){
            System.out.print(c+" ");
        }
    }

    // The method checks whether a letter is a vowel
    public static boolean isVowel(char character) {
        character = Character.toLowerCase(character);  // Convert to lowercase
        for (char vowel : vowels) {  // Look for vowels in the array
            if (character == vowel) {
                return true;
            }
        }
        return false;
    }
}

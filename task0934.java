package en.codegym.task.jdk13.task09.task0934;

/* 
Word palindrome
*/

public class Solution {
    public static void main(String[] args) {
        String word = "Rotor";
        String answer = isPalindrome(word) ? "Yes" : "No";
        System.out.println("Is the word \"" + word + "\" a palindrome? " + answer);
    }

    public static boolean isPalindrome(String word) {
        //write your code here
        StringBuilder reversed = new StringBuilder(word);
        String x2 = reversed.reverse().toString();
        
        return x2.equalsIgnoreCase(word);

    }
}

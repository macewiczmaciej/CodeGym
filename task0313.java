package en.codegym.task.jdk13.task03.task0313;

/* 
Sam I Am
*/

public class Solution {
    public static void main(String[] args) {
        //write your code here
        String s1 = "Sam";
        String s2 = "I";
        String s3 = "Am";

        System.out.printf("%s%s%s%n", s1, s2, s3);
        System.out.printf("%s%s%s%n", s1, s3, s2);
        System.out.printf("%s%s%s%n", s2, s1, s3);
        System.out.printf("%s%s%s%n", s2, s3, s1);
        System.out.printf("%s%s%s%n", s3, s1, s2);
        System.out.printf("%s%s%s%n", s3, s2, s1);

    }
}

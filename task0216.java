package en.codegym.task.jdk13.task02.task0216;

/* 
Minimum of three numbers
*/

import java.util.Arrays;

public class Solution {
    public static int min(int a, int b, int c) {
        //write your code here
        int[] array = new int[]{a, b, c};
        Arrays.sort(array);
        return array[0];
    }

    public static void main(String[] args) {
        System.out.println(min(1, 2, 3));
        System.out.println(min(-1, -2, -3));
        System.out.println(min(3, 5, 3));
        System.out.println(min(5, 5, 10));
    }
}

package en.codegym.task.pro.task05.task0519;

import java.util.Arrays;

/* 
Is anyone there?
*/

public class Solution {

    public static int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};
    public static int element = 5;

    public static void main(String[] args) {
        //write your code here
        int[] sortedArray;
        sortedArray = Arrays.copyOf(array, array.length);
        Arrays.sort(sortedArray);
        System.out.println(0 <= Arrays.binarySearch(sortedArray, element));
    }
}

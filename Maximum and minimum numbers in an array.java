package en.codegym.task.jdk13.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Maximum and minimum numbers in an array
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        //write your code here

        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }
        int maximum = array[0];
        int minimum = array[0];
        for (int j : array) {
            if (j < minimum) {
                minimum = j;
            }
            if (j > maximum) {
                maximum = j;
            }
        }
        System.out.print(maximum + " " + minimum);
    }
}

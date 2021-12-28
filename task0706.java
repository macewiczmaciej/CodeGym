package en.codegym.task.jdk13.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Street and houses
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] array = new int[15];

        int sumOdd = 0;
        int sumEven = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
            if (i % 2 == 1) {
                sumOdd += array[i];
            } else {
                sumEven += array[i];
            }
        }
        if (sumEven > sumOdd) {
            System.out.println("Even-numbered houses have more residents.");
        } else if (sumEven < sumOdd) {
            System.out.println("Odd-numbered houses have more residents.");
        }
    }
}

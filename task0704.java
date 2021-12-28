package en.codegym.task.jdk13.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Array of numbers in reverse order
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] list = new int[10];

        for (int i = 0; i < 10; i++) {
            list[i] = Integer.parseInt(reader.readLine());
        }
        for (int i = 9; i >= 0; i--) {
            System.out.println(list[i]);

        }
    }
}


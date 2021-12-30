package en.codegym.task.pro.task05.task0511;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Creating a two-dimensional array
*/

public class Solution {
    public static int[][] multiArray;

    public static void main(String[] args) throws IOException {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int R = Integer.parseInt(reader.readLine());
        multiArray = new int[R][];

        for (int i = 0; i < multiArray.length; i++) {
            R = Integer.parseInt(reader.readLine());
            multiArray[i] = new int[R];
        }

    }
}

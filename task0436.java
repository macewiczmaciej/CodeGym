package en.codegym.task.jdk13.task04.task0436;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Drawing a rectangle
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(reader.readLine());
        int y = Integer.parseInt(reader.readLine());

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(8);
            }
            System.out.println();
        }
    }
}

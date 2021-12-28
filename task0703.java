package en.codegym.task.jdk13.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
2 arrays
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] intArray = new int[10];
        String[] stringArray = new String[10];

        for (int i = 0; i < stringArray.length; i++) {
            stringArray[i] = reader.readLine();
            intArray[i] = stringArray[i].length();
        }
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

    }
}

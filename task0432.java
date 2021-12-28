package en.codegym.task.jdk13.task04.task0432;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
You can't have too much of a good thing
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String text = reader.readLine();
        int n = Integer.parseInt(reader.readLine());

        while (n > 0) {
            System.out.println(text);
            n--;
        }
    }
}

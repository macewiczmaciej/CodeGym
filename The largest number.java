package en.codegym.task.jdk13.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
The largest number
*/

public class Solution {

    private static ArrayList<Integer> integers = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            int number = Integer.parseInt(reader.readLine());
            integers.add(number);
        }
        int max = integers.get(0);
        for (int i : integers) {
            if (i > max) {
                max = i;
            }
        }
        System.out.println(max);
    }
}

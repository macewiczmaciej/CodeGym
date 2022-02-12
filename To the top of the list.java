package en.codegym.task.jdk13.task07.task0710;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/* 
To the top of the list
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            list.add(0, reader.readLine());
        }
        for (String s : list) {
            System.out.println(s);
        }
    }
}

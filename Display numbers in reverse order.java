package en.codegym.task.jdk13.task07.task0719;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Display numbers in reverse order
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //write your code here
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i,Integer.parseInt(reader.readLine()));
        }
        for (int i = list.size(); i > 0; i--) {
            System.out.println(list.get(i-1));
        }
    }
}

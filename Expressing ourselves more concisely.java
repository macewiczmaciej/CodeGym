package en.codegym.task.jdk13.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Expressing ourselves more concisely
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            list.add(reader.readLine());
        }
        String shortest = list.get(0);
        for (String s : list) {
            if (s.length() < shortest.length()) {
                shortest = s;
            }
        }
        ArrayList<String> list1 = new ArrayList<>();
        for (String s : list) {
            if (s.length() == shortest.length()) {
                list1.add(s);
            }
        }

        for (String s : list1) {
            System.out.println(s);
        }
    }
}

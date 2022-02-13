package en.codegym.task.jdk13.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Checking the order
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
        }
        String destroyer = list.get(0);

        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            if (destroyer.length() > s.length()) {
                System.out.println(i);
                break;
            }
            destroyer = s;
        }
    }
}


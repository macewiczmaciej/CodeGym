package en.codegym.task.jdk13.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Shuffled just in time
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //write your code here
        int n = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(i, reader.readLine());
        }
        for (int i = 0; i < m; i++) {
            list.add(list.size(), list.get(0));
            list.remove(0);
        }
        for (String s : list){
            System.out.println(s);
        }
    }
}

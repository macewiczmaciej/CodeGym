package en.codegym.task.jdk13.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Minimum or maximum
*/

public class Solution {

    public static ArrayList<String> strings;

    public static void main(String[] args) throws IOException {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        strings = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            strings.add(reader.readLine());
        }
        String shortest = strings.get(0);
        String longest = strings.get(0);
        for (String s : strings) {
            if (shortest.length() > s.length()) {
                shortest = s;
            }
        }
        for (String s : strings) {
            if (longest.length() < s.length()) {
                longest = s;
            }
        }
        if(strings.indexOf(longest)>strings.indexOf(shortest)){
            System.out.println(shortest);
        }else{
            System.out.println(longest);
        }
    }
}

package en.codegym.task.jdk13.task09.task0910;

import java.util.ArrayList;

/* 
Exception when working with List collections
*/

public class Solution {
    public static void main(String[] args) {
        //write your code here

        try {
            ArrayList<String> list = new ArrayList<>();
            String s = list.get(18);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e);
        }

        //write your code here
    }
}

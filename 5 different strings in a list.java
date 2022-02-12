package en.codegym.task.jdk13.task07.task0707;

import java.util.ArrayList;

/* 
5 different strings in a list
*/

public class Solution {

    public static ArrayList<String> list;

    public static void main(String[] args) {
        //write your code here
        list = new ArrayList<String>();
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Five");
        System.out.println(list.size());
        for (String s : list) {
            System.out.println(s);
        }
    }
}

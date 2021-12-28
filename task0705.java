package en.codegym.task.jdk13.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
One large array and two small ones
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] list = new int[20];
        for (int i = 0; i < 20; i++) {
            list[i] = Integer.parseInt(reader.readLine());
        }
        int[] list1 = new int[10];
        int[] list2 = new int[10];

        for (int i = 0; i < list.length; i++) {
            if (i < list.length / 2) {
                list1[i] = list[i];
            } else {
                list2[i - list.length / 2] = list[i];
            }
        }
        for (int i = 0; i < list2.length; i++) {
            System.out.println(list2[i]);
        }
    }
}

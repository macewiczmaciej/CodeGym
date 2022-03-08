package en.codegym.task.jdk13.task09.task0926;

import java.util.ArrayList;
import java.util.Arrays;

/* 
List of number arrays
*/

public class Solution {

    public static void main(String[] args) {
        ArrayList<int[]> list = createList();

        printList(list);
    }

    public static ArrayList<int[]> createList() {
        //write your code here
        ArrayList<int[]> list = new ArrayList<>();

        int[] ints1 = new int[5];
        Arrays.fill(ints1,0);
        int[] ints2 = new int[2];
        Arrays.fill(ints2,1);
        int[] ints3 = new int[4];
        Arrays.fill(ints3,2);
        int[] ints4 = new int[7];
        Arrays.fill(ints4,3);
        int[] ints5 = new int[0];
        Arrays.fill(ints5,4);

        list.add(ints1);
        list.add(ints2);
        list.add(ints3);
        list.add(ints4);
        list.add(ints5);

        return list;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            System.out.println(Arrays.toString(array));
        }
    }
}

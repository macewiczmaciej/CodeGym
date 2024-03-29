package en.codegym.task.jdk13.task08.task0822;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
Minimum of N numbers
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> list) {
        // Find the minimum here
        Object[] array = list.toArray();
        Arrays.sort(array);

        return (int) array[0];
    }

    public static List<Integer> getIntegerList() throws IOException {
        // Create and initialize a list here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();


        while (true) {
            try {
                int x = Integer.parseInt(reader.readLine());
                list.add(x);
            } catch (NumberFormatException e) {
                break;
            }
        }

        return list;
    }
}

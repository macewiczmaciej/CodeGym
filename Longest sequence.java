package en.codegym.task.jdk13.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Longest sequence
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }
        int seq = 1;
        int topSeq = 1;
        for (int i = 1; i < 10; i++) {
            if (list.get(i - 1).equals(list.get(i))) {
                seq += 1;
                if (seq > topSeq) {
                    topSeq = seq;
                }
            }else {
                seq = 1;
            }
        }
        System.out.println(topSeq);
    }
}

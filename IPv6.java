package en.codegym.task.jdk13.task09.task0941;

import java.util.Arrays;
import java.util.StringTokenizer;

/* 
IPv6
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(map("2001:db8:11a3:9d7:1f34:8a2e:7a0:765d")));
    }

    public static String[] map(String ipv6) {
        //write your code here

        StringTokenizer tokenizer = new StringTokenizer(ipv6, ":");
        String[] array = new String[tokenizer.countTokens()];
        int i = 0;
        while (tokenizer.hasMoreTokens()) {
            array[i] = tokenizer.nextToken();
            i++;
        }
        return array;
    }
}

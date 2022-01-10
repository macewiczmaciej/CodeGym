package en.codegym.task.jdk13.task09.task0931;

/* 
Deleting spaces
*/

import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) {
        String stringWithoutSpaces = deleteSpaces("Good afternoon! How's life?");
        System.out.println(stringWithoutSpaces);
    }

    public static String deleteSpaces(String string) {
        //write your code here
        StringBuilder builder = new StringBuilder(string);
        while(builder.indexOf(" ") > -1){
            builder.replace(builder.indexOf(" "), builder.indexOf(" ")+1,"");
        }

        return builder.toString();
    }
}

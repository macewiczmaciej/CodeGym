package en.codegym.task.jdk13.task04.task0441;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Somewhere in the middle
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(reader.readLine());
        int y = Integer.parseInt(reader.readLine());
        int z = Integer.parseInt(reader.readLine());

        if((x>=y && x<=z)||(x>=z && x<=y)){
            System.out.println(x);
        }
        else if((y>=x && y<=z) || (y>=z && y<=x)){
            System.out.println(y);
        }else{
            System.out.println(z);
        }
    }
}

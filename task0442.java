package en.codegym.task.jdk13.task04.task0442;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Adding
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        while(true){
            int x = Integer.parseInt(reader.readLine());
            sum += x;
            if(x==-1){
                break;
            }
        }
        System.out.println(sum);
    }
}

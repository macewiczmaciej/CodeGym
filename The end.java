package en.codegym.task.jdk13.task07.task0722;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
The end
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //write your code here
        ArrayList<String> list = new ArrayList<>();

        while(true){
            String text = reader.readLine();
            if(text.equals("end")){
                break;
            }
            else{
                list.add(text);
            }
        }
        for(String s:list){
            System.out.println(s);
        }
    }
}

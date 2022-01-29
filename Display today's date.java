package en.codegym.task.jdk13.task05.task0528;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Year;
import java.util.Date;

/* 
Display today's date
*/

public class Solution {
    public static void main(String[] args) {
        //write your code here
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM dd yyyy");
        String date = dateFormat.format(new Date());
        System.out.println(date);
    }
}

package en.codegym.task.jdk13.task09.task0906;

/* 
Logging stack traces
*/

public class Solution {

    public static void main(String[] args) {
        log("In method");
    }

    public static void log(String text) {
        //write your code here
        System.out.println(Thread.currentThread().getStackTrace()[2].getFileName() + ": " + Thread.currentThread().getStackTrace()[2].getMethodName() + ": " + text);
    }
}

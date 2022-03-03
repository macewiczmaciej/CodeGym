package en.codegym.task.jdk13.task09.task0905;

/* 
The method returns a result — the depth of its stack trace
*/

public class Solution {
    public static void main(String[] args) {
        int deep = getStackTraceDepth();
    }

    public static int getStackTraceDepth() {
        //write your code here
        int deep = Thread.currentThread().getStackTrace().length;
        System.out.println(deep);
        return deep;
    }
}


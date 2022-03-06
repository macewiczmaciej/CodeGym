package en.codegym.task.jdk13.task09.task0914;

/* 
Catching a group of exceptions
*/

public class Solution {
    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception exception) {
            System.out.println(exception);
        }
    }

    public static void method1() throws Exception1 {
        int i = (int) (Math.random() * 3);
        if (i == 0) {
            throw new Exception1();
        } else if (i == 1) {
            throw new Exception2();
        } else if (i == 2) {
            throw new Exception3();
        }
    }
}

class Exception1 extends Exception {
}

class Exception2 extends Exception1 {
}

class Exception3 extends Exception2 {
}

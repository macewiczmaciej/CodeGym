package en.codegym.task.jdk13.task06.task0611;

/* 
StringHelper class
*/

public class StringHelper {
    public static String multiply(String text) {
        //write your code here
        return multiply(text, 5);
    }

    public static String multiply(String text, int count) {
        StringBuilder result = new StringBuilder();
        //write your code here
        for (int i = 0; i < count; i++) {
            result.append(text);
        }
        return result.toString();
    }

    public static void main(String[] args) {

    }
}

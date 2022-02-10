package en.codegym.task.jdk13.task12.task1205;

/* 
But that's how I want it
*/

public class Solution {

    private static String UNEXPECTED_TYPE = "I didn't expect this type of number!";

    public static void main(String[] args) {
        System.out.println(toCustomString((byte) 12)); // 6b
        System.out.println(toCustomString(12)); // 4
        System.out.println(toCustomString(12.)); // 240.0
        System.out.println(toCustomString(12L)); // "I didn't expect this type of number!"
    }

    public static String toCustomString(Number number) {
        if (number instanceof Byte) {
            return (Byte) number / 2 + "b";
        } else if (number instanceof Integer) {
            return String.valueOf((Integer) number / 3);
        } else if (number instanceof Double) {
            return String.valueOf((Double) number * 20);
        } else {
            return UNEXPECTED_TYPE;
        }
    }
}

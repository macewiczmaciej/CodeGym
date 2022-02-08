package en.codegym.task.jdk13.task12.task1203;

/* 
Conscious choice
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(isByte(12)); // true
        System.out.println(isShort(130999)); // false
        System.out.println(isInt(1999939990L)); // true
        System.out.println(isInt(19999999939990L)); // false
    }

    public static boolean isByte(long l) {
        return l <= Byte.MAX_VALUE && l >= Byte.MIN_VALUE;
    }

    public static boolean isShort(long l) {
        return l <= Short.MAX_VALUE && l >= Short.MIN_VALUE;
    }

    public static boolean isInt(long l) {
        return l <= Integer.MAX_VALUE && l >= Integer.MIN_VALUE;
    }
}

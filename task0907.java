package en.codegym.task.pro.task09.task0907;

/* 
Hexadecimal converter
*/

public class Solution {
    private static final String HEX = "0123456789abcdef";

    public static void main(String[] args) {
        int decimalNumber = 1256;
        System.out.println("Decimal number " + decimalNumber + " is equal to hexadecimal number " + toHex(decimalNumber));
        String hexNumber = "4e8";
        System.out.println("Hexadecimal number " + hexNumber + " is equal to decimal number " + toDecimal(hexNumber));
    }

    public static String toHex(int decimalNumber) {
        //write your code here
        String hex = "";
        if (decimalNumber <= 0) {
            return hex;
        }
        while (decimalNumber != 0) {
            hex = HEX.charAt(decimalNumber % 16) + hex;
            decimalNumber /= 16;
        }

        return hex;
    }

    public static int toDecimal(String hexNumber) {
        //write your code here
        int decimal = 0;
        if (hexNumber == null) {
            return decimal;
        }
        for (int i = 0; i < hexNumber.length(); i++) {
            decimal = 16 * decimal + HEX.indexOf(hexNumber.charAt(i));
        }
        return decimal;
    }
}

package en.codegym.task.pro.task09.task0908;

/* 
Binary to hexadecimal converter
*/
public class Solution {
    private static final String HEX = "0123456789abcdef";

    public static void main(String[] args) {

        String binaryNumber = "100111010000";
        System.out.println("Binary number " + binaryNumber + " is equal to hexadecimal number " + toHex(binaryNumber));
        String hexNumber = "9d0";
        System.out.println("Hexadecimal number " + hexNumber + " is equal to binary number " + toBinary(hexNumber));
    }

    public static String toHex(String binaryNumber) {
        //write your code here
        String hex = "";
        if (binaryNumber == null || !binaryNumber.matches("[01]+")) {
            return hex;
        }
        while (binaryNumber.length() % 4 != 0) {
            binaryNumber = 0 + binaryNumber;
        }
        for (int i = 0; i < binaryNumber.length(); i += 4) {
            int x = 0;
            if (binaryNumber.charAt(i) == '1') {
                x += 8;
            }
            if (binaryNumber.charAt(i + 1) == '1') {
                x += 4;
            }
            if (binaryNumber.charAt(i + 2) == '1') {
                x += 2;
            }
            if (binaryNumber.charAt(i + 3) == '1') {
                x += 1;
            }
            hex = hex + HEX.charAt(x);
        }
        return hex;
    }

    public static String toBinary(String hexNumber) {
        //write your code here
        String binaryNumber = "";
        if (hexNumber == null) {
            return binaryNumber;
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < hexNumber.length(); i++) {
            String element;
            if (hexNumber.charAt(i) == '0') {
                element = "0000";
            } else if (hexNumber.charAt(i) == '1') {
                element = "0001";
            } else if (hexNumber.charAt(i) == '2') {
                element = "0010";
            } else if (hexNumber.charAt(i) == '3') {
                element = "0011";
            } else if (hexNumber.charAt(i) == '4') {
                element = "0100";
            } else if (hexNumber.charAt(i) == '5') {
                element = "0101";
            } else if (hexNumber.charAt(i) == '6') {
                element = "0110";
            } else if (hexNumber.charAt(i) == '7') {
                element = "0111";
            } else if (hexNumber.charAt(i) == '8') {
                element = "1000";
            } else if (hexNumber.charAt(i) == '9') {
                element = "1001";
            } else if (hexNumber.charAt(i) == 'a') {
                element = "1010";
            } else if (hexNumber.charAt(i) == 'b') {
                element = "1011";
            } else if (hexNumber.charAt(i) == 'c') {
                element = "1100";
            } else if (hexNumber.charAt(i) == 'd') {
                element = "1101";
            } else if (hexNumber.charAt(i) == 'e') {
                element = "1110";
            } else if (hexNumber.charAt(i) == 'f') {
                element = "1111";
            } else {
                result.setLength(0);
                ;
                break;
            }
            result.append(element);
        }
        return result.toString();
    }
}

package en.codegym.task.pro.task09.task0905;

/* 
Octal converter
*/

public class Solution {
    public static void main(String[] args) {
        int decimalNumber = 21;
        System.out.println("Decimal number " + decimalNumber + " is equal to octal number " + toOctal(decimalNumber));
        int octalNumber = 25;
        System.out.println("Octal number " + octalNumber + " is equal to decimal number " + toDecimal(octalNumber));
    }

    public static int toOctal(int decimalNumber) {
        //write your code here
        if(decimalNumber<=0){
            return 0;
        }
        double i = 0;
        int octalNumber = 0;
        while (decimalNumber != 0) {
            octalNumber = octalNumber + (decimalNumber % 8) * (int) Math.pow(10, i);
            decimalNumber /= 8;
            i++;
        }
        return octalNumber;
    }

    public static int toDecimal(int octalNumber) {
        //write your code here
        if(octalNumber<=0){
            return 0;
        }
        double i = 0;
        int decimal = 0;
        while (octalNumber != 0) {
            decimal = decimal + (octalNumber % 10) * (int) Math.pow(8, i);
            octalNumber /= 10;
            i++;
        }
        return decimal;
    }
}


//
//i is equal to 0
//while (the octal number is not 0) {
//the octal number = the decimal number + (remainder of the division of the octal number by 10) * 8 to the power of i
//the octal number = the octal number / 10
//increase i by 1
//}

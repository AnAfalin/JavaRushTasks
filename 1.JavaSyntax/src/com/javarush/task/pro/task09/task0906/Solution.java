package com.javarush.task.pro.task09.task0906;

import java.util.regex.Pattern;

/* 
Двоичный конвертер
*/

public class Solution {
    public static void main(String[] args) {
        int decimalNumber = 2147483647; //Integer.MAX_VALUE;
        System.out.println("Десятичное число " + decimalNumber + " равно двоичному числу " + toBinary(decimalNumber));
        String binaryNumber = "1111111111111111111111111111111";
        System.out.println("Двоичное число " + binaryNumber + " равно десятичному числу " + toDecimal(binaryNumber));
    }

    public static String toBinary(int decimalNumber) {
        if (decimalNumber < 0 || decimalNumber == 0) {
            return "";
        }
        String binaryNumber = "";
        while (decimalNumber != 0) {
            binaryNumber = (decimalNumber % 2) + binaryNumber;
            decimalNumber = decimalNumber / 2;
        }
        return binaryNumber;
    }

    public static int toDecimal(String binaryNumber) {
        if(binaryNumber == null) {
            return 0;
        }
        int decimalNumber = 0;
        for (int i = binaryNumber.length() - 1; i >= 0; i--) {

            int tmp = Integer.parseInt(Character.toString(binaryNumber.charAt(i)));
            decimalNumber = decimalNumber + (tmp * (int)(Math.pow(2, binaryNumber.length() -1 - i)));
        }

        return decimalNumber;
    }
}

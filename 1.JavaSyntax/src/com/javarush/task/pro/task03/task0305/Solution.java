package com.javarush.task.pro.task03.task0305;

import java.util.Scanner;

/* 
Три числа
*/

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numFirst = sc.nextInt();
        int numSecond = sc.nextInt();
        int numThird = sc.nextInt();
        if (numFirst == numSecond && numFirst == numThird) {
            System.out.println(numFirst + " " + numSecond + " " + numThird);
        }else if (numFirst == numSecond) {
            System.out.println(numFirst + " " + numSecond);
        }else if (numSecond == numThird) {
            System.out.println(numSecond + " " + numThird);
        }else if (numFirst == numThird) {
            System.out.println(numFirst + " " + numThird);
        }
    }
}

package com.javarush.task.pro.task04.task0405;

/* 
Незаполненный прямоугольник
*/

public class Solution {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        while (b < 10) {
            while (a < 20) {
                if(b == 0 || b == 9) {
                    System.out.print("Б");
                } else {
                    if (a == 0 || a == 19) {
                        System.out.print("Б");
                    } else {
                        System.out.print(" ");
                    }
                }
                a++;
            }
            System.out.println();
            b++;
            a = 0;
        }

    }
}
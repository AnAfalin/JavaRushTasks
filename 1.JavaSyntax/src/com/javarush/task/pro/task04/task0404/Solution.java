package com.javarush.task.pro.task04.task0404;

/* 
Заполненный прямоугольник
*/

public class Solution {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        while (b < 5) {
            while (a < 10) {
                System.out.print("Q");
                a++;
            }
            System.out.println();
            b++;
            a = 0;
        }

    }
}
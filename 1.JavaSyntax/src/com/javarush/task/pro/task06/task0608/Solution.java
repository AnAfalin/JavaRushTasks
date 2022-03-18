package com.javarush.task.pro.task06.task0608;

/* 
Кубический калькулятор
*/

public class Solution {
    public static void main(String[] args) {
        long number = 3L;
        System.out.println(cube(number));
    }

    public static long cube(long number) {
        return number*number*number;
    }
}

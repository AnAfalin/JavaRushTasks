package com.javarush.task.pro.task06.task0609;

/* 
Кубический калькулятор в кубе
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(ninthDegree(3));
    }

    public static long cube(long a){
        return a*a*a;
    }

    public static long ninthDegree(long number){
        return cube(cube(number)) ;
    }
}

package com.javarush.task.task12.task1209;

/* 
Три метода и минимум
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static int min(int numberFirst, int numberSecond){
        if(numberFirst < numberSecond) return numberFirst;
        else return numberSecond;
    }

    public static long min(long numberFirst, long numberSecond){
        if(numberFirst < numberSecond) return numberFirst;
        else return numberSecond;
    }

    public static double min(double numberFirst, double numberSecond){
        if(numberFirst < numberSecond) return numberFirst;
        else return numberSecond;
    }
}

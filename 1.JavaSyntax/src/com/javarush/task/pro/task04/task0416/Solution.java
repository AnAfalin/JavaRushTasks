package com.javarush.task.pro.task04.task0416;

import java.util.Scanner;

/* 
Share a Coke
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numJar = scanner.nextInt();
        int numPeople = scanner.nextInt();
        double res = (double) numJar / (double) numPeople;
        System.out.println(res);

    }
}
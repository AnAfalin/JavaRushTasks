package com.javarush.task.pro.task03.task0312;

import java.util.Scanner;

/* 
Сравним строки
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String strFirst = scanner.nextLine();
        String strSecond = scanner.nextLine();
        System.out.println(strFirst.equals(strSecond) ? "строки одинаковые" : "строки разные");
    }
}

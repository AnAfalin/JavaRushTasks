package com.javarush.task.pro.task02.task0214;

import java.util.Scanner;

/* 
Чтение и преобразование строк
*/

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String strFirst = scanner.nextLine();
        String strSecond = scanner.nextLine();
        String strThird = scanner.nextLine();
        
        System.out.println(strThird);
        System.out.println(strSecond.toUpperCase());
        System.out.println(strFirst.toLowerCase());
        

    }
}

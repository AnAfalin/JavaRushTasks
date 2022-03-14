package com.javarush.task.pro.task04.task0414;

import java.util.Scanner;

/* 
Хорошего не бывает много
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        int number = scanner.nextInt();
        if(number <= 0 || number >= 5) {
            System.out.println(string);
        }else {
            do {
                System.out.println(string);
                number--;
            } while (number > 0);
        }


    }
}
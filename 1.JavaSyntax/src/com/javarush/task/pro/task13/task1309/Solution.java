package com.javarush.task.pro.task13.task1309;

import java.util.HashMap;

/* 
Успеваемость студентов
*/

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {
        grades.put("Иван Иванов", 4.5);
        grades.put("Сергей Петров", 4.0);
        grades.put("Лазарев Илья", 3.0);
        grades.put("Тягунов Вячеслав", 3.8);
        grades.put("Лазаренко Ирина", 4.8);
    }
}

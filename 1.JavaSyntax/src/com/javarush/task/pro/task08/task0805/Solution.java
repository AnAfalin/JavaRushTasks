package com.javarush.task.pro.task08.task0805;

/* 
Magic 8 ball
*/

import java.util.Random;

public class Solution {

    public static void main(String[] args) {
        System.out.println("Заработаю ли я себе на BMW?");
        MagicBall.getPrediction();
    }

    public static void getPrediction() {
        Random r = new Random();
        int x = r.nextInt(1);
        switch (x) {
            case (0) :
                System.out.println( "Беспорно");
                break;
            case (1) :
                System.out.println( "Определенно");
                break;
            case (2) :
                System.out.println("Вероятнее всего");
                break;
            case (3) :
                System.out.println("Хорошие перспективы");
                break;
            case (4) :
                System.out.println("Спроси позже");
                break;
            case (5) :
                System.out.println("Попробуй снова");
                break;
            case (6) :
                System.out.println("Мой ответ - нет");
                break;
            case (7) :
                System.out.println("Весьма сомнительно");
                break;
        }
    }
}

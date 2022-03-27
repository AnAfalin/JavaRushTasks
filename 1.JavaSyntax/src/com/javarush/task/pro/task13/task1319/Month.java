package com.javarush.task.pro.task13.task1319;

/* 
Месяцы в сезоне
*/

import java.util.Arrays;

public enum Month {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;

    public static Month[] getWinterMonths(){
        Month[] arrayWinterMonth = new Month[3];
        arrayWinterMonth[0] = Month.values()[11];
        arrayWinterMonth[1] = Month.values()[0];
        arrayWinterMonth[2] = Month.values()[1];
        return arrayWinterMonth;
    }
    public static Month[] getSpringMonths(){
        Month[] arraySpringMonths = new Month[3];
        arraySpringMonths[0] = Month.values()[2];
        arraySpringMonths[1] = Month.values()[3];
        arraySpringMonths[2] = Month.values()[4];
        return arraySpringMonths;
    }
    public static Month[] getSummerMonths(){

        Month[] arraySummerMonths = new Month[3];
        arraySummerMonths[0] = Month.values()[5];
        arraySummerMonths[1] = Month.values()[6];
        arraySummerMonths[2] = Month.values()[7];
        return arraySummerMonths;
    }
    public static Month[] getAutumnMonths(){

        Month[] arrayAutumnMonths = new Month[3];
        arrayAutumnMonths[0] = Month.values()[8];
        arrayAutumnMonths[1] = Month.values()[9];
        arrayAutumnMonths[2] = Month.values()[10];
        return arrayAutumnMonths;
    }

    }



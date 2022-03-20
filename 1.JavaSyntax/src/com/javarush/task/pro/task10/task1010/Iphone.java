package com.javarush.task.pro.task10.task1010;

import java.util.Objects;

/* 
Два айфона
*/

public class Iphone {
    private String model;
    private String color;
    private int price;

    public Iphone(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this) {//сравнение ссылок на объекты
            return true;
        }
        if(obj == null) {//Переданный объект — null?
            return false;
        }

        if (!(obj instanceof Iphone)) {//проверка - переданный объект принадлежит к классу Iphone
            return false;
        }

        Iphone iphone = (Iphone) obj; //Операция приведения типа
        return price == iphone.price &&
                Objects.equals(model, iphone.model) &&
                Objects.equals(color, iphone.color);

    }

    public static void main(String[] args) {
        Iphone iphone1 = new Iphone(null, "Black", 999);
        Iphone iphone2 = new Iphone("X", "Black", 999);

        System.out.println(iphone1.equals(iphone2));
    }

}

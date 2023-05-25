package Homeworks.L1HW_Java_Telpiz_Irina;

public class PreventDividingOnZero {
    public static void main(String[] args) {

        int x, y;

        x = 20;
        y = 2;

        //соблюдаются оба условия как true
        if (y != 0 && (x / y)==10) System.out.println("You can divide " + x + " on " + y + " and answer will be 10");

        //первое условие true, второе false, поэтому ничего не выводится в консоль
        y = 5;
        if (y != 0 && (x / y)==10) System.out.println("You can divide " + x + " on " + y + " and answer will be 10");

        //первое условие false, поэтому даже не проверил второе и ничего не вывел,
        // если бы не укороченная операция, то вывел бы ошибку в консоли о невозможности деления на ноль
        y = 0;
        if (y != 0 && (x / y)==10) System.out.println("You can divide " + x + " on " + y + " and answer will be 10");



    }
}

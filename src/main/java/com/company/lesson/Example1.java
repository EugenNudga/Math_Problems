package com.company.lesson;

public class Example1 {//плохое имя но в учебных целях сойдет
    //Написать программу которая считает 4 числа c клавиатуры и выведет на
    //экран самое большое из них.


    public static void main(String[] args) {
        double a = 10;
        double b = -10;
        double c = 11;
        double d = 100;

        double maxNum = findMaxNum(a, b, c, d);
    }

    private static double findMaxNum(double a, double b, double c, double d) {
        return findMaxNum(findMaxNum(a, b), findMaxNum(c, d));

    }

    private static double findMaxNum(double a, double b) {//overloading how to use it
        return a > b ? a : b;
    }
}

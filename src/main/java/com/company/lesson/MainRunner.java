package com.company.lesson;

public class MainRunner {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c;
        if (a < b) {
            c = 0;
        } else {
            c = 1;
        }
        //c = a < b ? 0 : 1;
        System.out.println(c);
    }
}

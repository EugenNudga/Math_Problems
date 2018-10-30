package com.company.homeWork;

import java.util.Scanner;

import static java.lang.Math.PI;
import static java.lang.Math.sqrt;

public class Main {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int num = initNumber();
        printArr(getDigits(num));

        System.out.println("area " + calculateArea(1, 4, 4));
        System.out.println("circle length " + calculateCircleLength(num));

    }

    private static void printArr(int[] numbers) {
        for (int element : numbers) {
            System.out.println(element);
        }
    }

    private static int initNumber() {
        System.out.println("Enter a 5-digit number:");
        return SCANNER.nextInt();
    }

    public static int[] getDigits(int n) {
        validateNumber(n);
        int[] digits = new int[5];

        digits[4] = n % 10;
        digits[3] = (n % 100 - digits[4]) / 10;
        digits[2] = (n % 1000 - n % 100) / 100;
        digits[1] = (n % 10000 - n % 1000) / 1000;
        digits[0] = n / 10000;

        return digits;
    }

    private static void validateNumber(int n) {
        int length = String.valueOf(n).length();
        if (length != 5) {
            throw new IllegalArgumentException("Number does not  have 5 digits");
        }
    }

    public static double calculateArea(double a, double b, double c) {

        validateTriangle(a, b, c);

        double p = calculateHalfPerimeter(a, b, c);
        return sqrt(p * (p - a) * (p - b) * (p - c));
    }

    private static void validateTriangle(double a, double b, double c) {
        if (!isTriangleExist(a, b, c)) {
            throw new IllegalArgumentException("Triangle does not exist");
        }
    }

    private static boolean isTriangleExist(double a, double b, double c) {
        return a + b > c && a + c > b && b + c > a;
    }

    private static double calculateHalfPerimeter(double a, double b, double c) {
        return (a + b + c) / 2;
    }

    public static double calculateCircleLength(double radius) {
        return 2 * PI * radius;//static import
    }
}

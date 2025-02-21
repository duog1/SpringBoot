package com.example.demo.pkg_method_references;

import java.util.Arrays;

@FunctionalInterface
interface ExcuteFunctio {
    int excute(int a, int b); // Sửa lại để nhận 2 tham số
}

class MathUtils {
    public MathUtils() {}

    public MathUtils(String str) {
        System.out.println("MathUtils: " + str);
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }
}

public class DemoMethodref {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        int sum = doAction(a, b, MathUtils::add); // Sửa lại từ MathUtils::sum thành MathUtils::add
        System.out.println(a + " + " + b + " = " + sum);

        int minus = doAction(a, b, MathUtils::subtract);
        System.out.println(a + " - " + b + " = " + minus);

        int multiply = doAction(a, b, MathUtils::multiply); // Sửa lại từ mathUtils::multiply thành MathUtils::multiply
        System.out.println(a + " * " + b + " = " + multiply);

        // Sắp xếp mảng sử dụng method reference
        String[] stringArray = { "Java", "C++", "PHP", "C#", "Javascript" };
        Arrays.sort(stringArray, String::compareToIgnoreCase);

        for (String str : stringArray) {
            System.out.println(str);
        }
    }

    public static int doAction(int a, int b, ExcuteFunctio func) {
        return func.excute(a, b); // Sửa lại để gọi excute(int a, int b)
    }
}

package com.example.demo.pkg_method_references;

import java.util.Arrays;

@FunctionalInterface
interface ExcuteFunctio{
    public int excute();
}
class MathUtils{
    public MathUtils(){}
    public MathUtils(String str){
        System.out.println("MathUtils: " +str);
    }
    public static int add(int a, int b){
        return a + b;
    }
    public static int subtract(int a, int b){
        return a - b;
    }
    public static int multiply(int a, int b){
        return a * b;
    }
}

public class DemoMethodRef {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int sum = doAction(a, b, MathUtils::sum);
        System.out.println(a + " + " + b + " = " + sum);

        int minus = doAction(a, b, MathUtils::subtract);
        System.out.println(a + " - " + b + " = " + minus);

        MathUtils mathUtils = new MathUtils();
        int multiply = doAction(a, b, mathUtils::multiply);
        System.out.println(a + " * " + b + " = " + multiply);

        String[] stringArray = { "Java", "C++", "PHP", "C#", "Javascript" };
        Arrays.sort(stringArray, String::compareToIgnoreCase);
        for (String str : stringArray) {
            System.out.println(str);
        }
    }
    public static int doAction(int a, int b, ExcuteFunctio func){
        return func.excute(a,b);
    }
}

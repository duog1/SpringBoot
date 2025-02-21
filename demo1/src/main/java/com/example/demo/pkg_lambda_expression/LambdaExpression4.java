package com.example.demo.pkg_lambda_expression;

import java.util.Arrays;
import java.util.List;

public class LambdaExpression4 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java SpringBoot", "C# NetCore", "PHP", "JavaScript");

        // Using Lambda expression
        list.forEach(item -> System.out.println(item));

        System.out.println("=================");

        list.forEach(System.out::println);
    }
}
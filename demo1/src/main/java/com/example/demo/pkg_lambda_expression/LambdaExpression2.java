package com.example.demo.pkg_lambda_expression;
@FunctionalInterface
interface SayHello2{
    void sayHello(String name);
}
public class LambdaExpression2 {
    public static void main(String[] args) {
        SayHello2 say1 = (name) -> {
            System.out.println("Hello World");
        };
        say1.sayHello("Duc Duong");
    }
}
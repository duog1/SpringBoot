package com.example.demo.pkg_default_method;

public interface Interface2 {
    default void method2(){
        System.out.println("Interface2.method2");
    }
}

package org.example.lab3.bai8;

import java.util.Scanner;

public class Bai8 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap N: ");
        int N = sc.nextInt();
        long giaiThua = 1;
        for(int i = 1; i <= N; i++){
            giaiThua = giaiThua * i;
        }
        System.out.println(N+ "! = " +giaiThua);
    }
}

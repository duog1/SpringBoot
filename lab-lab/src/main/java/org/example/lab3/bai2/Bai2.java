package org.example.lab3.bai2;

import java.util.Scanner;

public class Bai2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        for(int i = 0; i <= n; i++){
            sum +=i;
        }
        System.out.println("Tong tu 1 den " +n+ " = "+sum);
    }
}

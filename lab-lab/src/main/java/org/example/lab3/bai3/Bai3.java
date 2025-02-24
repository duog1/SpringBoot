package org.example.lab3.bai3;
import java.util.Scanner;

public class Bai3 {
    public static int UCLN(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int BCNN(int a, int b) {
        return (a * b) / UCLN(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số a: ");
        int a = sc.nextInt();
        System.out.print("Nhập số b: ");
        int b = sc.nextInt();
        System.out.println("UCLN của " + a + " và " + b + " là: " + UCLN(a, b));
        System.out.println("BCNN của " + a + " và " + b + " là: " + BCNN(a, b));
    }
}

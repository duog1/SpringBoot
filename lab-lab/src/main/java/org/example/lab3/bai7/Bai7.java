package org.example.lab3.bai7;

import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số N > 0: ");
        int N = sc.nextInt();

        System.out.print("a. Các số lẻ < N: ");
        for (int i = 1; i < N; i += 2) {
            System.out.print(i + " ");
        }

        int sum = 0, count = 0;
        for (int i = 1; i < N; i += 2) {
            sum += i * i;
            count++;
        }
        System.out.println("\nb. Tổng bình phương số lẻ: " + sum);

        double avg = (double) N / 2;
        System.out.print("c. Các số chẵn > trung bình cộng: ");
        for (int i = 2; i <= N; i += 2) {
            if (i > avg) System.out.print(i + " ");
        }
    }
}

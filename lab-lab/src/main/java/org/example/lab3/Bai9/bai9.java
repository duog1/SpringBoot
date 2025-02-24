package org.example.lab3.Bai9;

import java.util.Scanner;

public class bai9 {
    public static void main(String args[]){
        System.out.println("-----Menu----");
        System.out.println("1. Đi học Java");
        System.out.println("2. Đi chơi Công viên ngắm gấu");
        System.out.println("3. Đi (về) nhà nghỉ");
        System.out.println("4. Ra sông Hồng tắm tiên");
        System.out.println("5. Ngủ cả ngày");
        System.out.println("6. Thoát");
        System.out.print("Hãy nhập lựa chọn của bạn (1-6): ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        switch (n){
            case 1:
                System.out.println("Đi học Java");
                break;
            case 2:
                System.out.println("Đi chơi công viên ngắm gấu");
                break;
            case 3:
                System.out.println("Đi (về) nhà nghỉ");
                break;
            case 4:
                System.out.println("Ra sông hồng tắm tiên");
                break;
            case 5:
                System.out.println("Ngủ cả ngày");
            default:
                System.exit(6);
        }
    }
}

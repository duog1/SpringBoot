package lab01.bai6;

import java.util.Scanner;

public class Bai6 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập 2 số nguyên n, m: ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.print("Nhập 2 số thực n2, m2: ");
        float n2 = sc.nextFloat();
        float m2= sc.nextFloat();
        int sum = n + m;
        System.out.println("Tổng 2 số nguyên = " +sum);
        float sum2 = n2 + m2;
        System.out.println("Tổng 2 số thực = " + sum2);
        float sum3 = n + n2;
        System.out.println("Tổng n1 + n2 = " +sum3);
    }
}

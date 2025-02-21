package lab02.bai6;

import java.util.Scanner;

public class Bai6 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập 3 cạnh tam giác: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a > 0 && b > 0 && c > 0 && (a+b > c) && (a+c > b) && (b+c > a)){
            System.out.println("3 cạnh trên tạo thành hình tam giác");
            int chuVi = a + b + c;
            double p = chuVi / 2.0;
            System.out.println("Chu vi tam giác = " +chuVi);
            double dienTich = Math.sqrt(p * (p - a) * (p - b) * (p - c));
            System.out.println("Diện tích tam giác = " +dienTich);
        }else {
            System.out.println("3 cạnh trên không tạo thành tam giác !");
        }
    }
}

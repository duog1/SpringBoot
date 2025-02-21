package lab01.bai4;

import java.util.Scanner;

public class Bai4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số nguyên n, Số thực m, Xâu ký tự: ");
        int n = sc.nextInt();
        float m = sc.nextFloat();
        sc.nextLine();
        String str = sc.nextLine();
        System.out.println("Số nguyên n: "+ n);
        System.out.println("Số thực m: " +m);
        System.out.println("Xâu ký tự: " +str);

    }
}

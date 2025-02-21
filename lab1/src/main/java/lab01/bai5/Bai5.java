package lab01.bai5;

import java.util.Scanner;

public class Bai5 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n và m: ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int sum = n + m;
        System.out.println("Tổng là: " +sum);
    }
}

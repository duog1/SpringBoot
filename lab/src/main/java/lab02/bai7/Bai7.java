package lab02.bai7;

import java.util.Scanner;

public class Bai7 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập 4 số: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int x = Math.max(a, b);
        int y = Math.max(c, d);
        int max = Math.max(x, y);
        System.out.println("Max = " +max);
    }
}

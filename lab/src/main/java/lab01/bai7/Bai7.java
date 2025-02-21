package lab01.bai7;

import java.util.Scanner;

public class Bai7 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập a và b: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        System.out.println("Max = " +max);
        System.out.println("Min = " +min);

    }
}

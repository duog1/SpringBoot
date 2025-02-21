package lab01.bai2;

import java.util.Scanner;

public class Bai2 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập 1 số nguyên n: ");
        int n = scanner.nextInt();
        System.out.println("Số vừa nhập là: " +n);
        scanner.close();
    }
}


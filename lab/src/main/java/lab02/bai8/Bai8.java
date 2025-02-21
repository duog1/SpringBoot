package lab02.bai8;

import java.util.Scanner;

public class Bai8 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào tháng (1-12): ");
        int m = sc.nextInt();
        int d;
        switch (m){
            case 1, 3, 5, 7, 8, 10, 12:
                d = 30;
                break;
            case 4, 6, 9, 11:
                d = 31;
                break;
            case 2:
                System.out.printf("Nhập năm: ");
                int y = sc.nextInt();
                if (y %4 == 0){
                    d = 29;
                } else {
                    d = 28;
                }
                break;
            default:
                System.out.println("Tháng không hợp lệ !");
                return;
        }
        System.out.println("Tháng " +m+ "có " +d+" ngày");
    }
}

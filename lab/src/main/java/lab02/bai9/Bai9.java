package lab02.bai9;
import java.util.Scanner;

public class Bai9 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap lua chon cua ban B - K - G");
        char nguoiChoi = sc.next().charAt(0);
        System.out.print("Nhap lua chon cua doi thu B - K - G");
        char doiThu = sc.next().charAt(0);
        switch (nguoiChoi){
            case 'B':
                switch (doiThu){
                    case 'K':
                        System.out.println("YOU WIN !");
                        break;
                    case 'G':
                        System.out.println("YOU LOSE !");
                        break;
                    default:
                        System.out.println("TIE !");
                        break;
                }
            case 'K':
                switch (doiThu){
                    case 'B':
                        System.out.println("YOU LOSE !");
                        break;
                    case 'G':
                        System.out.println("YOU WIN !");
                        break;
                    default:
                        System.out.println("TIE !");
                        break;
                }
            case 'G':
                switch (doiThu){
                    case 'B':
                        System.out.println("YOU WIN !");
                        break;
                    case 'K':
                        System.out.println("YOU LOSE !");
                        break;
                    default:
                        System.out.println("TIE !");
                        break;
                }
        }
    }
}

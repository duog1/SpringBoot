package lab02.bai2;

import java.util.Scanner;

public class XeMay {
    private String ten;
    private String nhaSanXuat;
    private int soLuongBanhXe;
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên xe: ");
        ten = sc.nextLine();
        System.out.print("Nhập tên nhà sản xuất: ");
        nhaSanXuat = sc.nextLine();
        System.out.print("Nhập số lượng bánh xe: ");
        soLuongBanhXe = sc.nextInt();
    }
    public void view(){
        System.out.println("-----Thông tin-----");
        System.out.println("Tên: " +ten);
        System.out.println("Nhà sản xuất: " +nhaSanXuat);
        System.out.println("Số lượng bánh xe: " +soLuongBanhXe);
    }
    public static void main(String args[]){
        XeMay xeMay = new XeMay();
        xeMay.input();
        xeMay.view();
    }
}

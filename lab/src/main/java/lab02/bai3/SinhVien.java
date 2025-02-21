package lab02.bai3;

import java.util.Scanner;

public class SinhVien {
    private String name;
    private String maSV;
    private float diemTH;
    private float diemLT;

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên: ");
        name = sc.nextLine();
        System.out.print("Nhập Mã SV: ");
        maSV = sc.nextLine();
        System.out.print("Nhập điểm thực hành: ");
        diemTH = sc.nextFloat();
        System.out.println("Nhập điểm lý thuyết: ");
        diemLT = sc.nextFloat();
    }
    public void view(){
        System.out.println("-----Thông tin-----");
        System.out.println("Tên: " +name);
        System.out.println("Mã SV: " +maSV);
        System.out.println("Điểm TH: " +diemTH);
        System.out.println("Điểm LT: " +diemLT);
    }
    public void rank(){
            if (diemLT < 4){
                System.out.println("Thi lại lý thuyết !!");
            }
            if (diemTH < 4){
                System.out.println("Thi lại thực hành !!");
            }

            float diemTB = (diemLT + diemTH) / 2;
            if (diemTB < 4){
                System.out.println("Sinh viên phải học lại !!");
            } else if (diemTB >= 4 && diemTB <= 7) {
                System.out.println("Sinh viên đạt môn Java !");
            }else {
                System.out.println("Sinh viên xuất sắc môn Java");
            }
    }
    public static void main(String args[]){
        SinhVien sinhVien = new SinhVien();
        sinhVien.input();
        sinhVien.view();
        sinhVien.rank();
    }
}

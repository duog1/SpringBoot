package lab02.bai1;

import java.util.Scanner;

public class Person {
    private String name;
    private String address;
    private double salary;

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên: ");
        name = sc.nextLine();
        System.out.print("Nhập địa chỉ: ");
        address = sc.nextLine();
        System.out.print("Nhập lương: ");
        salary = sc.nextDouble();
    }
    public void view(){
        System.out.println("======================");
        System.out.println("Thông tin person: ");
        System.out.println("Tên: " +name);
        System.out.println("Địa chỉ: " +address);
        System.out.println("Lương : " +salary);
    }
    public static void main(String args[]){
        Person person = new Person();
        person.input();
        person.view();
    }
}

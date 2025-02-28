package org.example.product;

import java.util.Scanner;

public class Product {
    private String prodId;
    private String prodName;
    private String manufacturer;
    private float producerPrice;

    public Product() {
    }

    public Product(String prodId, String prodName, String manufacturer, float producerPrice) {
        this.prodId = prodId;
        this.prodName = prodName;
        this.manufacturer = manufacturer;
        this.producerPrice = producerPrice;
    }

    public String getProdId() {
        return prodId;
    }

    public void setProdId(String prodId) {
        this.prodId = prodId;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public float getProducerPrice() {
        return producerPrice;
    }

    public void setProducerPrice(float producerPrice) {
        this.producerPrice = producerPrice;
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập ID product: ");
        prodId = sc.nextLine();
        System.out.print("Nhập tên product: ");
        prodName = sc.nextLine();
        System.out.print("Nhập nhà sản xuất: ");
        manufacturer = sc.nextLine();
        System.out.print("Nhập giá sản xuất: ");
        producerPrice = sc.nextFloat();
    }
    public void display() {
        System.out.println("-----THÔNG TIN-----");
        System.out.println("Mã sản phẩm: " + prodId);
        System.out.println("Tên sản phẩm: " + prodName);
        System.out.println("Nhà sản xuất: " + manufacturer);
        System.out.println("Giá sản xuất: " + producerPrice);
    }
    public float claculateSalePrice(){
        return producerPrice + 0.05f * producerPrice;
    }

}

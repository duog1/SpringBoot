package org.example.vietnam;

import org.example.product.Product;

import java.util.Scanner;

public class VietNamImportPrice extends Product {
    private float taxImported;

    public VietNamImportPrice() {
        super();
        this.taxImported = 0.0f;
    }

    public VietNamImportPrice(String prodId, String prodName, String manufacturer, float producerPrice, float taxImported) {
        super(prodId, prodName, manufacturer, producerPrice);
        this.taxImported = taxImported;
    }

    public float getTaxImported() {
        return taxImported;
    }

    public void setTaxImported(float taxImported) {
        this.taxImported = taxImported;
    }
    @Override
    public void input(){
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập thuế sản phẩm: ");
        this.taxImported = sc.nextFloat();
    }

    @Override
    public float claculateSalePrice() {
        float importPrice = getProducerPrice() + (taxImported / 100) * getProducerPrice();
        return importPrice + 0.10f * importPrice;
    }

    public void display(){
        super.display();
        System.out.println("Thuế nhập khẩu: " +taxImported+ "%");
        System.out.println("Giá bán tại việt nam: " +claculateSalePrice());
    }

}

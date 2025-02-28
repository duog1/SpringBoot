package org.example.thailand;

import org.example.product.Product;

import java.util.Scanner;

public class ThaiLandImportPrice extends Product {
    private float taxImported;
    private float importPriceSupport;

    public ThaiLandImportPrice() {
        super();
        this.taxImported = 0.0f;
        this.importPriceSupport = 0.0f;
    }

    public ThaiLandImportPrice(String prodId, String prodName, String manufacturer, float producerPrice, float taxImported, float importPriceSupport) {
        super(prodId, prodName, manufacturer, producerPrice);
        this.taxImported = taxImported;
        this.importPriceSupport = importPriceSupport;
    }

    public float getTaxImported() {
        return taxImported;
    }

    public void setTaxImported(float taxImported) {
        this.taxImported = taxImported;
    }

    public float getImportPriceSupport() {
        return importPriceSupport;
    }

    public void setImportPriceSupport(float importPriceSupport) {
        this.importPriceSupport = importPriceSupport;
    }

    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập thuế nhập khẩu (%): ");
        this.taxImported = sc.nextFloat();
        System.out.println("Nhập giá hỗ trợ (%): ");
        this.importPriceSupport = sc.nextFloat();
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Thuế nhập khẩu: "+taxImported);
        System.out.println("Giá hỗ trợ nhập khẩu: "+importPriceSupport);
        System.out.println("Giá bán tại thái lan: "+claculateSalePrice());
    }

    @Override
    public float claculateSalePrice() {
        float importedPrice = getProducerPrice();
        float taxAmount = (taxImported / 100) * importedPrice;
        float supportAmount = (importPriceSupport / 100) * importedPrice;
        float finalPrice = importedPrice + taxAmount - supportAmount;
        return finalPrice + 0.10f * finalPrice; // Cộng thêm 10% lợi nhuận
    }

}

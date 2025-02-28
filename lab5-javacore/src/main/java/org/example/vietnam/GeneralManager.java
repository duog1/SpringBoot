package org.example.vietnam;

import org.example.product.Product;
import org.example.thailand.ThaiLandImportPrice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class GeneralManager {
    private ArrayList<VietNamImportPrice> vietnamProducts;
    private ArrayList<ThaiLandImportPrice> thailandProducts;
    private Scanner scanner;
    public GeneralManager() {
        vietnamProducts = new ArrayList<>();
        thailandProducts = new ArrayList<>();
        scanner = new Scanner(System.in);
    }
    public void inputVietnamProducts() {
        System.out.print("Nhập số lượng sản phẩm nhập khẩu vào Việt Nam: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Clear buffer

        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin sản phẩm " + (i + 1) + ": ");
            VietNamImportPrice product = new VietNamImportPrice();
            product.input();
            vietnamProducts.add(product);
        }
    }
    public void inputThailandProducts() {
        System.out.print("Nhập số lượng sản phẩm nhập khẩu vào Thái Lan: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Clear buffer

        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin sản phẩm " + (i + 1) + ": ");
            ThaiLandImportPrice product = new ThaiLandImportPrice();
            product.input();
            thailandProducts.add(product);
        }
    }
    public void displayAllProducts() {
        System.out.println("Danh sách sản phẩm nhập khẩu vào Việt Nam:");
        for (VietNamImportPrice product : vietnamProducts) {
            product.display();
        }

        System.out.println("\nDanh sách sản phẩm nhập khẩu vào Thái Lan:");
        for (ThaiLandImportPrice product : thailandProducts) {
            product.display();
        }
    }
    public void sortByProductName() {
        Comparator<Product> comparator = Comparator.comparing(Product::getProdName);

        Collections.sort(vietnamProducts, comparator);
        Collections.sort(thailandProducts, comparator);

        System.out.println("Danh sách sau khi sắp xếp:");
        displayAllProducts();
    }

    // 5. Tính toán giá bán và hiển thị
    public void calculateAndDisplaySalePrice() {
        System.out.println("Giá bán tại Việt Nam:");
        for (VietNamImportPrice product : vietnamProducts) {
            System.out.println(product.getProdName() + " - Giá bán: " + product.claculateSalePrice());
        }

        System.out.println("\nGiá bán tại Thái Lan:");
        for (ThaiLandImportPrice product : thailandProducts) {
            System.out.println(product.getProdName() + " - Giá bán: " + product.claculateSalePrice());
        }
    }
    public void searchBySalePrice() {
        System.out.print("Nhập giá bán cần tìm: ");
        float targetPrice = scanner.nextFloat();

        System.out.println("Kết quả tìm kiếm ở Việt Nam:");
        for (VietNamImportPrice product : vietnamProducts) {
            if (product.claculateSalePrice() == targetPrice) {
                product.display();
            }
        }

        System.out.println("\nKết quả tìm kiếm ở Thái Lan:");
        for (ThaiLandImportPrice product : thailandProducts) {
            if (product.claculateSalePrice() == targetPrice) {
                product.display();
            }
        }
    }

    // 7. Thoát chương trình
    public void exitProgram() {
        System.out.println("Chương trình kết thúc!");
        System.exit(0);
    }
    public void run() {
        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Nhập sản phẩm nhập vào Việt Nam");
            System.out.println("2. Nhập sản phẩm nhập vào Thái Lan");
            System.out.println("3. Hiển thị tất cả sản phẩm");
            System.out.println("4. Sắp xếp theo tên sản phẩm");
            System.out.println("5. Tính giá bán");
            System.out.println("6. Tìm kiếm theo giá bán");
            System.out.println("7. Thoát");
            System.out.print("Chọn chức năng: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Clear buffer

            switch (choice) {
                case 1: inputVietnamProducts(); break;
                case 2: inputThailandProducts(); break;
                case 3: displayAllProducts(); break;
                case 4: sortByProductName(); break;
                case 5: calculateAndDisplaySalePrice(); break;
                case 6: searchBySalePrice(); break;
                case 7: exitProgram(); break;
                default: System.out.println("Lựa chọn không hợp lệ, vui lòng nhập lại!");
            }
        }
    }
    public static void main(String[] args) {
        GeneralManager manager = new GeneralManager();
        manager.run();
    }
}

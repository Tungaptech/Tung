package Tuluyen.day5;

import java.util.Scanner;

/**
 * Chuong trinh quan ly kho quan ao
 */

public class MainKho {
    public static void main(String[] args) {
        createMenu();

    }

    public static void createMenu() {
        Scanner sc = new Scanner(System.in);
        KhoController khoController = new KhoController();
        while (true) {
            System.out.println("Chuong trinh quan ly kho quan ao");
            System.out.println("================================");
            System.out.println("1. Them ma quan ao moi");
            System.out.println("2. Hien thi danh sach quan ao moi");
            System.out.println("3. Sua thong tin quan ao");
            System.out.println("4. Xoa quan ao");
            System.out.println("5. Thoat chuong trinh");
            System.out.println("==============================");
            System.out.print("Vui long nhap lua chon : ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    khoController.create();
                    break;
                case 2:
                    khoController.showListKho();
                    break;
                case 3:
                    System.out.println("Chuc nang dang phat trien");
                    break;
                case 4:
                    System.out.println("Chuc nang dang phat trien");
                    break;
                case 5:
                    System.out.println("Tam biet, hen gap lai");
                    break;
                default:
                    System.out.println("Vui long lua chon tu 1 den 5");
                    break;

            }
            if (choice == 5) {
                break;
            }
        }
    }
}

package Tuluyen.day5;

import java.util.ArrayList;
import java.util.Scanner;

public class KhoController {

    ArrayList<Kho> khos = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void create(){
        System.out.println("Vui long nhap thong tin quan ao: ");
        System.out.print("Nhap nhap thong tin id: ");
        long id = scanner.nextLong();
        scanner.nextLine();

        System.out.print("Nhap ten quan: ");
        String tenQuan = scanner.nextLine();
        System.out.print("Nhap ten ao: ");
        String tenAo = scanner.nextLine();

        Kho kho = new Kho(id, tenQuan, tenAo);
        kho.setId(id);
        kho.settenQuan(tenQuan);
        kho.settenAo(tenAo);

        khos.add(kho);

}
public void showListKho(){
        System.out.println("Hien thi danh sach kho: ");
        System.out.println("=====================");
System.out.printf("%-30s || %-30s || %-30s\n", "Id ", "tenAo", "tenQuan");
System.out.println("=====================");
for (int i = 0; i < khos.size(); i++) {
    Kho k = khos.get(i);
    System.out.printf("%-30s || %-30s || %-30s\n", k.getId(), k.gettenAo(), k.gettenQuan() );
}
System.out.println("Enter de tiep tuc");
scanner.nextLine();
}
}

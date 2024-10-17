package listInterface;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();

        // Thêm phần tử
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        // In ra danh sách
        System.out.println("Fruits: " + fruits);

        // Truy cập phần tử
        String firstFruit = fruits.get(0);
        System.out.println("First fruit: " + firstFruit);

        // Xóa phần tử
        fruits.remove("Banana");
        System.out.println("After removing Banana: " + fruits);
    }
}

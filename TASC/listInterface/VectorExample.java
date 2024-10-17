package listInterface;

import java.util.List;
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        List<String> vector = new Vector<>();

        // Thêm phần tử
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Cherry");

        // In ra danh sách
        System.out.println("Vector: " + vector);

        // Truy cập phần tử
        String secondFruit = vector.get(1);
        System.out.println("Second fruit: " + secondFruit);

        // Xóa phần tử
        vector.remove("Cherry");
        System.out.println("After removing Cherry: " + vector);
    }
}

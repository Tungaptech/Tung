package listInterface;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        List<String> linkedList = new LinkedList<>();

        // Thêm phần tử
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Cherry");

        // Thêm vào đầu danh sách
        linkedList.add(0, "Mango");

        // In ra danh sách
        System.out.println("LinkedList: " + linkedList);

        // Xóa phần tử đầu tiên
        linkedList.remove(0);
        System.out.println("After removing first element: " + linkedList);
    }
}

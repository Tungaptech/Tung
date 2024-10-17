package mapInterface;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        Map<Integer, String> treeMap = new TreeMap<>();

        // Thêm cặp key-value
        treeMap.put(3, "Cherry");
        treeMap.put(1, "Apple");
        treeMap.put(2, "Banana");

        // In ra bản đồ
        System.out.println("TreeMap: " + treeMap); // In ra theo thứ tự tăng dần của key
    }
}


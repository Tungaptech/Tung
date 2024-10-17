package mapInterface;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();

        // Thêm cặp key-value
        hashMap.put("Apple", 1);
        hashMap.put("Banana", 2);
        hashMap.put("Cherry", 3);

        // In ra bản đồ
        System.out.println("HashMap: " + hashMap);

        // Lấy giá trị theo key
        int value = hashMap.get("Banana");
        System.out.println("Value for 'Banana': " + value);
    }
}


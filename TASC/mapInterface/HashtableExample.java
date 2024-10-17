package mapInterface;

import java.util.Hashtable;
import java.util.Map;

public class HashtableExample {
    public static void main(String[] args) {
        Map<String, Integer> hashtable = new Hashtable<>();

        // Thêm cặp key-value
        hashtable.put("Apple", 1);
        hashtable.put("Banana", 2);
        hashtable.put("Cherry", 3);

        // In ra bản đồ
        System.out.println("Hashtable: " + hashtable);
    }
}


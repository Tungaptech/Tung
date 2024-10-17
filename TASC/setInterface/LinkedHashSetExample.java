package setInterface;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        Set<String> linkedHashSet = new LinkedHashSet<>();

        // Thêm phần tử
        linkedHashSet.add("Apple");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Cherry");
        linkedHashSet.add("Apple"); // Phần tử trùng lặp sẽ không được thêm

        // In ra tập hợp
        System.out.println("LinkedHashSet: " + linkedHashSet);
    }
}


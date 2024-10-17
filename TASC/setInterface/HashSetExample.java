package setInterface;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();

        // Thêm phần tử
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Cherry");
        hashSet.add("Apple"); // Phần tử trùng lặp sẽ không được thêm

        // In ra tập hợp
        System.out.println("HashSet: " + hashSet);
    }
}

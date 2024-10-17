package setInterface;

import java.util.TreeSet;
import java.util.Set;

public class TreeSetExample {
    public static void main(String[] args) {
        Set<Integer> treeSet = new TreeSet<>();

        // Thêm phần tử
        treeSet.add(5);
        treeSet.add(1);
        treeSet.add(3);
        treeSet.add(2);
        treeSet.add(4);

        // In ra tập hợp
        System.out.println("TreeSet: " + treeSet); // In ra theo thứ tự tăng dần
    }
}


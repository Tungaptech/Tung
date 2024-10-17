package QueueInterface;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        // Thêm phần tử
        queue.add("Apple");
        queue.add("Banana");
        queue.add("Cherry");

        // In ra hàng đợi
        System.out.println("Queue: " + queue);

        // Lấy và xóa phần tử đầu tiên
        String first = queue.poll();
        System.out.println("First element removed: " + first);
        System.out.println("Queue after removal: " + queue);
    }
}

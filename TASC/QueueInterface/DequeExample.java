package QueueInterface;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();

        // Thêm phần tử vào đầu và cuối
        deque.addFirst("Apple");
        deque.addLast("Banana");
        deque.addLast("Cherry");

        // In ra Deque
        System.out.println("Deque: " + deque);

        // Lấy và xóa phần tử đầu
        String first = deque.removeFirst();
        System.out.println("First element removed: " + first);
        System.out.println("Deque after removal: " + deque);
    }
}


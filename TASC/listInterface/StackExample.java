package listInterface;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        // Thêm phần tử
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");

        // In ra stack
        System.out.println("Stack: " + stack);

        // Lấy phần tử trên cùng mà không xóa
        String topElement = stack.peek();
        System.out.println("Top element: " + topElement);

        // Lấy và xóa phần tử trên cùng
        String poppedElement = stack.pop();
        System.out.println("Popped element: " + poppedElement);
        System.out.println("Stack after pop: " + stack);
    }
}

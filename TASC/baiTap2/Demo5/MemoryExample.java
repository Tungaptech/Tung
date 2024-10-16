package Demo5;

public class MemoryExample {

    // Biến cục bộ (được lưu trữ trên stack)
    public void methodStack() {
        int localVariable = 10; // Biến cục bộ
        System.out.println("Local Variable (Stack): " + localVariable);
    }

    // Đối tượng (được lưu trữ trên heap)
    public void methodHeap() {
        String[] dynamicArray = new String[3]; // Cấp phát động
        dynamicArray[0] = "Java";
        dynamicArray[1] = "Python";
        dynamicArray[2] = "C++";

        System.out.println("Dynamic Array (Heap): ");
        for (String lang : dynamicArray) {
            System.out.println(lang);
        }
    }

    public static void main(String[] args) {
        MemoryExample example = new MemoryExample();
        example.methodStack(); // Gọi phương thức stack
        example.methodHeap();  // Gọi phương thức heap
    }
}


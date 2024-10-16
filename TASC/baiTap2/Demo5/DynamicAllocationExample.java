package Demo5;

public class DynamicAllocationExample {
    public static void main(String[] args) {
        int[] dynamicArray = new int[5]; // Cấp phát động
        for (int i = 0; i < dynamicArray.length; i++) {
            dynamicArray[i] = i * 2;
        }

        System.out.println("Dynamic Array: ");
        for (int num : dynamicArray) {
            System.out.println(num);
        }
    }
}

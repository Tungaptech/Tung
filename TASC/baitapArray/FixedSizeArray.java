package baitapArray;

public class FixedSizeArray {
    public static void main(String[] args) {
        // Mảng có kích thước cố định
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;

        // Ghi thử vào chỉ số vượt quá kích thước
        // numbers[3] = 4; // Lỗi ArrayIndexOutOfBoundsException

        System.out.println("Kích thước mảng: " + numbers.length);
    }
}


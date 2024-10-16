package Demo3;

public class FinalDemo {
    final int finalVariable = 100; // biến final

    void changeFinalVariable() {
        // finalVariable = 200; // Sẽ gây lỗi biên dịch
    }

    public static void main(String[] args) {
        FinalDemo demo = new FinalDemo();
        System.out.println("Giá trị của biến final: " + demo.finalVariable);

        // Uncommenting the line below will cause a compile-time error
        // demo.finalVariable = 200; // Không thể thay đổi giá trị
    }
}

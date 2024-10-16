public class Demo1 {

    public static void main(String[] args) {
        // Kiểu dữ liệu nguyên thủy
        int primitiveInt = 10;
        double primitiveDouble = 20.5;

        // Kiểu dữ liệu đối tượng
        Integer objectInt = Integer.valueOf(primitiveInt); // Chuyển từ nguyên thủy sang đối tượng
        Double objectDouble = Double.valueOf(primitiveDouble); // Chuyển từ nguyên thủy sang đối tượng

        // So sánh nguyên thủy
        System.out.println("So sánh nguyên thủy: " + (primitiveInt < 15)); // true

        // So sánh đối tượng
        Integer anotherObjectInt = 10;
        System.out.println("So sánh đối tượng (==): " + (objectInt == anotherObjectInt)); // true (so sánh địa chỉ)
        System.out.println("So sánh đối tượng (.equals()): " + objectInt.equals(anotherObjectInt)); // true (so sánh giá trị)

        // Giá trị khởi tạo
        int num = 0; // Kiểu dữ liệu nguyên thủy
        String str = null; // Kiểu dữ liệu đối tượng

        System.out.println("Giá trị khởi tạo nguyên thủy: " + num); // 0
        System.out.println("Giá trị khởi tạo đối tượng: " + str); // null
    }
}

public class Demo2 {

    public static void main(String[] args) {
        // 1. Tạo các biến String
        String str1 = "Hello, World!";
        String str2 = new String("Hello, World!");
        String str3 = "Hello, " + "World!";
        String str4 = String.valueOf(123);

        // 2. In ra các giá trị
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
        System.out.println("str3: " + str3);
        System.out.println("str4: " + str4);

        // 3. So sánh các chuỗi
        System.out.println("str1 == str2: " + (str1 == str2)); // false
        System.out.println("str1.equals(str2): " + str1.equals(str2)); // true
        System.out.println("str1 == str3: " + (str1 == str3)); // true

        // 4. Thông tin về String Pool
        String str5 = "Hello";
        String str6 = "Hello";
        System.out.println("str5 == str6: " + (str5 == str6)); // true (cùng tham chiếu trong String Pool)

        // 5. Sử dụng các phương thức String
        System.out.println("Length of str1: " + str1.length());
        System.out.println("Substring of str1: " + str1.substring(7)); // World!
        System.out.println("Uppercase str1: " + str1.toUpperCase()); // HELLO, WORLD!
    }
}

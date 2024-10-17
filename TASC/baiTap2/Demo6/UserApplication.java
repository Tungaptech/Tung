package Demo6;

public class UserApplication {
    public static void main(String[] args) {
        UserManager userManager = new UserManager();

        // Tạo người dùng với độ tuổi hợp lệ
        userManager.createUser("Alice", 20);

        // Tạo người dùng với độ tuổi không hợp lệ
        userManager.createUser("Bob", 15);

        // Đọc người dùng từ tệp
        userManager.readUsersFromFile("users.txt");
    }
}

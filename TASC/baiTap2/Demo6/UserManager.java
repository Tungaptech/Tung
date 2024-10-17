package Demo6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// Lớp UserManager
class UserManager {
    public void createUser(String name, int age) {
        try {
            User user = new User(name, age);
            System.out.println("User created: " + user.getName() + ", Age: " + user.getAge());
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Phương thức để đọc tệp người dùng
    public void readUsersFromFile(String filePath) {
        // Try-with-resources để tự động đóng tài nguyên
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                String name = parts[0];
                int age = Integer.parseInt(parts[1]);
                createUser(name, age);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid age format: " + e.getMessage());
        }
    }
}


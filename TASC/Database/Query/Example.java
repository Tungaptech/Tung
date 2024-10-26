package Database.Query;

import java.sql.*;

public class Example {
    public static void main(String[] args) {
        try {
            // Đăng ký driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Kết nối đến cơ sở dữ liệu
            String url = "jdbc:mysql://localhost:3306/yourdb?useSSL=false&serverTimezone=UTC";
            Connection conn = DriverManager.getConnection(url, "username", "password");

            // Sử dụng Connection
            // ...

            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}


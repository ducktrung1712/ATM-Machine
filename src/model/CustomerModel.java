package model;

import entity.Customer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerModel {
    public Customer login(String phone, String pin) {
        String sql = "SELECT * FROM customer WHERE phone = ? AND pin = ?";
        try (Connection connection = MySQLConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, phone);
            statement.setString(2, pin);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                // Lấy customer_id từ kết quả truy vấn
                int customerId = resultSet.getInt("customer_id");
                // Trả về đối tượng Customer, bao gồm customer_id
                return new Customer(
                    customerId,  // customer_id
                    resultSet.getString("fullname"),
                    resultSet.getString("cccd"),
                    resultSet.getString("birthday"),
                    resultSet.getString("address"),
                    resultSet.getString("phone"),
                    resultSet.getString("pin"),
                    resultSet.getString("email"),
                    resultSet.getString("occupation"),
                    resultSet.getDouble("balance"),
                    resultSet.getBytes("sign_sample"),
                    resultSet.getBytes("profile_picture"),
                    resultSet.getBoolean("gender")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    // Phương thức nạp tiền
    public boolean deposit(int customerId, double amount) {
        String sql = "UPDATE customer SET balance = balance + ? WHERE customer_id = ?";
        try (Connection connection = MySQLConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setDouble(1, amount);
            statement.setInt(2, customerId);
            int rowsUpdated = statement.executeUpdate();
            return rowsUpdated > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    // Phương thức rút tiền
    public boolean withdraw(int customerId, double amount) {
        String sql = "UPDATE customer SET balance = balance - ? WHERE customer_id = ? AND balance >= ?";
        try (Connection connection = MySQLConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setDouble(1, amount);
            statement.setInt(2, customerId);
            statement.setDouble(3, amount);
            int rowsUpdated = statement.executeUpdate();
            return rowsUpdated > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    
}


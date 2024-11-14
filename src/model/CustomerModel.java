package model;

import entity.Customer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerModel {
    public Customer login(String phone, String pin) {
    String sql = "SELECT c.* FROM customer c " +
                 "JOIN account a ON c.customer_id = a.customer_id " +
                 "WHERE c.phone = ? AND a.pin = ?";
    try (Connection connection = MySQLConnection.getConnection();
         PreparedStatement statement = connection.prepareStatement(sql)) {
        statement.setString(1, phone);
        statement.setString(2, pin);
        ResultSet resultSet = statement.executeQuery();
        if (resultSet.next()) {
            // Trả về đối tượng Customer, bao gồm thông tin cần thiết
            return new Customer(
                resultSet.getInt("customer_id"),
                resultSet.getString("fullname"),
                resultSet.getString("cccd"),
                resultSet.getString("birthday"),
                resultSet.getString("address"),
                resultSet.getString("phone"),
                resultSet.getString("email"),
                resultSet.getString("occupation"),
                resultSet.getBytes("sign_sample"),
                resultSet.getBytes("profile_picture"),
                resultSet.getString("gender")
            );
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return null;
}

    // Phương thức nạp tiền
    public boolean deposit(int customerId, double amount) {
    String sql = "UPDATE account SET balance = balance + ? WHERE customer_id = ?";
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
    String sql = "UPDATE account SET balance = balance - ? WHERE customer_id = ? AND balance >= ?";
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
public double getBalance(int customerId) {
        String sql = "SELECT balance FROM account WHERE customer_id = ?";
        try (Connection connection = MySQLConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, customerId);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                return resultSet.getDouble("balance");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
    
}


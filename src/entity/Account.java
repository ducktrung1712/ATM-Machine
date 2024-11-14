/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author Lucifer
 */
public class Account {
    private int accountId;
    private int customerId;
    private int employeeId;
    private String createDate;
    private String validationDate;
    private String accountType;
    private String username;
    private String password;
    private String role;
    private String status;
    private double balance;
    private int pin;

    // Constructor, getters and setters
    public Account(int accountId, int customerId, int employeeId, String createDate, String validationDate, 
                   String accountType, String username, String password, String role, String status, 
                   double balance, int pin) {
        this.accountId = accountId;
        this.customerId = customerId;
        this.employeeId = employeeId;
        this.createDate = createDate;
        this.validationDate = validationDate;
        this.accountType = accountType;
        this.username = username;
        this.password = password;
        this.role = role;
        this.status = status;
        this.balance = balance;
        this.pin = pin;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getValidationDate() {
        return validationDate;
    }

    public void setValidationDate(String validationDate) {
        this.validationDate = validationDate;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountId=" + accountId +
                ", customerId=" + customerId +
                ", employeeId=" + employeeId +
                ", createDate='" + createDate + '\'' +
                ", validationDate='" + validationDate + '\'' +
                ", accountType='" + accountType + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                ", status='" + status + '\'' +
                ", balance=" + balance +
                ", pin=" + pin +
                '}';
    }
}

package controller;

import entity.Customer;
import model.CustomerModel;

public class CustomerController {
    private CustomerModel customerModel;

    public CustomerController() {
        this.customerModel = new CustomerModel();
    }

    // Đăng nhập
    public Customer login(String phone, String pin) {
        return customerModel.login(phone, pin);
    }

    // Nạp tiền
    public boolean deposit(Customer customer, double amount) {
        return customerModel.deposit(customer.getCustomerId(), amount);
    }

    // Rút tiền
    public boolean withdraw(Customer customer, double amount) {
        return customerModel.withdraw(customer.getCustomerId(), amount);
    }
}

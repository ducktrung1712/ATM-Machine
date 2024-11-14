/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import entity.Customer;
import model.CustomerModel;

/**
 *
 * @author Lucifer
 */
public class Main extends javax.swing.JFrame {

    private Customer customer;
    private CustomerModel customerModel;

    /**
     * Creates new form Main
     */
    public Main(Customer customer) {
        if (customer == null) {
        System.out.println("Customer object is null.");
    } else {
        this.customer = customer;
        setTitle("Máy ATM");
        initComponents();
        setLocationRelativeTo(null);
        jLabel2.setText("Xin chào " + customer.getFullname());
    }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnRut = new javax.swing.JButton();
        btnNap = new javax.swing.JButton();
        btnKiemtra = new javax.swing.JButton();
        btnDangxuat = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Vui lòng chọn chức năng");

        btnRut.setText("Rút tiền");
        btnRut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRutActionPerformed(evt);
            }
        });

        btnNap.setText("Nạp tiền");
        btnNap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNapActionPerformed(evt);
            }
        });

        btnKiemtra.setText("Kiểm tra số dư");
        btnKiemtra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKiemtraActionPerformed(evt);
            }
        });

        btnDangxuat.setText("Đăng xuất");
        btnDangxuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangxuatActionPerformed(evt);
            }
        });

        jLabel2.setText("Xin chào");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNap, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRut, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnKiemtra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDangxuat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96))
            .addGroup(layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRut, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnKiemtra, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNap, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDangxuat, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDangxuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangxuatActionPerformed
        this.dispose();
        Login loginView = new Login();
        loginView.setVisible(true);
    }//GEN-LAST:event_btnDangxuatActionPerformed

    private void btnKiemtraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKiemtraActionPerformed
        if (customer != null) {
        this.dispose();
        Balance balanceView = new Balance(customer); // Truyền đối tượng customer vào Balance
        balanceView.setVisible(true);
    } else {
        System.out.println("Customer object is null.");
    }
    }//GEN-LAST:event_btnKiemtraActionPerformed

    private void btnRutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRutActionPerformed
       if (customer != null) {
        this.dispose();
        Amount amountView = new Amount(customer, false);  // false cho rút tiền
        amountView.setVisible(true);
    } else {
        System.out.println("Customer object is null.");
    }
    }//GEN-LAST:event_btnRutActionPerformed

    private void btnNapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNapActionPerformed
       if (customer != null) {
        this.dispose();
        Amount amountView = new Amount(customer, true);  // true cho nạp tiền
        amountView.setVisible(true);
    } else {
        System.out.println("Customer object is null.");
    }
       
    }//GEN-LAST:event_btnNapActionPerformed
    public void updateBalance() {
        if (customer != null) {
            // Lấy số dư từ CustomerModel
            double balance = customerModel.getBalance(customer.getCustomerId());
            // Định dạng lại số dư với dấu phẩy để ngắt nhóm hàng nghìn
            String balanceFormatted = String.format("%,.0f VND", balance);
            System.out.println("Số dư hiện tại: " + balanceFormatted);
        } else {
            System.out.println("Customer object is null.");
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangxuat;
    private javax.swing.JButton btnKiemtra;
    private javax.swing.JButton btnNap;
    private javax.swing.JButton btnRut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}

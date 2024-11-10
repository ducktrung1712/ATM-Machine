/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import entity.Customer;
import controller.CustomerController;
import javax.swing.JOptionPane;

/**
 *
 * @author Lucifer
 */
public class Amount extends javax.swing.JFrame {
     private Customer customer;
    private CustomerController customerController;
    private boolean isDeposit;  // Biến lưu thông tin nạp/rút tiền

    /**
     * Creates new form Amount
     */
   public Amount(Customer customer, boolean isDeposit) {
    initComponents();
    setLocationRelativeTo(null);
    this.customer = customer;
    this.isDeposit = isDeposit;  // Lưu thông tin nạp/rút
    this.customerController = new CustomerController();
    // Thiết lập tiêu đề giao diện tùy vào chức năng
    if (isDeposit) {
        setTitle("Nạp tiền");
    } else {
        setTitle("Rút tiền");
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
        txtSotien = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnTrolai = new javax.swing.JButton();
        btnXacnhan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nhập số tiền:");

        jLabel2.setText("VND");

        btnTrolai.setText("Trở lại");
        btnTrolai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrolaiActionPerformed(evt);
            }
        });

        btnXacnhan.setText("Xác Nhận");
        btnXacnhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXacnhanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtSotien, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(16, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnXacnhan, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(btnTrolai, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSotien)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTrolai, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXacnhan, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnXacnhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXacnhanActionPerformed
        try {
            double amount = Double.parseDouble(txtSotien.getText());
            if (amount <= 0) {
                JOptionPane.showMessageDialog(this, "Số tiền phải lớn hơn 0.");
                return;
            }

            boolean success = false;
            if (isDeposit) {
                success = customerController.deposit(customer, amount);
            } else {
                success = customerController.withdraw(customer, amount);
            }

            if (success) {
                JOptionPane.showMessageDialog(this, "Giao dịch thành công!");
                Main mainView = new Main(customer);
                mainView.setVisible(true);
                mainView.updateBalance();
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Giao dịch không thành công!");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập số tiền hợp lệ.");
        }
    }//GEN-LAST:event_btnXacnhanActionPerformed

    private void btnTrolaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrolaiActionPerformed
        this.dispose();
        Main mainView = new Main(customer); // Quay lại màn hình chính
        mainView.setVisible(true);
    }//GEN-LAST:event_btnTrolaiActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTrolai;
    private javax.swing.JButton btnXacnhan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtSotien;
    // End of variables declaration//GEN-END:variables
}
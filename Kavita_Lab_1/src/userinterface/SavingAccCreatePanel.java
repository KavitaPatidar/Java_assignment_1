/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface;

import Business.SavingAccountInfo;
import javax.swing.JOptionPane;

/**
 *
 * @author Kavita
 */
public class SavingAccCreatePanel extends javax.swing.JPanel {

    /**
     * Creates new form SavingAccCreatePanel
     */
    public static SavingAccountInfo savingAccountInfoObject;
    private SavingAccountInfo savingAccInfo;
    
    
    public SavingAccCreatePanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        checkingAccInfo = new javax.swing.JLabel();
        createBtn = new javax.swing.JButton();
        bankName = new javax.swing.JLabel();
        bankNameTextField = new javax.swing.JTextField();
        bankRoutingNumber = new javax.swing.JLabel();
        bankRoutingNoTextField = new javax.swing.JTextField();
        bankAccountNumber = new javax.swing.JLabel();
        bankAccNoTextField = new javax.swing.JTextField();
        accountBalance = new javax.swing.JLabel();
        accBalanceTextField = new javax.swing.JTextField();
        accountType = new javax.swing.JLabel();
        accTypetextField = new javax.swing.JTextField();

        checkingAccInfo.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        checkingAccInfo.setText("Saving Account");

        createBtn.setText("Create");
        createBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtnActionPerformed(evt);
            }
        });

        bankName.setText("Bank Name");

        bankRoutingNumber.setText("Bank Routing Number");

        bankAccountNumber.setText("Bank Account Number");

        accountBalance.setText("Account Balance");

        accountType.setText("Account Type");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(checkingAccInfo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(createBtn)))
                .addContainerGap(145, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(bankName)
                        .addComponent(bankRoutingNumber)
                        .addComponent(bankAccountNumber)
                        .addComponent(accountBalance)
                        .addComponent(accountType))
                    .addGap(39, 39, 39)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(accTypetextField, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(accBalanceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bankAccNoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bankRoutingNoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bankNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(checkingAccInfo)
                .addGap(202, 202, 202)
                .addComponent(createBtn)
                .addContainerGap(271, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(73, 73, 73)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(bankName)
                                                .addComponent(bankNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(18, 18, 18)
                                            .addComponent(bankRoutingNumber))
                                        .addComponent(bankRoutingNoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addComponent(bankAccountNumber))
                                .addComponent(bankAccNoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addComponent(accountBalance))
                        .addComponent(accBalanceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(accountType)
                        .addComponent(accTypetextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(320, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed
        // TODO add your handling code here:
        String bankName, bankRoutingNumber, bankAccountNumber, accountBalance,accountType ;
        bankName=bankNameTextField.getText().toString();
        bankRoutingNumber=bankRoutingNoTextField.getText().toString();
        bankAccountNumber=bankAccNoTextField.getText().toString();
        accountBalance=accBalanceTextField.getText().toString();
        accountType=accTypetextField.getText().toString();
        
        savingAccountInfoObject = new SavingAccountInfo();
        savingAccountInfoObject.setBankName(bankName);
        savingAccountInfoObject.setBankRoutingNo(bankRoutingNumber);
        savingAccountInfoObject.setBankAccNo(bankAccountNumber);
        savingAccountInfoObject.setAccBalance(accountBalance);
        savingAccountInfoObject.setAccType(accountType);
        
         JOptionPane.showMessageDialog(null,"Created Sucessfully");
    }//GEN-LAST:event_createBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField accBalanceTextField;
    private javax.swing.JTextField accTypetextField;
    private javax.swing.JLabel accountBalance;
    private javax.swing.JLabel accountType;
    private javax.swing.JTextField bankAccNoTextField;
    private javax.swing.JLabel bankAccountNumber;
    private javax.swing.JLabel bankName;
    private javax.swing.JTextField bankNameTextField;
    private javax.swing.JTextField bankRoutingNoTextField;
    private javax.swing.JLabel bankRoutingNumber;
    private javax.swing.JLabel checkingAccInfo;
    private javax.swing.JButton createBtn;
    // End of variables declaration//GEN-END:variables

   
}

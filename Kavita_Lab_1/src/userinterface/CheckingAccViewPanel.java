/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface;

/**
 *
 * @author Kavita
 */
public class CheckingAccViewPanel extends javax.swing.JPanel {

    /**
     * Creates new form CheckingAccViewPanel
     */
    public CheckingAccViewPanel() {
        initComponents();
    }

      public void displayCheckingAcInfo(){
        String bankName = CheckingAccCreatePanel.checkingAccountInfoObject.getBankName();
        String routingNo = CheckingAccCreatePanel.checkingAccountInfoObject.getBankRoutingNo();
        String accNo = CheckingAccCreatePanel.checkingAccountInfoObject.getBankAccNo();
        String balance = CheckingAccCreatePanel.checkingAccountInfoObject.getAccBalance();
        String accountType = CheckingAccCreatePanel.checkingAccountInfoObject.getAccType();
        
        bankNameTextField.setText(bankName);
        bankRoutingNoTextField.setText(routingNo);
        bankAccNoTextField.setText(accNo);
        accBalanceTextField.setText(balance);
        accTypetextField.setText(accountType);
    
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
        checkingAccInfo.setText("Checking Account  ");

        bankName.setText("Bank Name");

        bankNameTextField.setEditable(false);

        bankRoutingNumber.setText("Bank Routing Number");

        bankRoutingNoTextField.setEditable(false);

        bankAccountNumber.setText("Bank Account Number");

        bankAccNoTextField.setEditable(false);
        bankAccNoTextField.setRequestFocusEnabled(false);

        accountBalance.setText("Account Balance");

        accBalanceTextField.setEditable(false);

        accountType.setText("Account Type");

        accTypetextField.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(bankNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(accountBalance)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(accBalanceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(accountType)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(accTypetextField, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bankRoutingNumber)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bankRoutingNoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bankAccountNumber)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bankAccNoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(204, 204, 204))
            .addGroup(layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(checkingAccInfo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(bankName)
                    .addContainerGap(521, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(checkingAccInfo)
                .addGap(18, 18, 18)
                .addComponent(bankNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(bankRoutingNumber))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(bankRoutingNoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bankAccNoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bankAccountNumber))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(accBalanceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(accountBalance))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(accTypetextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(accountType))
                .addContainerGap(218, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(79, 79, 79)
                    .addComponent(bankName)
                    .addContainerGap(367, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents


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
    // End of variables declaration//GEN-END:variables
}

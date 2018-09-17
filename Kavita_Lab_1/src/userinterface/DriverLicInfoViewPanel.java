/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Kavita
 */
public class DriverLicInfoViewPanel extends javax.swing.JPanel {
    private Object driverLicenseInfo;

    /**
     * Creates new form DriverLicInfoViewPanel
     */
    public DriverLicInfoViewPanel() {
        initComponents();
    }
    
     public void displayDriverLicenseInfo(){
        String licenseNo = DriverLicInfoCreatePanel.driverLicenseInfoObject.getLicenseNo();
        String issued = DriverLicInfoCreatePanel.driverLicenseInfoObject.getIssued();
        String expires = DriverLicInfoCreatePanel.driverLicenseInfoObject.getExpires();
        String bloodType = DriverLicInfoCreatePanel.driverLicenseInfoObject.getBloodType();
        
        
        licenseNoTextField.setText(licenseNo);
        issuedTextField.setText(issued);
        expiresTextField.setText(expires);
        bloodTypeTextField.setText(bloodType);
        
        ImageIcon MyImage = new ImageIcon(DriverLicInfoCreatePanel.driverLicenseInfoObject.getPicture());
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(50, 74, Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        pictureData.setIcon(image);//setText(driverLicenseInfo.getPicture());
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        driverLicInfo = new javax.swing.JLabel();
        licenseNumber = new javax.swing.JLabel();
        licenseNoTextField = new javax.swing.JTextField();
        issued = new javax.swing.JLabel();
        issuedTextField = new javax.swing.JTextField();
        expires = new javax.swing.JLabel();
        expiresTextField = new javax.swing.JTextField();
        bloodType = new javax.swing.JLabel();
        bloodTypeTextField = new javax.swing.JTextField();
        picture = new javax.swing.JLabel();
        pictureData = new javax.swing.JLabel();

        driverLicInfo.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        driverLicInfo.setText("Driver's License");

        licenseNumber.setText("License Number");

        licenseNoTextField.setEditable(false);

        issued.setText("Issued");

        issuedTextField.setEditable(false);

        expires.setText("Expires");

        expiresTextField.setEditable(false);

        bloodType.setText("Blood Type");

        bloodTypeTextField.setEditable(false);

        picture.setText("Picture");

        pictureData.setText("View");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(picture)
                .addGap(143, 143, 143)
                .addComponent(pictureData, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(195, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(3, 3, 3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(101, 101, 101)
                            .addComponent(driverLicInfo)
                            .addGap(136, 136, 136))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(issued)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(issuedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(licenseNumber)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                                    .addComponent(licenseNoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(expires)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(expiresTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(bloodType)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bloodTypeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(4, 4, 4)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(227, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pictureData, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(picture))
                .addGap(104, 104, 104))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(47, 47, 47)
                    .addComponent(driverLicInfo)
                    .addGap(30, 30, 30)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(licenseNumber)
                                                .addComponent(licenseNoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(18, 18, 18)
                                            .addComponent(issued))
                                        .addComponent(issuedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addComponent(expires))
                                .addComponent(expiresTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addComponent(bloodType))
                        .addComponent(bloodTypeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(183, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bloodType;
    private javax.swing.JTextField bloodTypeTextField;
    private javax.swing.JLabel driverLicInfo;
    private javax.swing.JLabel expires;
    private javax.swing.JTextField expiresTextField;
    private javax.swing.JLabel issued;
    private javax.swing.JTextField issuedTextField;
    private javax.swing.JTextField licenseNoTextField;
    private javax.swing.JLabel licenseNumber;
    private javax.swing.JLabel picture;
    private javax.swing.JLabel pictureData;
    // End of variables declaration//GEN-END:variables
}
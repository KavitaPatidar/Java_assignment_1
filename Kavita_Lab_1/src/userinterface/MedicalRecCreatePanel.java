/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package userinterface;

import Business.MedicalRecord;
import javax.swing.JOptionPane;

/**
 *
 * @author Kavita
 */
public class MedicalRecCreatePanel extends javax.swing.JPanel {
    
    public static MedicalRecord medicalRecordObject;

    /** Creates new form MedicalRecCreatePanel */
    public MedicalRecCreatePanel() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        medicalRec = new javax.swing.JLabel();
        medicalRecNumber = new javax.swing.JLabel();
        allergy1 = new javax.swing.JLabel();
        allergy2 = new javax.swing.JLabel();
        allergy3 = new javax.swing.JLabel();
        medicalRecNumTextField = new javax.swing.JTextField();
        allergy1TextField = new javax.swing.JTextField();
        allergy2TextField = new javax.swing.JTextField();
        allergy3TextField = new javax.swing.JTextField();
        createBtn = new javax.swing.JButton();

        medicalRec.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        medicalRec.setText("Medical Record");

        medicalRecNumber.setText("Medical Record Number");

        allergy1.setText("Allergy1");

        allergy2.setText("Allergy2");

        allergy3.setText("Allergy3");

        createBtn.setText("Create");
        createBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtnActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(165, 165, 165)
                        .add(medicalRec))
                    .add(layout.createSequentialGroup()
                        .add(55, 55, 55)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(layout.createSequentialGroup()
                                .add(allergy2)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .add(allergy2TextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 252, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                                .add(allergy1)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .add(allergy1TextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 252, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                                .add(medicalRecNumber)
                                .add(44, 44, 44)
                                .add(medicalRecNumTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 252, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                                .add(allergy3)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(createBtn)
                                    .add(allergy3TextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 252, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(47, 47, 47)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(layout.createSequentialGroup()
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                    .add(layout.createSequentialGroup()
                                        .add(medicalRec)
                                        .add(32, 32, 32)
                                        .add(medicalRecNumber))
                                    .add(medicalRecNumTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .add(18, 18, 18)
                                .add(allergy1))
                            .add(allergy1TextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(18, 18, 18)
                        .add(allergy2))
                    .add(allergy2TextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(allergy3)
                    .add(allergy3TextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(41, 41, 41)
                .add(createBtn)
                .addContainerGap(179, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed
            // TODO add your handling code here:
        String medicalRecordNumber, allergy1, allergy2, allergy3;
        medicalRecordNumber=medicalRecNumTextField.getText().toString();
        allergy1=allergy1TextField.getText().toString();
        allergy2=allergy2TextField.getText().toString();
        allergy3=allergy3TextField .getText().toString();
        
        medicalRecordObject = new MedicalRecord();
        medicalRecordObject.setMedRecNumber(medicalRecordNumber);
        medicalRecordObject.setAllergy1(allergy1);
        medicalRecordObject.setAllergy2(allergy2);
        medicalRecordObject.setAllergy3(allergy3);
        
         JOptionPane.showMessageDialog(null,"Created Sucessfully");
    }//GEN-LAST:event_createBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel allergy1;
    private javax.swing.JTextField allergy1TextField;
    private javax.swing.JLabel allergy2;
    private javax.swing.JTextField allergy2TextField;
    private javax.swing.JLabel allergy3;
    private javax.swing.JTextField allergy3TextField;
    private javax.swing.JButton createBtn;
    private javax.swing.JLabel medicalRec;
    private javax.swing.JTextField medicalRecNumTextField;
    private javax.swing.JLabel medicalRecNumber;
    // End of variables declaration//GEN-END:variables

}

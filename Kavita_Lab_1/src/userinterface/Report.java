/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface;

import Business.AddressInfo;
import Business.CheckingAccountInfo;
import Business.DriverLicenseInfo;
import Business.MedicalRecord;
import Business.SavingAccountInfo;
import business.DemographicInfo;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Kavita
 */
public class Report extends javax.swing.JPanel {

    /**
     * Creates new form Report
     */
    public Report() {
        initComponents();
        displayData();
    }

    public void displayData(){
    
        DemographicInfo demographicInfo = CreatePanel.demographicInfo;
        if(demographicInfo.getFirstName().length()==0)
             firstNameData.setText("Not Specified");
        else
            firstNameData.setText(demographicInfo.getFirstName());
        
        if(demographicInfo.getLastName().length()==0)
             lastNameData.setText("Not Specified");
        else
            lastNameData.setText(demographicInfo.getLastName());
        
        if(demographicInfo.getPhoneNumber().length()==0)
             phoneNoData.setText("Not Specified");
        else
            phoneNoData.setText(demographicInfo.getPhoneNumber());
        
        if(demographicInfo.getDateOfBirth().length()==0)
             dateOfBirthData.setText("Not Specified");
        else
            dateOfBirthData.setText(demographicInfo.getDateOfBirth());
        
        if(demographicInfo.getAge().length()==0)
             ageData.setText("Not Specified");
        else
            ageData.setText(demographicInfo.getAge());
        
        if(demographicInfo.getHeight().length()==0)
             heightData.setText("Not Specified");
        else
            heightData.setText(demographicInfo.getHeight());
        
        if(demographicInfo.getWeight().length()==0)
             weightData.setText("Not Specified");
        else
            weightData.setText(demographicInfo.getWeight());
        
        if(demographicInfo.getSocialSecurityNumber().length()==0)
             socialSecurityNoData.setText("Not Specified");
        else
            socialSecurityNoData.setText(demographicInfo.getSocialSecurityNumber());
        
        
        
        AddressInfo addressInfo = AddressCreatePanel.addressInfoObject;
        if(addressInfo.getStAddress().length()==0)
             streetAdData.setText("Not Specified");
        else
            streetAdData.setText(addressInfo.getStAddress());
        
        if(addressInfo.getCity().length()==0)
             cityData.setText("Not Specified");
        else
            cityData.setText(addressInfo.getCity());
        
        if(addressInfo.getState().length()==0)
             stateData.setText("Not Specified");
        else
            stateData.setText(addressInfo.getState());
        
        if(addressInfo.getZipCode().length()==0)
             zipCodeData.setText("Not Specified");
        else
            zipCodeData.setText(addressInfo.getZipCode());
        
        
        
        SavingAccountInfo savingAccountInfo = SavingAccCreatePanel.savingAccountInfoObject;
        if(savingAccountInfo.getBankName().length()==0)
             bankNameData.setText("Not Specified");
        else
            bankNameData.setText(savingAccountInfo.getBankName());
        
        if(savingAccountInfo.getBankRoutingNo().length()==0)
             bankRoutingNoData.setText("Not Specified");
        else
            bankRoutingNoData.setText(savingAccountInfo.getBankRoutingNo());
        
        if(savingAccountInfo.getBankAccNo().length()==0)
             accNoData.setText("Not Specified");
        else
            accNoData.setText(savingAccountInfo.getBankAccNo());
        
        if(savingAccountInfo.getAccBalance().length()==0)
             accBalanceData.setText("Not Specified");
        else
            accBalanceData.setText(savingAccountInfo.getAccBalance());
        
        if(savingAccountInfo.getAccType().length()==0)
             accTypeData.setText("Not Specified");
        else
            accTypeData.setText(savingAccountInfo.getAccType());
        
        
                
        CheckingAccountInfo checkingAccountInfo = CheckingAccCreatePanel.checkingAccountInfoObject;
        if(checkingAccountInfo.getBankName().length()==0)
             bankNameCAData.setText("Not Specified");
        else
            bankNameCAData.setText(checkingAccountInfo.getBankName());
        
        if(checkingAccountInfo.getBankRoutingNo().length()==0)
             bankRoutingNoCAData.setText("Not Specified");
        else
            bankRoutingNoCAData.setText(checkingAccountInfo.getBankRoutingNo());
        
        if(checkingAccountInfo.getBankAccNo().length()==0)
             accNoCAData.setText("Not Specified");
        else
            accNoCAData.setText(checkingAccountInfo.getBankAccNo());
        
        if(checkingAccountInfo.getAccBalance().length()==0)
             accBalanceCAData.setText("Not Specified");
        else
            bankNameCAData.setText(checkingAccountInfo.getAccBalance());
        
        if(checkingAccountInfo.getAccType().length()==0)
             accTypeCAData.setText("Not Specified");
        else
            accTypeCAData.setText(checkingAccountInfo.getAccType());
        
        
                        
        DriverLicenseInfo driverLicenseInfo = DriverLicInfoCreatePanel.driverLicenseInfoObject;
        if(driverLicenseInfo.getLicenseNo().length()==0)
             licenseNoData.setText("Not Specified");
        else
            licenseNoData.setText(driverLicenseInfo.getLicenseNo());
        
        if(driverLicenseInfo.getIssued().length()==0)
             issuedData.setText("Not Specified");
        else
            issuedData.setText(driverLicenseInfo.getIssued());
        
        if(driverLicenseInfo.getExpires().length()==0)
             expiresData.setText("Not Specified");
        else
            expiresData.setText(driverLicenseInfo.getExpires());
        
        if(driverLicenseInfo.getBloodType().length()==0)
             bloodTypeData.setText("Not Specified");
        else
            bloodTypeData.setText(driverLicenseInfo.getBloodType());
        
                        
        ImageIcon MyImage = new ImageIcon(driverLicenseInfo.getPicture());
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(50, 74, Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        pictureData.setIcon(image);//setText(driverLicenseInfo.getPicture());
        
        MedicalRecord medicalRecordInfo = MedicalRecCreatePanel.medicalRecordObject;
        if(medicalRecordInfo.getMedRecNumber().length()==0)
             medRecNoData.setText("Not Specified");
        else
            medRecNoData.setText(medicalRecordInfo.getMedRecNumber());
        
        if(medicalRecordInfo.getAllergy1().length()==0)
             allergy1Data.setText("Not Specified");
        else
            allergy1Data.setText(medicalRecordInfo.getAllergy1());
        
        if(medicalRecordInfo.getAllergy2().length()==0)
             allergy2Data.setText("Not Specified");
        else
            allergy2Data.setText(medicalRecordInfo.getAllergy2());
        
        if(medicalRecordInfo.getAllergy3().length()==0)
             allergy3Data.setText("Not Specified");
        else
            allergy3Data.setText(medicalRecordInfo.getAllergy3());
        
                      
        
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        demographicInfo = new javax.swing.JLabel();
        firstName = new javax.swing.JLabel();
        lastName = new javax.swing.JLabel();
        phoneNumber = new javax.swing.JLabel();
        dateOfBirth = new javax.swing.JLabel();
        age = new javax.swing.JLabel();
        height = new javax.swing.JLabel();
        weight = new javax.swing.JLabel();
        socialSecurityNo = new javax.swing.JLabel();
        firstNameData = new javax.swing.JLabel();
        lastNameData = new javax.swing.JLabel();
        phoneNoData = new javax.swing.JLabel();
        dateOfBirthData = new javax.swing.JLabel();
        ageData = new javax.swing.JLabel();
        heightData = new javax.swing.JLabel();
        weightData = new javax.swing.JLabel();
        socialSecurityNoData = new javax.swing.JLabel();
        address = new javax.swing.JLabel();
        streetAddress = new javax.swing.JLabel();
        city = new javax.swing.JLabel();
        state = new javax.swing.JLabel();
        zipCode = new javax.swing.JLabel();
        streetAdData = new javax.swing.JLabel();
        cityData = new javax.swing.JLabel();
        stateData = new javax.swing.JLabel();
        zipCodeData = new javax.swing.JLabel();
        savingAccount = new javax.swing.JLabel();
        bankName = new javax.swing.JLabel();
        bankRoutingNo = new javax.swing.JLabel();
        bankAccNo = new javax.swing.JLabel();
        accBalance = new javax.swing.JLabel();
        accType = new javax.swing.JLabel();
        bankNameData = new javax.swing.JLabel();
        bankRoutingNoData = new javax.swing.JLabel();
        accNoData = new javax.swing.JLabel();
        accBalanceData = new javax.swing.JLabel();
        accTypeData = new javax.swing.JLabel();
        checkingAccount = new javax.swing.JLabel();
        bankNameCA = new javax.swing.JLabel();
        bankRoutingNoCA = new javax.swing.JLabel();
        accNoCA = new javax.swing.JLabel();
        accBalanceCA = new javax.swing.JLabel();
        accTypeCA = new javax.swing.JLabel();
        bankNameCAData = new javax.swing.JLabel();
        bankRoutingNoCAData = new javax.swing.JLabel();
        accNoCAData = new javax.swing.JLabel();
        accBalanceCAData = new javax.swing.JLabel();
        accTypeCAData = new javax.swing.JLabel();
        driverLicense = new javax.swing.JLabel();
        licenseNo = new javax.swing.JLabel();
        issued = new javax.swing.JLabel();
        expires = new javax.swing.JLabel();
        bloodType = new javax.swing.JLabel();
        picture = new javax.swing.JLabel();
        licenseNoData = new javax.swing.JLabel();
        issuedData = new javax.swing.JLabel();
        expiresData = new javax.swing.JLabel();
        bloodTypeData = new javax.swing.JLabel();
        pictureData = new javax.swing.JLabel();
        medicalRecord = new javax.swing.JLabel();
        medRecNo = new javax.swing.JLabel();
        allergy1 = new javax.swing.JLabel();
        allergy2 = new javax.swing.JLabel();
        allergy3 = new javax.swing.JLabel();
        medRecNoData = new javax.swing.JLabel();
        allergy1Data = new javax.swing.JLabel();
        allergy2Data = new javax.swing.JLabel();
        allergy3Data = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(513, 850));

        jPanel1.setPreferredSize(new java.awt.Dimension(513, 1500));

        demographicInfo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        demographicInfo.setText("Demographic Info");

        firstName.setText("First Name");

        lastName.setText("Last Name");

        phoneNumber.setText("Phone Number");

        dateOfBirth.setText("Date Of  Birth");

        age.setText("Age");

        height.setText("Height");

        weight.setText("Weight");

        socialSecurityNo.setText("Social Security Number");

        firstNameData.setText("jLabel1");

        lastNameData.setText("jLabel1");

        phoneNoData.setText("jLabel1");

        dateOfBirthData.setText("jLabel1");

        ageData.setText("jLabel1");

        heightData.setText("jLabel1");

        weightData.setText("jLabel1");

        socialSecurityNoData.setText("jLabel1");

        address.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        address.setText("Address");

        streetAddress.setText("Street Address");

        city.setText("City");

        state.setText("State");

        zipCode.setText("Zip Code");

        streetAdData.setText("jLabel1");

        cityData.setText("jLabel1");

        stateData.setText("jLabel1");

        zipCodeData.setText("jLabel1");

        savingAccount.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        savingAccount.setText("Saving Account");

        bankName.setText("Bank Name");

        bankRoutingNo.setText("Bank Routing Number");

        bankAccNo.setText("Bank Account Number");

        accBalance.setText("Account Balance");

        accType.setText("Account Type");

        bankNameData.setText("jLabel2");

        bankRoutingNoData.setText("jLabel2");

        accNoData.setText("jLabel2");

        accBalanceData.setText("jLabel2");

        accTypeData.setText("jLabel2");

        checkingAccount.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        checkingAccount.setText("Checking Account");

        bankNameCA.setText("Bank Name");

        bankRoutingNoCA.setText("Bank Routing Number");

        accNoCA.setText("Bank Account Number");

        accBalanceCA.setText("Account Balance");

        accTypeCA.setText("Account Type");

        bankNameCAData.setText("jLabel2");

        bankRoutingNoCAData.setText("jLabel2");

        accNoCAData.setText("jLabel2");

        accBalanceCAData.setText("jLabel2");

        accTypeCAData.setText("jLabel2");

        driverLicense.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        driverLicense.setText("Driver's License");

        licenseNo.setText("License Number");

        issued.setText("Issued");

        expires.setText("Expires");

        bloodType.setText("Blood Type");

        picture.setText("Picture");

        licenseNoData.setText("jLabel2");

        issuedData.setText("jLabel2");

        expiresData.setText("jLabel2");

        bloodTypeData.setText("jLabel2");

        pictureData.setText("view");
        pictureData.setPreferredSize(new java.awt.Dimension(50, 70));

        medicalRecord.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        medicalRecord.setText("Medical Record");

        medRecNo.setText("Medical Record Number");

        allergy1.setText("Allergy1");

        allergy2.setText("Allergy2");

        allergy3.setText("Allergy3");

        medRecNoData.setText("jLabel2");

        allergy1Data.setText("jLabel2");

        allergy2Data.setText("jLabel2");

        allergy3Data.setText("jLabel2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(accType)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(accTypeData))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(zipCode)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(zipCodeData))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(state)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(stateData))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(city)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cityData))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(streetAddress)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(streetAdData))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(firstName)
                                        .addComponent(lastName)
                                        .addComponent(phoneNumber)
                                        .addComponent(dateOfBirth)
                                        .addComponent(age)
                                        .addComponent(height)
                                        .addComponent(weight)
                                        .addComponent(socialSecurityNo))
                                    .addGap(40, 40, 40)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(socialSecurityNoData)
                                        .addComponent(weightData)
                                        .addComponent(heightData)
                                        .addComponent(ageData)
                                        .addComponent(dateOfBirthData)
                                        .addComponent(phoneNoData)
                                        .addComponent(lastNameData)
                                        .addComponent(firstNameData)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(accBalance)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(accBalanceData))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(bankAccNo)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(accNoData))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(bankRoutingNo)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bankRoutingNoData))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(bankName)
                                    .addGap(96, 96, 96)
                                    .addComponent(bankNameData)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(accTypeCA)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(accTypeCAData))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(accBalanceCA)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(accBalanceCAData))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(accNoCA)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(accNoCAData))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(bankRoutingNoCA)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bankRoutingNoCAData))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(bankNameCA)
                                    .addGap(95, 95, 95)
                                    .addComponent(bankNameCAData)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(bloodType)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bloodTypeData))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(expires)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(expiresData))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(issued)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(issuedData))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(licenseNo)
                                    .addGap(72, 72, 72)
                                    .addComponent(licenseNoData)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(allergy3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(allergy3Data))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(allergy2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(allergy2Data))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(allergy1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(allergy1Data))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(medRecNo)
                                    .addGap(36, 36, 36)
                                    .addComponent(medRecNoData)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(picture)
                                .addGap(114, 114, 114)
                                .addComponent(pictureData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(demographicInfo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(address))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(savingAccount))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(checkingAccount))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(driverLicense))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(medicalRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(326, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(demographicInfo)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstName)
                    .addComponent(firstNameData))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastName)
                    .addComponent(lastNameData))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneNumber)
                    .addComponent(phoneNoData))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateOfBirth)
                    .addComponent(dateOfBirthData))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(age)
                    .addComponent(ageData))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(height)
                    .addComponent(heightData))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(weight)
                    .addComponent(weightData))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(socialSecurityNo)
                    .addComponent(socialSecurityNoData))
                .addGap(45, 45, 45)
                .addComponent(address)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(streetAddress)
                    .addComponent(streetAdData))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(city)
                    .addComponent(cityData))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(state)
                    .addComponent(stateData))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(zipCode)
                    .addComponent(zipCodeData))
                .addGap(44, 44, 44)
                .addComponent(savingAccount)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bankName)
                    .addComponent(bankNameData))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bankRoutingNo)
                    .addComponent(bankRoutingNoData))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bankAccNo)
                    .addComponent(accNoData))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(accBalance)
                    .addComponent(accBalanceData))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(accType)
                    .addComponent(accTypeData))
                .addGap(47, 47, 47)
                .addComponent(checkingAccount)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bankNameCA)
                    .addComponent(bankNameCAData, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bankRoutingNoCA)
                    .addComponent(bankRoutingNoCAData))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(accNoCA)
                    .addComponent(accNoCAData))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(accBalanceCA)
                    .addComponent(accBalanceCAData))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(accTypeCA)
                    .addComponent(accTypeCAData))
                .addGap(45, 45, 45)
                .addComponent(driverLicense)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(licenseNo)
                    .addComponent(licenseNoData))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(issued)
                    .addComponent(issuedData))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(expires)
                    .addComponent(expiresData))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bloodType)
                    .addComponent(bloodTypeData))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(picture)
                    .addComponent(pictureData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(medicalRecord)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(medRecNo)
                    .addComponent(medRecNoData))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(allergy1)
                    .addComponent(allergy1Data))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(allergy2)
                    .addComponent(allergy2Data))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(allergy3)
                    .addComponent(allergy3Data))
                .addContainerGap(223, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 648, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 827, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(509, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accBalance;
    private javax.swing.JLabel accBalanceCA;
    private javax.swing.JLabel accBalanceCAData;
    private javax.swing.JLabel accBalanceData;
    private javax.swing.JLabel accNoCA;
    private javax.swing.JLabel accNoCAData;
    private javax.swing.JLabel accNoData;
    private javax.swing.JLabel accType;
    private javax.swing.JLabel accTypeCA;
    private javax.swing.JLabel accTypeCAData;
    private javax.swing.JLabel accTypeData;
    private javax.swing.JLabel address;
    private javax.swing.JLabel age;
    private javax.swing.JLabel ageData;
    private javax.swing.JLabel allergy1;
    private javax.swing.JLabel allergy1Data;
    private javax.swing.JLabel allergy2;
    private javax.swing.JLabel allergy2Data;
    private javax.swing.JLabel allergy3;
    private javax.swing.JLabel allergy3Data;
    private javax.swing.JLabel bankAccNo;
    private javax.swing.JLabel bankName;
    private javax.swing.JLabel bankNameCA;
    private javax.swing.JLabel bankNameCAData;
    private javax.swing.JLabel bankNameData;
    private javax.swing.JLabel bankRoutingNo;
    private javax.swing.JLabel bankRoutingNoCA;
    private javax.swing.JLabel bankRoutingNoCAData;
    private javax.swing.JLabel bankRoutingNoData;
    private javax.swing.JLabel bloodType;
    private javax.swing.JLabel bloodTypeData;
    private javax.swing.JLabel checkingAccount;
    private javax.swing.JLabel city;
    private javax.swing.JLabel cityData;
    private javax.swing.JLabel dateOfBirth;
    private javax.swing.JLabel dateOfBirthData;
    private javax.swing.JLabel demographicInfo;
    private javax.swing.JLabel driverLicense;
    private javax.swing.JLabel expires;
    private javax.swing.JLabel expiresData;
    private javax.swing.JLabel firstName;
    private javax.swing.JLabel firstNameData;
    private javax.swing.JLabel height;
    private javax.swing.JLabel heightData;
    private javax.swing.JLabel issued;
    private javax.swing.JLabel issuedData;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lastName;
    private javax.swing.JLabel lastNameData;
    private javax.swing.JLabel licenseNo;
    private javax.swing.JLabel licenseNoData;
    private javax.swing.JLabel medRecNo;
    private javax.swing.JLabel medRecNoData;
    private javax.swing.JLabel medicalRecord;
    private javax.swing.JLabel phoneNoData;
    private javax.swing.JLabel phoneNumber;
    private javax.swing.JLabel picture;
    private javax.swing.JLabel pictureData;
    private javax.swing.JLabel savingAccount;
    private javax.swing.JLabel socialSecurityNo;
    private javax.swing.JLabel socialSecurityNoData;
    private javax.swing.JLabel state;
    private javax.swing.JLabel stateData;
    private javax.swing.JLabel streetAdData;
    private javax.swing.JLabel streetAddress;
    private javax.swing.JLabel weight;
    private javax.swing.JLabel weightData;
    private javax.swing.JLabel zipCode;
    private javax.swing.JLabel zipCodeData;
    // End of variables declaration//GEN-END:variables
}

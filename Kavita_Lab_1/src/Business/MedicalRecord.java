/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author Kavita
 */
public class MedicalRecord {
    private String medRecNumber;
    private String allergy1;
    private String allergy2;
    private String allergy3;

    public MedicalRecord() {
    }
    
     

    public MedicalRecord(String medRecNumber, String allergy1, String allergy2, String allergy3) {
        this.medRecNumber = medRecNumber;
        this.allergy1 = allergy1;
        this.allergy2 = allergy2;
        this.allergy3 = allergy3;
    }
    
    

    public String getMedRecNumber() {
        return medRecNumber;
    }

    public void setMedRecNumber(String medRecNumber) {
        this.medRecNumber = medRecNumber;
    }

    public String getAllergy1() {
        return allergy1;
    }

    public void setAllergy1(String allergy1) {
        this.allergy1 = allergy1;
    }

    public String getAllergy2() {
        return allergy2;
    }

    public void setAllergy2(String allergy2) {
        this.allergy2 = allergy2;
    }

    public String getAllergy3() {
        return allergy3;
    }

    public void setAllergy3(String allergy3) {
        this.allergy3 = allergy3;
    }
    
    
    
}

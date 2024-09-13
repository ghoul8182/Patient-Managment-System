package project_sign_in;
import java.io.Serializable;
import java.util.ArrayList;
public class Prescription implements Serializable {
    int prescriptionID,patientID;
    private static int idprescription=0;
    String date,drugName,drugType,drugDuration,drugAdvice;
    public Prescription(int patientID, String date, String drugName, String drugType, String drugDuration, String drugAdvice) {
        this.prescriptionID = idprescription+1;
        this.patientID = patientID;
        this.date = date;
        this.drugName = drugName;
        this.drugType = drugType;
        this.drugDuration = drugDuration;
        this.drugAdvice = drugAdvice;
        idprescription=idprescription+1;
    }

    public int getPrescriptionID() {
        return prescriptionID;
    }

    public void setPrescriptionID(int prescriptionID) {
        this.prescriptionID = prescriptionID;
    }

    public static int getIdprescription() {
        return idprescription;
    }

    public static void setIdprescription(int idprescription) {
        Prescription.idprescription = idprescription;
    }
    
    @Override
    public String toString() {
        return "Prescription{" +
                "prescriptionID=" + prescriptionID +
                ", patientID=" + patientID +
                ", date='" + date + '\'' +
                ", drugName='" + drugName + '\'' +
                ", drugType='" + drugType + '\'' +
                ", drugDuration='" + drugDuration + '\'' +
                ", drugAdvice='" + drugAdvice + '\'' +
                '}';
    }
    String getDate() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    String getMedication() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    String getDosage() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int getPatientID() {
        return patientID;
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public String getDrugType() {
        return drugType;
    }

    public void setDrugType(String drugType) {
        this.drugType = drugType;
    }

    public String getDrugDuration() {
        return drugDuration;
    }

    public void setDrugDuration(String drugDuration) {
        this.drugDuration = drugDuration;
    }

    public String getDrugAdvice() {
        return drugAdvice;
    }

    public void setDrugAdvice(String drugAdvice) {
        this.drugAdvice = drugAdvice;
    }
    
}
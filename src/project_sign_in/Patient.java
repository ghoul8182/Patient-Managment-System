package project_sign_in;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

public class Patient implements Serializable {

    public String name,phoneNb,address,doctor,medicalCond;
    public int ID;
    public static int counter = 0;
    public LocalDate DOB;
    public int sex;
    public Date appointment;
    public ArrayList<Prescription> prescriptionList;
    public Patient(String name, String phoneNb, String address, String doctor, String medicalCond, int sex, Date appointment,int ID) {
        this.name = name;
        this.phoneNb = phoneNb;
        this.address = address;
        this.doctor = doctor;
        this.medicalCond = medicalCond;
        this.ID = (counter+1);
        this.DOB = LocalDate.now();
        this.sex = sex;
        this.appointment = appointment;
        this.prescriptionList = new ArrayList<Prescription>();
        counter++;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNb() {
        return phoneNb;
    }

    public void setPhoneNb(String phoneNb) {
        this.phoneNb = phoneNb;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public String getMedicalCond() {
        return medicalCond;
    }

    public void setMedicalCond(String medicalCond) {
        this.medicalCond = medicalCond;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Patient.counter = counter;
    }

    public LocalDate getDOB() {
        return DOB;
    }

    public void setDOB(LocalDate DOB) {
        this.DOB = DOB;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public Date getAppointment() {
        return appointment;
    }

    public void setAppointment(Date appointment) {
        this.appointment = appointment;
    }

    public ArrayList<Prescription> getPrescriptionList() {
        return prescriptionList;
    }

    public void setPrescriptionList(ArrayList<Prescription> prescriptionList) {
        this.prescriptionList = prescriptionList;
    }


    @Override
    public String toString() {
        String prescriptions = "";
        for(int i = 0;i<prescriptionList.size();i++){
            prescriptions += prescriptionList.get(i).toString();
        }
        return "Patient{" +
                "name='" + name + '\'' +
                ", phoneNb='" + phoneNb + '\'' +
                ", address='" + address + '\'' +
                ", doctor='" + doctor + '\'' +
                ", medicalCond='" + medicalCond + '\'' +
                ", ID=" + ID +
                ", DOB=" + DOB +
                ", sex=" + sex +
                ", appointment=" + appointment +
                ", prescriptionList=" + prescriptions +
                '}';
    }

}

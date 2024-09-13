
package project_sign_in;



import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;

public class Clinic implements Serializable{

    public String getClinicName() {
        return clinicName;
    }
    String clinicName;
    int maxPatient;
    ArrayList<Patient> p;
    ArrayList<doctor> d;

    public int getMaxPatient() {
        return maxPatient;
    }

    public void setMaxPatient(int maxPatient) {
        this.maxPatient = maxPatient;
    }

    public ArrayList<Patient> getP() {
        return p;
    }

    public void setP(ArrayList<Patient> p) {
        this.p = p;
    }

    public ArrayList<doctor> getD() {
        return d;
    }

    public void setD(ArrayList<doctor> d) {
        this.d = d;
    }
    
    public Clinic(String clinicName, int maxPatient,ArrayList<doctor> d,ArrayList<Patient> p) {
        this.clinicName = clinicName;
        this.maxPatient = maxPatient;
        this.p = p;

        this.d=d;
    }


}
    


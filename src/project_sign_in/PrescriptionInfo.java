package project_sign_in;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class PrescriptionInfo extends JFrame {

    private ArrayList<Clinic> clinics;
    private int prescriptionID;

    public PrescriptionInfo(ArrayList<Clinic> clinics, int prescriptionID) {
        this.clinics = clinics;
        this.prescriptionID = prescriptionID;

        initComponents();
        displayPrescriptionInfo();
    }

    private void initComponents() {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle("Prescription Information");

        JTextArea prescriptionTextArea = new JTextArea();
        prescriptionTextArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(prescriptionTextArea);

        getContentPane().add(scrollPane);

        // Set preferred size of the JFrame
        setPreferredSize(new Dimension(400, 300));

        pack();
        setLocationRelativeTo(null);
    }

    private void displayPrescriptionInfo() {
        for (Clinic clinic : clinics) {
            for (Patient patient : clinic.getP()) {
                for (Prescription prescription : patient.getPrescriptionList()) {
                    if (prescription.getPrescriptionID() == prescriptionID) {
                        JTextArea prescriptionTextArea = (JTextArea) ((JScrollPane) getContentPane().getComponents()[0]).getViewport().getView();
                        prescriptionTextArea.setText("Prescription ID: " + prescription.getPrescriptionID() + "\n"
                                + "DrugName: " + prescription.getDrugName() + "\n"
                                + "DrugAdvise:" + prescription.getDrugAdvice() + "\n"
                                + "Drugtype:" + prescription.getDrugType() + "\n"
                                + "Date:" + prescription.getDrugDuration() + "\n"
                                + "patient ID:"+prescription.getPatientID()+"\n"
                                +"DrugDuration: "+prescription.getDrugDuration()+"\n"
                        );
                        return;
                    }
                }
            }
        }
        JOptionPane.showMessageDialog(this, "Prescription not found", "ERROR", JOptionPane.ERROR_MESSAGE);
        dispose(); 
    }

  
}


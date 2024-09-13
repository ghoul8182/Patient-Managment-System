
package project_sign_in;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class ShowPatientsFrame extends JFrame {

    private JTextArea textArea;

    public ShowPatientsFrame(inside_clinic parentFrame) {
        initComponents(parentFrame);
    }

    private void initComponents(inside_clinic parentFrame) {
        textArea = new JTextArea();
        textArea.setEditable(false);

        for (Patient patient : parentFrame.getPatients(parentFrame.getselectedclinic())) {
            textArea.append("Name: " + patient.getName() + "\n");
             textArea.append("id: " + patient.getID()+ "\n");
            textArea.append("Phone: " + patient.getPhoneNb() + "\n");
            textArea.append("Address: " + patient.getAddress() + "\n");
            textArea.append("Medical Condition: " + patient.getMedicalCond() + "\n");
            textArea.append("Gender: " + patient.getSex() + " " + "\n");
            textArea.append("Doctor: " + patient.getDoctor() + "\n");
            textArea.append("Appointment Date: " + patient.getAppointment() + "\n\n");
        }

        getContentPane().add(textArea);

        setTitle("Patient Information");
        setSize(400, 300);
        setLocationRelativeTo(parentFrame);
    }
}
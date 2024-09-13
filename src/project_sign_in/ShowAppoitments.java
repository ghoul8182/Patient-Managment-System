
package project_sign_in;

import javax.swing.JFrame;
import javax.swing.JTextArea;



    

public class ShowAppoitments extends JFrame {

    private JTextArea textArea;

    public ShowAppoitments(inside_clinic parentFrame) {
        initComponents(parentFrame);
    }

    private void initComponents(inside_clinic parentFrame) {
        textArea = new JTextArea();
        textArea.setEditable(false);

        for (Patient patient : parentFrame.getPatients(parentFrame.getselectedclinic())) {
            textArea.append("Name: " + patient.getName() + "\n");
            textArea.append("ID: "+patient.getID()+"\n");
            textArea.append("Appointment Date: " + patient.getAppointment() + "\n\n");
        }

        getContentPane().add(textArea);

        setTitle("Patient Information");
        setSize(400, 300);
        setLocationRelativeTo(parentFrame);
    }
}
    


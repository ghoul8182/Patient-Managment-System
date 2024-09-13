
package project_sign_in;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.util.ArrayList;

public class ShowMedicalHistoryFrame extends JFrame {

    private JTextArea textArea;

    public ShowMedicalHistoryFrame(Patient patient) {
        initComponents(patient);
    }

    private void initComponents(Patient patient) {
        textArea = new JTextArea();
        textArea.setEditable(false);

        textArea.append("Name: " + patient.getName() + "\n");
        textArea.append("Phone: " + patient.getPhoneNb() + "\n");
        textArea.append("Address: " + patient.getAddress() + "\n");
        textArea.append("Doctor: " + patient.getDoctor() + "\n");
        textArea.append("Medical Condition: " + patient.getMedicalCond() + "\n\n");


        textArea.append("Medical History:no medical hoistory for this patient\n");

        getContentPane().add(textArea);

        setTitle("Medical History");
        setSize(400, 300);
        setLocationRelativeTo(null);
    }
}
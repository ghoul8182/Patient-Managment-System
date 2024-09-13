package project_sign_in;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RemovePatient extends javax.swing.JFrame {
    private inside_clinic in;
    private JTextField patientNameField;

    public RemovePatient(inside_clinic in) {
        this.in = in;
        initComponents();
    }

    private void initComponents() {
        patientNameField = new JTextField();
        JButton removeButton = new JButton();
        JButton backButton = new JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        patientNameField.setToolTipText("Enter patient's name");

        removeButton.setText("Remove");
        removeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });

        backButton.setText("Back");
        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(patientNameField)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(removeButton)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE)
                                                .addComponent(backButton)))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(patientNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(removeButton)
                                        .addComponent(backButton))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }

    private void removeButtonActionPerformed(ActionEvent evt) {
String patientName = patientNameField.getText().trim();
    if (!patientName.isEmpty()) {
        Patient patientToRemove = findPatientByName(patientName);
        if (patientToRemove != null) {
            in.removepatient(patientToRemove);
            JOptionPane.showMessageDialog(this, "Patient removed successfully.");
            this.setVisible(false);  
            in.displayPatients();
        } else {
            JOptionPane.showMessageDialog(this, "Patient not found.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } else {
        JOptionPane.showMessageDialog(this, "Please enter the patient's name.", "Error", JOptionPane.ERROR_MESSAGE);
    }
}

    private void backButtonActionPerformed(ActionEvent evt) {
        this.setVisible(false);
    }

    private Patient findPatientByName(String name) {
        for (Patient patient : in.getPatients()) {
            if (patient.getName().equalsIgnoreCase(name)) {
                return patient;
            }
        }
        return null;
    }
}


package project_sign_in;

import java.awt.Container;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class inside_clinic extends javax.swing.JFrame {

    private Clinics cs;
    private String s;
    private JTextArea textArea;

    ArrayList<doctor> a = new ArrayList<>();
    ArrayList<Patient> b = new ArrayList<>();

    public inside_clinic(Clinics cs, String s) {
        initComponents();

        Container contentPane = getContentPane();
        JScrollPane jScrollPane = new JScrollPane();

        textArea = new JTextArea();
        jScrollPane.setViewportView(textArea);
        this.cs = cs;

        this.s = s;
        loaddoctors();
        loadpatients();
        jTextField_numberofpatient.setText(maxpatient()+"");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jComboBox_doctorss = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jButton_adddoctor = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton_addpatient = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jComboBox_patient = new javax.swing.JComboBox<>();
        jButton_ok = new javax.swing.JButton();
        jButton_removepatient1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton_movepatient = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField_numberofpatient = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Clinic");
        setBackground(new java.awt.Color(0, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox_doctorss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_doctorssActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox_doctorss, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 29, 184, -1));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("doctors");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 32, 70, -1));

        jButton_adddoctor.setText("add doctor");
        jButton_adddoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_adddoctorActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_adddoctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(312, 113, 119, -1));

        jButton1.setText("cancel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));

        jButton_addpatient.setText("Add Patient");
        jButton_addpatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_addpatientActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_addpatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 113, 158, -1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("patients");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 63, 66, 22));

        jComboBox_patient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_patientActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox_patient, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 63, 184, -1));

        jButton_ok.setText("ok");
        jButton_ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_okActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_ok, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 330, -1, -1));

        jButton_removepatient1.setText("remove Patient");
        jButton_removepatient1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_removepatient1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_removepatient1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 113, 142, -1));

        jButton3.setText("Add prescription");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 154, 142, -1));

        jButton_movepatient.setText("move patient");
        jButton_movepatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_movepatientActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_movepatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(312, 154, 119, -1));

        jButton5.setText("delete doctor");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 154, 152, -1));

        jButton4.setText("show doctors");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, 137, -1));

        jButton6.setText("Show patient");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 136, -1));

        jButton7.setText("Patient History");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 249, 121, -1));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("max patient");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 203, 80, -1));

        jTextField_numberofpatient.setEditable(false);
        getContentPane().add(jTextField_numberofpatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 200, 101, -1));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jButton8.setText("Show apoitments");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_sign_in/MyHome+Clinic2.png"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 370));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public JComboBox<String> getjComboBox1() {
        return jComboBox_patient;
    }

    public void setjComboBox1(JComboBox<String> jComboBox1) {
        this.jComboBox_patient = jComboBox1;
    }

    private void loaddoctors() {
        for (int i = 0; i < cs.getclinicnames().size(); i++) {
            if (s.equals(cs.getclinicnames().get(i).getClinicName())) {
                a = cs.getclinicnames().get(i).getD();
            }
            if (!a.isEmpty()) {
                for (int j = 0; j < a.size(); j++) {
                    jComboBox_doctorss.addItem(a.get(j).getName());
                }
                return;
            }
        }
    }

    private void loadpatients() {
        for (int i = 0; i < cs.getclinicnames().size(); i++) {
            if (s.equals(cs.getclinicnames().get(i).getClinicName())) {
                b = cs.getclinicnames().get(i).getP();
            }
            if (!b.isEmpty()) {
                for (int j = 0; j < b.size(); j++) {
                    jComboBox_patient.addItem(b.get(j).getName());
                }
                return;
            }
        }
    }

    void adddoctorincs(doctor a) {
        String s = cs.selectediteminJcombobox();
        for (int i = 0; i < cs.getclinicnames().size(); i++) {
            if (s.equals(cs.getclinicnames().get(i).getClinicName())) {
                cs.getclinicnames().get(i).getD().add(a);
            }
        }
    }

    void addpatient(Patient p) {
        String s = cs.selectediteminJcombobox();
        for (int i = 0; i < cs.getclinicnames().size(); i++) {
            if (s.equals(cs.getclinicnames().get(i).getClinicName())) {
                cs.getclinicnames().get(i).getP().add(p);
            }
        }

    }

    void removepatient(Patient p) {
        String s = cs.selectediteminJcombobox();
        for (int i = 0; i < cs.getclinicnames().size(); i++) {
            if (s.equals(cs.getclinicnames().get(i).getClinicName())) {
                cs.getclinicnames().get(i).getP().remove(p);
            }
        }

    }

    public void displayPatients() {
        textArea.setText("");
        Iterable<Patient> Patient = null;
        for (Patient patient : Patient) {
            textArea.append("Name: " + patient.getName() + "\n");
            textArea.append("Phone: " + patient.getPhoneNb() + "\n");
            textArea.append("Address: " + patient.getAddress() + "\n");
            textArea.append("Medical Condition: " + patient.getMedicalCond() + "\n");
            textArea.append("Gender: " + patient.getSex() + " " + "\n");
            textArea.append("Doctor: " + patient.getDoctor() + "\n");
            textArea.append("Appointment Date: " + patient.getAppointment() + "\n\n");
        }
    }

    void getpatient(Clinic a) {
        a.getP();
    }

    public String getselectedclinic() {
        return cs.getselectedclinic();
    }

    ArrayList<Clinic> getarrayofclinic() {
        return cs.getC();
    }


    private void jButton_adddoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_adddoctorActionPerformed
        add_doctor ad = new add_doctor(this);
        this.setVisible(false);
        ad.setVisible(true);
    }//GEN-LAST:event_jButton_adddoctorActionPerformed

    private void jButton_addpatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_addpatientActionPerformed
        String[] d = new String[jComboBox_doctorss.getItemCount()];
        for (int i = 0; i < jComboBox_doctorss.getItemCount(); i++) {
            d[i] = jComboBox_doctorss.getItemAt(i);
        }
        addpatient ap = new addpatient(this, d);
        this.setVisible(false);
        ap.setVisible(true);
    }//GEN-LAST:event_jButton_addpatientActionPerformed
    void add_doctor_in_jComboBox_doctorssActionPerformed(String s) {
        jComboBox_doctorss.addItem(s);
    }

    void add_patient_in_jcombobox(String p) {
        jComboBox_patient.addItem(p);
    }
    private void jComboBox_doctorssActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_doctorssActionPerformed

    }//GEN-LAST:event_jComboBox_doctorssActionPerformed

    private void jButton_okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_okActionPerformed
        this.setVisible(false);
        cs.setVisible(true);
    }//GEN-LAST:event_jButton_okActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        cs.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox_patientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_patientActionPerformed

    }//GEN-LAST:event_jComboBox_patientActionPerformed
    String getselectedpatient() {
        return (String) jComboBox_patient.getSelectedItem();
    }
    ArrayList<Clinic> getallclinics(){
        return cs.getC();
    }
    private void jButton_removepatient1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_removepatient1ActionPerformed
if(jComboBox_patient.getSelectedItem()==null){
    JOptionPane.showMessageDialog(this, "please choose patient to remove", "ERROR", JOptionPane.ERROR_MESSAGE);
}
else{
        String s = (String) jComboBox_patient.getSelectedItem();
        jComboBox_patient.removeItem(s);
        String a = cs.jComboBox_Clinic_name();
        cs.removepatientfromclinic(s, a);
}
    }//GEN-LAST:event_jButton_removepatient1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
if(jComboBox_patient.getSelectedItem()==null){
    JOptionPane.showMessageDialog(this, "please choose patient to add her prescription", "ERROR", JOptionPane.ERROR_MESSAGE);
}
else{
        prescription_frame pf = new prescription_frame(this);
        this.setVisible(false);
        pf.setVisible(true);
}
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
if(jComboBox_doctorss.getSelectedItem()==null){
    JOptionPane.showMessageDialog(this, "please choose doctor to remove", "ERROR", JOptionPane.ERROR_MESSAGE);
}
else{
        String s = (String) jComboBox_doctorss.getSelectedItem();
        String clinicname = cs.getselectedclinic();
        for (int i = 0; i < cs.getclinicnames().size(); i++) {
            if (clinicname.equals(cs.getC().get(i).getClinicName())) {
                for (int j = 0; j < cs.getclinicnames().get(i).getD().size(); j++) {
                    if (s.equals(cs.getC().get(i).getD().get(j).getName())) {
                        cs.getC().get(i).getD().remove(j);
                    }
                }
            }
        }
        jComboBox_doctorss.removeItem(s);
}
    }//GEN-LAST:event_jButton5ActionPerformed
void removepatientfromcombobox(String a){
    jComboBox_patient.removeItem(a);
}
    private void jButton_movepatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_movepatientActionPerformed
if(jComboBox_patient.getSelectedItem()==null){
    JOptionPane.showMessageDialog(this, "please choose patient to move", "ERROR", JOptionPane.ERROR_MESSAGE);
}
else{
        movepatientframe a = new movepatientframe(this);
        a.setVisible(true);
        this.setVisible(false);
}
    }//GEN-LAST:event_jButton_movepatientActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String[] doctors = new String[jComboBox_doctorss.getItemCount()];
        for (int i = 0; i < jComboBox_doctorss.getItemCount(); i++) {
            doctors[i] = jComboBox_doctorss.getItemAt(i);
        }

        DefaultListModel<String> doctorListModel = new DefaultListModel<>();
        for (String doctor : doctors) {
            doctorListModel.addElement(doctor);
        }

        ShowDoctorsFrame showDoctorsFrame = new ShowDoctorsFrame(doctorListModel);
        showDoctorsFrame.setVisible(true);


    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
 ShowPatientsFrame showPatientsFrame = new ShowPatientsFrame(this);
    showPatientsFrame.setVisible(true);

    }//GEN-LAST:event_jButton6ActionPerformed
private int maxpatient(){
    String clinicname=getselectedclinic();
    for (int i = 0; i < cs.getclinicnames().size(); i++) {
            if (clinicname.equals(cs.getC().get(i).getClinicName())) {
                return cs.getC().get(i).getMaxPatient();
            }
        }
    return 0;
}
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
String selectedPatientName = getselectedpatient();
    for (Patient patient : getPatients(getselectedclinic())) {
        if (patient.getName().equals(selectedPatientName)) {
            ShowMedicalHistoryFrame medicalHistoryFrame = new ShowMedicalHistoryFrame(patient);
            medicalHistoryFrame.setVisible(true);
            break; 
        }
    }


    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
ShowAppoitments showPatientsFrame = new ShowAppoitments(this);
    showPatientsFrame.setVisible(true);
      
    }//GEN-LAST:event_jButton8ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton_adddoctor;
    private javax.swing.JButton jButton_addpatient;
    private javax.swing.JButton jButton_movepatient;
    private javax.swing.JButton jButton_ok;
    private javax.swing.JButton jButton_removepatient1;
    private javax.swing.JComboBox<String> jComboBox_doctorss;
    private javax.swing.JComboBox<String> jComboBox_patient;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField_numberofpatient;
    // End of variables declaration//GEN-END:variables

   

    
    public ArrayList<Patient> getPatients(String clinicname) {
        for (int i = 0; i < cs.getclinicnames().size(); i++) {
            if (clinicname.equals(cs.getclinicnames().get(i).getClinicName())) {
                return cs.getclinicnames().get(i).getP();
            }
        }
        return new ArrayList<>();
    }

    Iterable<Patient> getPatients() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    

}

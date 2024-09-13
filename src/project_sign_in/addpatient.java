
package project_sign_in;

import java.util.ArrayList;
import java.util.Date;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class addpatient extends javax.swing.JFrame {
ArrayList<Patient> p=new ArrayList<>();
inside_clinic in;
    public addpatient(inside_clinic in,String[] d) {
        initComponents();
        this.p=p;
        this.in=in;
        load_doctors_incombobox(d);
    }
  void load_doctors_incombobox(String[]d){
      for(int i=0;i<d.length;i++)
      jComboBox_doctors.addItem(d[i]);
  }

    public ArrayList<Patient> getP() {
        return p;
    }

    public void setP(ArrayList<Patient> p) {
        this.p = p;
    }

    public ButtonGroup getButtonGroup1() {
        return buttonGroup1;
    }

    public void setButtonGroup1(ButtonGroup buttonGroup1) {
        this.buttonGroup1 = buttonGroup1;
    }

    public JComboBox<String> getjComboBox_day() {
        return jComboBox_day;
    }

    public void setjComboBox_day(JComboBox<String> jComboBox_day) {
        this.jComboBox_day = jComboBox_day;
    }

    public JComboBox<String> getjComboBox_doctors() {
        return jComboBox_doctors;
    }

    public void setjComboBox_doctors(JComboBox<String> jComboBox_doctors) {
        this.jComboBox_doctors = jComboBox_doctors;
    }

    public JComboBox<String> getjComboBox_hour() {
        return jComboBox_hour;
    }

    public void setjComboBox_hour(JComboBox<String> jComboBox_hour) {
        this.jComboBox_hour = jComboBox_hour;
    }

    public JComboBox<String> getjComboBox_min() {
        return jComboBox_min;
    }

    public void setjComboBox_min(JComboBox<String> jComboBox_min) {
        this.jComboBox_min = jComboBox_min;
    }

    public JComboBox<String> getjComboBox_month() {
        return jComboBox_month;
    }

    public void setjComboBox_month(JComboBox<String> jComboBox_month) {
        this.jComboBox_month = jComboBox_month;
    }

    public JComboBox<String> getjComboBox_year() {
        return jComboBox_year;
    }

    public void setjComboBox_year(JComboBox<String> jComboBox_year) {
        this.jComboBox_year = jComboBox_year;
    }

    public JRadioButton getjRadioButton1() {
        return jRadioButton1;
    }

    public void setjRadioButton1(JRadioButton jRadioButton1) {
        this.jRadioButton1 = jRadioButton1;
    }

    public JRadioButton getjRadioButton2() {
        return jRadioButton2;
    }

    public void setjRadioButton2(JRadioButton jRadioButton2) {
        this.jRadioButton2 = jRadioButton2;
    }

    public JTextField getjTextField_address() {
        return jTextField_address;
    }

    public void setjTextField_address(JTextField jTextField_address) {
        this.jTextField_address = jTextField_address;
    }

    public JTextField getjTextField_medicalcondition() {
        return jTextField_medicalcondition;
    }

    public void setjTextField_medicalcondition(JTextField jTextField_medicalcondition) {
        this.jTextField_medicalcondition = jTextField_medicalcondition;
    }

    public JTextField getjTextField_name() {
        return jTextField_name;
    }

    public void setjTextField_name(JTextField jTextField_name) {
        this.jTextField_name = jTextField_name;
    }

    public JTextField getjTextField_phone() {
        return jTextField_phone;
    }

    public void setjTextField_phone(JTextField jTextField_phone) {
        this.jTextField_phone = jTextField_phone;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jCheckBox1 = new javax.swing.JCheckBox();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField_name = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField_phone = new javax.swing.JTextField();
        jTextField_address = new javax.swing.JTextField();
        jTextField_medicalcondition = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jComboBox_doctors = new javax.swing.JComboBox<>();
        jComboBox_year = new javax.swing.JComboBox<>();
        jComboBox_month = new javax.swing.JComboBox<>();
        jComboBox_day = new javax.swing.JComboBox<>();
        jComboBox_hour = new javax.swing.JComboBox<>();
        jComboBox_min = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        jCheckBox1.setText("jCheckBox1");

        jButton3.setText("jButton3");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("phone number");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 81, 108, 25));

        jLabel2.setText("address");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 124, 108, 25));

        jLabel3.setText("gender");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 204, 108, 25));

        jLabel4.setText("name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 44, 108, 25));

        jLabel5.setText("medical condition");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 167, 108, 25));
        getContentPane().add(jTextField_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 45, 460, -1));

        jLabel6.setText("Appointment");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 290, 108, 25));

        jLabel7.setText("choose doctor");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 247, 108, 25));
        getContentPane().add(jTextField_phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 82, 460, -1));
        getContentPane().add(jTextField_address, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 125, 460, -1));
        getContentPane().add(jTextField_medicalcondition, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 168, 460, -1));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Male");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 206, 98, -1));

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Female");
        getContentPane().add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 206, 98, -1));

        getContentPane().add(jComboBox_doctors, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 248, 144, -1));

        jComboBox_year.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040", "2041", "2042", "2043", "2044", "2045", "2046", "2047", "2048", "2049", "2050" }));
        jComboBox_year.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_yearActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox_year, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 291, -1, -1));

        jComboBox_month.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        getContentPane().add(jComboBox_month, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 291, -1, -1));

        jComboBox_day.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jComboBox_day.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_dayActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox_day, new org.netbeans.lib.awtextra.AbsoluteConstraints(346, 291, -1, -1));

        jComboBox_hour.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "12", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "1", "2", "3", "4", "5", "6", "7", "8", "9 ", "10", "11" }));
        getContentPane().add(jComboBox_hour, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 291, -1, -1));

        jComboBox_min.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60" }));
        getContentPane().add(jComboBox_min, new org.netbeans.lib.awtextra.AbsoluteConstraints(514, 291, -1, -1));

        jButton1.setText("Cancel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 480, 107, -1));

        jButton2.setText("Add");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 480, 123, -1));
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_sign_in/MyHome+Clinic4.png"))); // NOI18N
        jLabel9.setText("jLabel9");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       this.dispose();
       in.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

if (jComboBox_doctors.getSelectedItem() == null) {
        JOptionPane.showMessageDialog(this, "Make sure to add a doctor before.", "ERROR", JOptionPane.ERROR_MESSAGE);
        return;
    }

    String s = in.getselectedclinic();
    int maxpatients = 0;
    int counterpatient = 0;

    for (int i = 0; i < in.getallclinics().size(); i++) {
        if (s.equals(in.getallclinics().get(i).getClinicName())) {
            maxpatients = in.getallclinics().get(i).getMaxPatient();
            for (int j = 0; j < in.getallclinics().get(i).getP().size(); j++)
                counterpatient++;
        }
    }

    if (maxpatients == counterpatient) {
        JOptionPane.showMessageDialog(this, "This clinic is full.", "ERROR", JOptionPane.ERROR_MESSAGE);
    } else {
        if (jTextField_name.getText().isEmpty() || jTextField_phone.getText().isEmpty()
                || jTextField_address.getText().isEmpty() || jTextField_medicalcondition.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please make sure to enter all information.", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            int year = Integer.parseInt((String) jComboBox_year.getSelectedItem());
            int month = Integer.parseInt((String) jComboBox_month.getSelectedItem());
            int day = Integer.parseInt((String) jComboBox_day.getSelectedItem());
            int hour = Integer.parseInt((String) jComboBox_hour.getSelectedItem());
            int minutes = Integer.parseInt((String) jComboBox_min.getSelectedItem());

            int gender;
            if (jRadioButton1.isSelected()) {
                gender = 0;
            } else {
                gender = 1;
            }

            Date appointment = new Date(year, month, day, hour, minutes);
            int id = 0;
            Patient p = new Patient(jTextField_name.getText(), jTextField_phone.getText(),
                    jTextField_address.getText(), (String) jComboBox_doctors.getSelectedItem(),
                    jTextField_medicalcondition.getText(), gender, appointment, id++);
            in.add_patient_in_jcombobox(p.getName());
            in.addpatient(p);
            System.out.println(p);
            this.setVisible(false);
            in.setVisible(true);
        }
    }


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox_dayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_dayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_dayActionPerformed

    private void jComboBox_yearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_yearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_yearActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox<String> jComboBox_day;
    private javax.swing.JComboBox<String> jComboBox_doctors;
    private javax.swing.JComboBox<String> jComboBox_hour;
    private javax.swing.JComboBox<String> jComboBox_min;
    private javax.swing.JComboBox<String> jComboBox_month;
    private javax.swing.JComboBox<String> jComboBox_year;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTextField_address;
    private javax.swing.JTextField jTextField_medicalcondition;
    private javax.swing.JTextField jTextField_name;
    private javax.swing.JTextField jTextField_phone;
    // End of variables declaration//GEN-END:variables
}

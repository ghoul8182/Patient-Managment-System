
package project_sign_in;

import java.io.Serializable;
import javax.swing.JOptionPane;

public class prescription_frame extends javax.swing.JFrame implements Serializable{
    inside_clinic ic;
    public prescription_frame(inside_clinic ic) {
        this.ic=ic;
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField_drugname = new javax.swing.JTextField();
        jTextField_drugduration = new javax.swing.JTextField();
        jTextField_drugtype = new javax.swing.JTextField();
        jTextField_drugadvice = new javax.swing.JTextField();
        jButton_cancel = new javax.swing.JButton();
        jButton_add = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTextField_date = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        jLabel5.setText("drug advice");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("drug name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 17, 98, -1));

        jLabel2.setText("drug duration");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 94, 98, -1));

        jLabel3.setText("drug type");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 54, 98, -1));

        jLabel4.setText("drug advice");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 131, 98, -1));

        jTextField_drugname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_drugnameActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField_drugname, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 14, 395, -1));

        jTextField_drugduration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_drugdurationActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField_drugduration, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 88, 395, -1));
        getContentPane().add(jTextField_drugtype, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 48, 395, -1));
        getContentPane().add(jTextField_drugadvice, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 128, 395, -1));

        jButton_cancel.setText("Cancel");
        jButton_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_cancelActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 127, -1));

        jButton_add.setText("Add");
        jButton_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_addActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, 129, -1));

        jLabel6.setText("Date");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 171, 98, -1));
        getContentPane().add(jTextField_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 168, 395, -1));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_sign_in/MyHome+Clinic4.png"))); // NOI18N
        jLabel8.setText("jLabel8");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 350));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_drugnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_drugnameActionPerformed

    }//GEN-LAST:event_jTextField_drugnameActionPerformed

    private void jTextField_drugdurationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_drugdurationActionPerformed

    }//GEN-LAST:event_jTextField_drugdurationActionPerformed

    private void jButton_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_cancelActionPerformed

        this.dispose();
    ic.setVisible(true);
    }//GEN-LAST:event_jButton_cancelActionPerformed

    private void jButton_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_addActionPerformed

String patientName = ic.getselectedpatient();
String clinicName = ic.getselectedclinic();
String drugName = jTextField_drugname.getText();
String drugType = jTextField_drugtype.getText();
String drugAdvice = jTextField_drugadvice.getText();
String date = jTextField_date.getText();
String duration = jTextField_drugduration.getText();

if (patientName == null || clinicName == null || drugName.isEmpty() || drugType.isEmpty() || date.isEmpty() || duration.isEmpty()) {
    JOptionPane.showMessageDialog(this, "Please make sure to enter all information", "ERROR", JOptionPane.ERROR_MESSAGE);
} else {
    for (int i = 0; i < ic.getPatients(clinicName).size(); i++) {
        if (patientName.equals(ic.getPatients(clinicName).get(i).getName())) {
            Prescription p = new Prescription(ic.getPatients(clinicName).get(i).getID(), date, drugName, drugType, duration, drugAdvice);

            for (int j = 0; j < ic.getarrayofclinic().size(); j++) {
                if (clinicName.equals(ic.getarrayofclinic().get(j).getClinicName())) {
                    ic.getarrayofclinic().get(j).getP().get(i).getPrescriptionList().add(p);
                    this.setVisible(false);
                    ic.setVisible(true);
                    return;
                }
            }
        }
    }
}


    }//GEN-LAST:event_jButton_addActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_add;
    private javax.swing.JButton jButton_cancel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextField_date;
    private javax.swing.JTextField jTextField_drugadvice;
    private javax.swing.JTextField jTextField_drugduration;
    private javax.swing.JTextField jTextField_drugname;
    private javax.swing.JTextField jTextField_drugtype;
    // End of variables declaration//GEN-END:variables
}

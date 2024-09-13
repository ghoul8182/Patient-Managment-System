package project_sign_in;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Clinics extends javax.swing.JFrame implements Serializable {

    private SignIn si;
    private ArrayList<Clinic> c = new ArrayList<>();

    public Clinics() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    

    public JComboBox<String> getjComboBox_Clinic_name() {
        return jComboBox_Clinic_name;
    }

    public void addjComboBox_Clinic_name(String s) {
        jComboBox_Clinic_name.addItem(s);
    }

    public Clinics(SignIn si, ArrayList<Clinic> c) {
        initComponents();
        this.si = si;
        this.c = c;
        loaditems_jComboBox_Clinic_nameActionPerformed();
    }

    public ArrayList<Clinic> getC() {
        return c;
    }

    public void setC(ArrayList<Clinic> c) {
        this.c = c;
    }

    public ArrayList<Clinic> getclinicnames() {
        return c;
    }

    void addclinic_combobox(String a) {
        jComboBox_Clinic_name.addItem(a);
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox_Clinic_name = new javax.swing.JComboBox<>();
        jLabel_gpa = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton_addclinic = new javax.swing.JButton();
        jButton_ok = new javax.swing.JButton();
        jButton_showprescriptionid = new javax.swing.JButton();
        jTextField_prescriptionid = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Clinics");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 26, -1, -1));

        jComboBox_Clinic_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_Clinic_nameActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox_Clinic_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 23, 130, -1));
        jPanel1.add(jLabel_gpa, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 161, 118, 23));

        jButton1.setText("LogOut");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 278, -1, -1));

        jButton_addclinic.setText("Add Clinc");
        jButton_addclinic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_addclinicActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_addclinic, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 160, -1));

        jButton_ok.setText("show proprties");
        jButton_ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_okActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_ok, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 112, -1, -1));

        jButton_showprescriptionid.setText("show prescription (ID)");
        jButton_showprescriptionid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_showprescriptionidActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_showprescriptionid, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 225, -1, -1));

        jTextField_prescriptionid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_prescriptionidActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField_prescriptionid, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 225, 140, -1));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_sign_in/MyHome+Clinic3.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 210));

        jButton3.setText("Free Pharmecy");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, 160, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 651, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_addclinicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_addclinicActionPerformed

        this.setVisible(false);
        Addclinic a = new Addclinic(this, c);
        a.setVisible(true);
    }//GEN-LAST:event_jButton_addclinicActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        si.setintextfieldpassword("");
        si.setintextfieldusername("");
        si.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed
    private void loaditems_jComboBox_Clinic_nameActionPerformed() {
        for (Clinic C : c) {
            jComboBox_Clinic_name.addItem(C.getClinicName());
        }
    }

    String jComboBox_Clinic_name() {
        return (String) jComboBox_Clinic_name.getSelectedItem();
    }

    String selectediteminJcombobox() {
        return (String) jComboBox_Clinic_name.getSelectedItem();
    }

    void removepatientfromclinic(String nameofpatient, String clinicname) {
        for (int i = 0; i < c.size(); i++) {
            if (c.get(i).getClinicName().equals(clinicname)) {
                for (int j = 0; j < c.get(i).getP().size(); j++) {
                    if (nameofpatient.equals(c.get(i).getP().get(j).getName())) {
                        c.get(i).getP().remove(j);
                        return;
                    }
                }
            }
        }
    }

    String getselectedclinic() {
        return (String) jComboBox_Clinic_name.getSelectedItem();
    }
    private void jComboBox_Clinic_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_Clinic_nameActionPerformed

    }//GEN-LAST:event_jComboBox_Clinic_nameActionPerformed

    private void jButton_okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_okActionPerformed
        if (jComboBox_Clinic_name.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(this, "please select clinic", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            inside_clinic ic = new inside_clinic(this, (String) jComboBox_Clinic_name.getSelectedItem());
            this.setVisible(false);
            ic.setVisible(true);
        }
    }//GEN-LAST:event_jButton_okActionPerformed

    private void jButton_showprescriptionidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_showprescriptionidActionPerformed

if (jTextField_prescriptionid.getText().equals("")) {
        JOptionPane.showMessageDialog(this, "please enter prescription ID", "ERROR", JOptionPane.ERROR_MESSAGE);
        jTextField_prescriptionid.setText("");
return;
    } 

        int id = Integer.parseInt(jTextField_prescriptionid.getText());
        new PrescriptionInfo(c, id).setVisible(true);
    }//GEN-LAST:event_jButton_showprescriptionidActionPerformed

    private void jTextField_prescriptionidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_prescriptionidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_prescriptionidActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
Freepharmacy freePharmacyFrame = new Freepharmacy();
    freePharmacyFrame.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton_addclinic;
    private javax.swing.JButton jButton_ok;
    private javax.swing.JButton jButton_showprescriptionid;
    private javax.swing.JComboBox<String> jComboBox_Clinic_name;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel_gpa;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField_prescriptionid;
    // End of variables declaration//GEN-END:variables

}

package project_sign_in;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class add_doctor extends javax.swing.JFrame implements Serializable {
    private inside_clinic cs;
   private ArrayList<doctor> d=new ArrayList<>();
    public add_doctor( inside_clinic cs) {
        initComponents();
        this.cs=cs;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jTextField_name = new javax.swing.JTextField();
        jButton_cancel = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("name of doctor");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 37, 90, -1));

        jTextField_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_nameActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 34, 168, -1));

        jButton_cancel.setText("Cancel");
        jButton_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_cancelActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 152, -1, -1));

        jButton1.setText("add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 152, 110, -1));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_sign_in/MyHome+Clinic4.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_cancelActionPerformed
        this.dispose();
       cs.setVisible(true);
    }//GEN-LAST:event_jButton_cancelActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
   if(jTextField_name.getText()==null){
       JOptionPane.showMessageDialog(this, "please enter name of the doctor", "ERROR", JOptionPane.ERROR_MESSAGE);
   }
   else{
        String major=cs.getselectedclinic();
        doctor newDoctor = new doctor(jTextField_name.getText(), major);
    cs.adddoctorincs(newDoctor);
    cs.add_doctor_in_jComboBox_doctorssActionPerformed(newDoctor.getName());
  
    this.setVisible(false);
    cs.setVisible(true);
   }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_nameActionPerformed

    }//GEN-LAST:event_jTextField_nameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton_cancel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField_name;
    // End of variables declaration//GEN-END:variables
}
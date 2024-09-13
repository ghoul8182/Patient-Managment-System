package project_sign_in;
public class movepatientframe extends javax.swing.JFrame {
inside_clinic ic;
    
    public movepatientframe(inside_clinic ic) {
        this.ic=ic;
        initComponents();
        loadclinicsincombobox();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jComboBox_newclinic = new javax.swing.JComboBox<>();
        jButton_done = new javax.swing.JButton();
        jButton_cancel = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("clinic name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 25, 95, -1));

        jComboBox_newclinic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_newclinicActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox_newclinic, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 22, 138, -1));

        jButton_done.setText("done");
        jButton_done.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_doneActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_done, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, -1, -1));

        jButton_cancel.setText("Cancel");
        jButton_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_cancelActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_sign_in/MyHome+Clinic2.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, 0, 630, 230));

        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 230));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox_newclinicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_newclinicActionPerformed
      
    }//GEN-LAST:event_jComboBox_newclinicActionPerformed

    private void jButton_doneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_doneActionPerformed

        String s=ic.getselectedpatient();
   String clinicname=ic.getselectedclinic();
   String clinicname2=(String)jComboBox_newclinic.getSelectedItem();
    for(int i=0;i<ic.getarrayofclinic().size();i++){
       if(clinicname.equals(ic.getarrayofclinic().get(i).getClinicName())){ 
           for(int j=0;j<ic.getarrayofclinic().get(i).getP().size();j++){
              
               if(s.equals(ic.getarrayofclinic().get(i).getP().get(j).getName())){
                   for(int l=0;l<ic.getarrayofclinic().size();l++){
                    
                       if(clinicname2.equals(ic.getarrayofclinic().get(l).getClinicName())){
                           Patient a=ic.getarrayofclinic().get(i).getP().get(j);
                           ic.getarrayofclinic().get(i).getP().remove(a);
                        ic.getarrayofclinic().get(l).getP().add(a);
                          ic.removepatient(a);
                       ic.removepatientfromcombobox(a.getName());
                       }
                   }
                   
               this.setVisible(false);
               ic.setVisible(true);
               }
           }
       }
    }//GEN-LAST:event_jButton_doneActionPerformed
    }
    void loadclinicsincombobox(){
        for(int i=0;i<ic.getarrayofclinic().size();i++){
        jComboBox_newclinic.addItem(ic.getarrayofclinic().get(i).getClinicName());
                }
    }
    private void jButton_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_cancelActionPerformed
       this.dispose();
       ic.setVisible(true);
    }//GEN-LAST:event_jButton_cancelActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_cancel;
    private javax.swing.JButton jButton_done;
    private javax.swing.JComboBox<String> jComboBox_newclinic;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}

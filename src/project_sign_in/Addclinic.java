
package project_sign_in;

import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;


public class Addclinic extends javax.swing.JFrame implements Serializable{

    private Clinics sf;
   private ArrayList<Clinic> c;
    
    
    public Addclinic( Clinics sf,ArrayList<Clinic> c) {
        initComponents();
        this.sf=sf;
        this.c=c;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField_name = new javax.swing.JTextField();
        jTextField_maxpatient = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("NAme");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 68, 60, -1));

        jLabel2.setText("maxpatient");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 123, -1, -1));
        jPanel1.add(jTextField_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 65, 124, -1));
        jPanel1.add(jTextField_maxpatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 117, 124, -1));

        jButton1.setText("add clinic");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 249, -1, -1));

        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 249, -1, -1));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_sign_in/MyHome+Clinic4.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 290));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
   
        sf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 if(jTextField_name.getText().equals("")||jTextField_maxpatient.getText().equals("")){
     JOptionPane.showMessageDialog(this, "make sure to enter all fields", "ERROR", JOptionPane.ERROR_MESSAGE);
 return;
 }
 else{
        ArrayList<doctor> d=new ArrayList<>();
 ArrayList<Patient> p=new ArrayList<>();
Clinic a=new Clinic(jTextField_name.getText(),Integer.parseInt(jTextField_maxpatient.getText()),d, p);
c.add(a);
sf.addclinic_combobox(a.getClinicName());
this.setVisible(false);
sf.setVisible(true);
 }
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField_maxpatient;
    private javax.swing.JTextField jTextField_name;
    // End of variables declaration//GEN-END:variables
}
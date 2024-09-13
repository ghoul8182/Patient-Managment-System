package project_sign_in;

import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class SignUp extends javax.swing.JFrame implements Serializable {

    SignIn si;
    ArrayList<Account> a;

    public SignUp(SignIn si, ArrayList<Account> a) {
        initComponents();
        this.si = si;
        this.a = a;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField_name = new javax.swing.JTextField();
        jTextField_phone = new javax.swing.JTextField();
        jTextField_username = new javax.swing.JTextField();
        jPasswordField_pass = new javax.swing.JPasswordField();
        jPasswordField_confirm = new javax.swing.JPasswordField();
        jButton_signup = new javax.swing.JButton();
        jButton_cancel = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Sign UP");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Name:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 37, -1, -1));

        jLabel2.setText("Phone:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 77, -1, -1));

        jLabel3.setText("Username: ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 123, -1, -1));

        jLabel4.setText("Password:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 160, -1, -1));

        jLabel5.setText("Confirm Pass:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 203, -1, -1));
        jPanel1.add(jTextField_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 34, 199, -1));
        jPanel1.add(jTextField_phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 74, 199, -1));
        jPanel1.add(jTextField_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 120, 199, -1));
        jPanel1.add(jPasswordField_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 160, 199, -1));
        jPanel1.add(jPasswordField_confirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 198, -1));

        jButton_signup.setText("SignUp");
        jButton_signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_signupActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_signup, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 262, -1, -1));

        jButton_cancel.setText("Cancel");
        jButton_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_cancelActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 262, -1, -1));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_sign_in/MyHome+Clinic3.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 250));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_cancelActionPerformed
        this.dispose();
        si.setVisible(true);
    }//GEN-LAST:event_jButton_cancelActionPerformed

    private void jButton_signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_signupActionPerformed
if(jTextField_name.getText().equals("")|| jTextField_phone.getText().equals("")||jTextField_username.getText().equals("")||jPasswordField_pass.getText().equals("")||jPasswordField_confirm.getText().equals("")){
    JOptionPane.showMessageDialog(this, "please make sure to enter all fields", "ERROR", JOptionPane.ERROR_MESSAGE);
return;
}
        for (int i = 0; i < si.getA().size(); i++) {
            if (jTextField_username.getText().equals(si.getA().get(i).getName())) {
                JOptionPane.showMessageDialog(this, "this username is not available", "ERROR", JOptionPane.ERROR_MESSAGE);
                jTextField_username.setText("");
                return;
            }
        }
        if (!jPasswordField_confirm.getText().equals(jPasswordField_pass.getText())) {
            JOptionPane.showMessageDialog(this, "make sure to match the password and confirmation password", "ERROR", JOptionPane.ERROR_MESSAGE);
        jPasswordField_confirm.setText("");
        jPasswordField_pass.setText("");
            return;
        }
        if (!jTextField_name.equals("") && !jTextField_phone.equals("")
                && !jTextField_username.equals("") && jPasswordField_confirm.getText().equals(jPasswordField_pass.getText())) {
            Account account = new Account(jTextField_username.getText(), jPasswordField_pass.getText(), jTextField_phone.getText(), jTextField_name.getText());
            a.add(account);
            si.setA(a);
            this.dispose();
        si.setVisible(true);
        }
    }//GEN-LAST:event_jButton_signupActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_cancel;
    private javax.swing.JButton jButton_signup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField_confirm;
    private javax.swing.JPasswordField jPasswordField_pass;
    private javax.swing.JTextField jTextField_name;
    private javax.swing.JTextField jTextField_phone;
    private javax.swing.JTextField jTextField_username;
    // End of variables declaration//GEN-END:variables
}

package project_sign_in;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
public class SignIn extends javax.swing.JFrame {
    private ArrayList<Account> a=new ArrayList<>();
     private ArrayList<Clinic> c =new ArrayList<>();
     
    public SignIn() {
        initComponents();
        load();
    }
public void setintextfieldusername(String s){
    jTextField_username.setText(s);
}
public void setintextfieldpassword(String s){
    jPasswordField1.setText(s);
}
    public JPasswordField getjPasswordField1() {
        return jPasswordField1;
    }
    public void setjPasswordField1(JPasswordField jPasswordField1) {
        this.jPasswordField1 = jPasswordField1;
    }
    public JTextField getjTextField_username() {
        return jTextField_username;
    }
    public void setjTextField_username(JTextField jTextField_username) {
        this.jTextField_username = jTextField_username;
    }
    public ArrayList<Account> getA() {
        return a;
    }
    public void setjPasswordField1(String s) {
     this.jPasswordField1.setText(s);
    }
    public void setjTextField_username(String s) {
        this.jTextField_username.setText(s);
    }
    public void setA(ArrayList<Account> a) {
        this.a = a;
    }
    public ArrayList<Clinic> getc() {
        return c;
    }
    public void setc(ArrayList<Clinic> c) {
        this.c = c;
    }
    public SignIn(ArrayList<Account> a ,ArrayList<Clinic> c ,ArrayList<Patient> p,ArrayList<doctor> d) {
        initComponents();
        this.a = a;
        this.c=c;

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField_username = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jButton_signin = new javax.swing.JButton();
        jButton_exit = new javax.swing.JButton();
        jButton_signup = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("User name:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 130, -1, -1));

        jLabel2.setText("Password");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 186, 58, -1));
        jPanel1.add(jTextField_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 127, 157, -1));

        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 183, 157, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("LogIN");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 40, 132, -1));

        jButton_signin.setText("Sign In");
        jButton_signin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_signinActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_signin, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 256, -1, -1));

        jButton_exit.setText("Exit");
        jButton_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_exitActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 256, 61, -1));

        jButton_signup.setText("Sign Up");
        jButton_signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_signupActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_signup, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 221, -1, -1));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_sign_in/MyHome+Clinic2.png"))); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 290));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 634, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_signinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_signinActionPerformed
        String user = jTextField_username.getText();
        String pass = jPasswordField1.getText();
        if (user.trim().equals("") || pass.trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Wrong user or password !", "Error Log in", JOptionPane.ERROR_MESSAGE);
            return;
        }
        for (int i = 0; i < a.size(); i++) {
            if (user.equals(a.get(i).getUsername())) {
                if (pass.equals(a.get(i).getPassword())) {
                 Clinics sf = new Clinics(this, c);
                 sf.setVisible(true);
                 this.setVisible(false);
                 return;
                }
            }
        }
        JOptionPane.showMessageDialog(this, "Wrong user or pass !", "Error Log in", JOptionPane.ERROR_MESSAGE);
        jTextField_username.setText("");
        jPasswordField1.setText("");
    }//GEN-LAST:event_jButton_signinActionPerformed

    private void jButton_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_exitActionPerformed
      
        int showConfirmDialog = JOptionPane.showConfirmDialog(this, "Do you want to Exit ?");
        if (showConfirmDialog == JOptionPane.OK_OPTION) {
            save();
            System.exit(0);
        }
    }//GEN-LAST:event_jButton_exitActionPerformed

    private void jButton_signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_signupActionPerformed
        this.setVisible(false);
        
        SignUp sup = new SignUp(this, a);
        sup.setVisible(true);
    }//GEN-LAST:event_jButton_signupActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
 String user = jTextField_username.getText();
        String pass = jPasswordField1.getText();
        if (user.trim().equals("") || pass.trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Wrong user or password !", "Error Log in", JOptionPane.ERROR_MESSAGE);
            return;
        }
        for (int i = 0; i < a.size(); i++) {
            if (user.equals(a.get(i).getUsername())) {
                if (pass.equals(a.get(i).getPassword())) {
                 Clinics sf = new Clinics(this, c);
                 sf.setVisible(true);
                 this.setVisible(false);
                 return;
                }
            }
        }
        JOptionPane.showMessageDialog(this, "Wrong user or pass !", "Error Log in", JOptionPane.ERROR_MESSAGE);
        jTextField_username.setText("");
        jPasswordField1.setText("");        
    }//GEN-LAST:event_jPasswordField1ActionPerformed

   
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_exit;
    private javax.swing.JButton jButton_signin;
    private javax.swing.JButton jButton_signup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField_username;
    // End of variables declaration//GEN-END:variables

    private void load() {
        FileInputStream fis = null;
        try {
            File file = new File ("data.txt");
            if (file.exists())
            fis = new FileInputStream(file);
           else
              return;
            if (fis.available()>0)
            {
                 ObjectInputStream ois = new ObjectInputStream(fis);
                 if (ois.available()>-1)
                 {
                     a= (ArrayList<Account>) ois.readObject();
                      if(a==null)
                          a=new ArrayList<>();
                     c= (ArrayList<Clinic>) ois.readObject();
                     if (c==null)
                         c= new ArrayList<>();
                     ois.close();
                 }
               fis.close();
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SignIn.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(SignIn.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SignIn.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    private void save() {
        FileOutputStream fos = null;
        try {
            File file = new File ("data.txt");
            fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(a);
            oos.writeObject(c);
            oos.close();
            fos.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SignIn.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(SignIn.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
}
import java.sql.Connection;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
        
        
        
public class Registration extends javax.swing.JFrame {

    /**
     * Creates new form Registration
     */
    public Registration() {
        initComponents();      
        txtLogID.setVisible(false); // Hide seller ID field initially
        seller.setVisible(false);
        jComboBox1.addActionListener(e -> {
            if (jComboBox1.getSelectedItem().equals("Seller")) {
                seller.setVisible(true);
                txtLogID.setVisible(true);
            } else {
                seller.setVisible(false);
                txtLogID.setVisible(false);
            }
        });
        try {
            Connection();
        } catch (SQLException ex) {
            Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    Connection con;
    Statement st;
    
    
    private  static final String DbName = "grabnwait";
    private  static final String DbDriver = "com.mysql.cj.jdbc.Driver";
    private  static final String DbUrl = "jdbc:mysql://localhost:3306/"+DbName;
    private  static final String DbUsername = "root";
    private  static final String DbPassword = "";
    
    
    public void Connection() throws SQLException{
        try {
            Class.forName(DbDriver);
            con  = DriverManager.getConnection(DbUrl, DbUsername, DbPassword);
            st = con.createStatement();
            if (con !=null){
                System.out.println("Connection Successful");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtLogUsername = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtLogID = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        seller = new javax.swing.JLabel();
        txtLogPassword = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 51));
        jLabel2.setText("Registration");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 51));
        jLabel3.setText("Username:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, -1, -1));
        jPanel3.add(txtLogUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, 230, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 51));
        jLabel4.setText("Password:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, -1, -1));
        jPanel3.add(txtLogID, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, 230, -1));

        jButton1.setBackground(new java.awt.Color(0, 51, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 270, 80, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 51));
        jLabel5.setText("Already have an Account?");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 320, -1, -1));

        jButton2.setBackground(new java.awt.Color(0, 51, 204));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Login");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 320, -1, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Desktop - 1 (1).png"))); // NOI18N
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 350));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Customer", "Seller" }));
        jPanel3.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, -1, -1));

        seller.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        seller.setForeground(new java.awt.Color(255, 255, 51));
        seller.setText("Seller ID:");
        jPanel3.add(seller, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, -1, -1));
        jPanel3.add(txtLogPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, 230, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 String username, password, accountType, sellerId = null;
        
        if ("".equals(txtLogUsername.getText())){
            JOptionPane.showMessageDialog(null, "Required Username");
            return;
        }
        if ("".equals(txtLogPassword.getText())){
            JOptionPane.showMessageDialog(null, "Required Password");
            return;
        }
        
        username = txtLogUsername.getText();
        password = txtLogPassword.getText();
        accountType = jComboBox1.getSelectedItem().toString();
        
        // If account type is Seller, validate seller ID
        if (accountType.equals("Seller")) {
            if ("".equals(txtLogID.getText())){
                JOptionPane.showMessageDialog(null, "Required Seller ID");
                return;
            }
            sellerId = txtLogID.getText();
        }
        
        try {
            String queryRegister;
            if (accountType.equals("Seller")) {
                queryRegister = "INSERT INTO accountdetails(accUsername, accPassword, Type, seller_id) " +
                               "VALUES ('" + username + "','" + password + "','" + accountType + "','" + sellerId + "')";
            } else {
                queryRegister = "INSERT INTO accountdetails(accUsername, accPassword, Type) " +
                               "VALUES ('" + username + "','" + password + "','" + accountType + "')";
            }
            
            st.execute(queryRegister);
            JOptionPane.showMessageDialog(null, "Data added successfully");
            txtLogUsername.setText("");
            txtLogPassword.setText("");
            txtLogID.setText("");
        } catch (SQLException ex) {
            Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    Login login = new Login();
    login.setVisible(true);
    login.pack();
    login.setLocationRelativeTo(null);
    this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel seller;
    private javax.swing.JTextField txtLogID;
    private javax.swing.JTextField txtLogPassword;
    private javax.swing.JTextField txtLogUsername;
    // End of variables declaration//GEN-END:variables
}

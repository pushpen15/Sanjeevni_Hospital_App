/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sanjeevaniapp.gui;

import java.sql.SQLException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import javax.swing.JOptionPane;
import sanjeevaniapp.Dao.DoctorDao;
import sanjeevaniapp.Dao.EmpDao;
import sanjeevaniapp.pojo.DoctorPojo;
import sanjeevaniapp.pojo.UserPojo;

/**
 *
 * @author User
 */
public class RegisterDoctorFrame extends javax.swing.JFrame {

    /**
     * Creates new form RegisterDoctorFrame
     */
     HashMap<String,String> doctor;
     public boolean validateInput(){
        char[]pwd=pw.getPassword();
        char[] repw=repwd.getPassword();
        return !(txtUserId.getText().isEmpty()||pwd.length<4||repw.length<4||txtQuali.getText().isEmpty()||txtSpecial.getText().isEmpty()||txtDocId.getText().isEmpty());
    }
       public boolean passwordMatch(String a,String b){
        return a.equals(b);
    }
       public void loadDoctorDetails()
{
    try{
        
         doctor=EmpDao.getNonRegisteredDoctorList();
        if( doctor.size()==0){
            JOptionPane.showMessageDialog(null,"No UnRegistered Doctor present !");
            btnAddEmp.setEnabled(false);
            return;
        }
        btnAddEmp.setEnabled(true);
        
        Collection keys= doctor.keySet();
        Iterator<String> it=keys.iterator();
        jcbEmpId.removeAllItems();
        while(it.hasNext()){
            jcbEmpId.addItem(it.next());
        }
        
    }
     catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"SQL error","Error!",JOptionPane.ERROR_MESSAGE);
           ex.printStackTrace();
        }
}
        public void clearText(){
        txtUserId.setText("");
        pw.setText("");
        repwd.setText("");
        txtQuali.setText("");
        txtSpecial.setText("");
    }
    public RegisterDoctorFrame() {
        initComponents();
        setLocationRelativeTo(null);
        loadDoctorDetails();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jDesktopPane6 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        btnLogOut = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        btnAddEmp = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtEmpName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jcbEmpId = new javax.swing.JComboBox<>();
        lblUserId = new javax.swing.JLabel();
        txtUserId = new javax.swing.JTextField();
        repwd = new javax.swing.JPasswordField();
        pw = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtQuali = new javax.swing.JTextField();
        txtSpecial = new javax.swing.JTextField();
        txtSpecial1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtDocId = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 0, 51));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 29)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("REGISTER DOCTOR");

        btnLogOut.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        btnLogOut.setText("Logout");
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Palatino Linotype", 1, 20)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jDesktopPane6.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane6.setLayer(btnLogOut, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane6.setLayer(btnBack, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane6Layout = new javax.swing.GroupLayout(jDesktopPane6);
        jDesktopPane6.setLayout(jDesktopPane6Layout);
        jDesktopPane6Layout.setHorizontalGroup(
            jDesktopPane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane6Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLogOut)
                .addContainerGap())
        );
        jDesktopPane6Layout.setVerticalGroup(
            jDesktopPane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane6Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(jDesktopPane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jDesktopPane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnLogOut)
                        .addComponent(btnBack))
                    .addComponent(jLabel1))
                .addGap(25, 25, 25))
        );

        btnAddEmp.setFont(new java.awt.Font("Palatino Linotype", 1, 20)); // NOI18N
        btnAddEmp.setText("Register");
        btnAddEmp.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                btnAddEmpItemStateChanged(evt);
            }
        });
        btnAddEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddEmpActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Palatino Linotype", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 153, 255));
        jLabel6.setText("Password");

        jLabel8.setFont(new java.awt.Font("Palatino Linotype", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 153, 255));
        jLabel8.setText("Employee Name");

        txtEmpName.setFont(new java.awt.Font("Palatino Linotype", 1, 20)); // NOI18N
        txtEmpName.setEnabled(false);

        jLabel2.setFont(new java.awt.Font("Palatino Linotype", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 153, 255));
        jLabel2.setText("Emp ID");

        jLabel7.setFont(new java.awt.Font("Palatino Linotype", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 153, 255));
        jLabel7.setText("Retype-password");

        jcbEmpId.setFont(new java.awt.Font("Palatino Linotype", 1, 20)); // NOI18N
        jcbEmpId.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbEmpIdItemStateChanged(evt);
            }
        });
        jcbEmpId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbEmpIdActionPerformed(evt);
            }
        });

        lblUserId.setBackground(new java.awt.Color(0, 102, 255));
        lblUserId.setFont(new java.awt.Font("Palatino Linotype", 1, 20)); // NOI18N
        lblUserId.setForeground(new java.awt.Color(51, 153, 255));
        lblUserId.setText("User Id");

        txtUserId.setFont(new java.awt.Font("Palatino Linotype", 1, 20)); // NOI18N

        repwd.setFont(new java.awt.Font("Palatino Linotype", 1, 20)); // NOI18N

        pw.setFont(new java.awt.Font("Palatino Linotype", 1, 20)); // NOI18N
        pw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Palatino Linotype", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 153, 255));
        jLabel9.setText("Qualification");

        jLabel10.setFont(new java.awt.Font("Palatino Linotype", 1, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 153, 255));
        jLabel10.setText("Specialist");

        txtQuali.setFont(new java.awt.Font("Palatino Linotype", 1, 20)); // NOI18N

        txtSpecial.setFont(new java.awt.Font("Palatino Linotype", 1, 20)); // NOI18N

        txtSpecial1.setFont(new java.awt.Font("Palatino Linotype", 1, 20)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Palatino Linotype", 1, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 153, 255));

        txtDocId.setFont(new java.awt.Font("Palatino Linotype", 1, 20)); // NOI18N
        txtDocId.setForeground(new java.awt.Color(51, 153, 255));
        txtDocId.setText("Doctor ID");

        jDesktopPane1.setLayer(btnAddEmp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(txtEmpName, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jcbEmpId, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(lblUserId, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(txtUserId, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(repwd, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(pw, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(txtQuali, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(txtSpecial, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(txtSpecial1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel11, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(txtDocId, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jDesktopPane1Layout.createSequentialGroup()
                            .addGap(62, 62, 62)
                            .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblUserId)
                                .addComponent(jLabel2)
                                .addComponent(jLabel6)))
                        .addComponent(jLabel7)
                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtDocId, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(jLabel8))
                .addGap(39, 39, 39)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pw, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcbEmpId, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtEmpName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
                    .addComponent(txtUserId, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(repwd, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtQuali, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
                    .addComponent(txtSpecial, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
                    .addComponent(txtSpecial1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE))
                .addGap(49, 49, 49)
                .addComponent(btnAddEmp)
                .addGap(91, 91, 91))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(btnAddEmp))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jcbEmpId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtEmpName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblUserId)
                            .addComponent(txtUserId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(7, 7, 7)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(repwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtQuali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSpecial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSpecial1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDocId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDesktopPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 184, Short.MAX_VALUE)
                        .addComponent(jDesktopPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jDesktopPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDesktopPane1))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        // TODO add your handling code here:
        LoginFrame lf=new LoginFrame();
        lf.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void btnAddEmpItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_btnAddEmpItemStateChanged
        // TODO add your handling code here:

    }//GEN-LAST:event_btnAddEmpItemStateChanged

    private void btnAddEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddEmpActionPerformed
        if(validateInput()==false)
        {
            JOptionPane.showMessageDialog(null,"please fill all the field","Empty value!",JOptionPane.ERROR_MESSAGE);
            return;
        }
        try{
            String id=jcbEmpId.getSelectedItem().toString();
            String userid=txtUserId.getText();
            
            char[]pwd=pw.getPassword();
            char[]repw=repwd.getPassword();
            String pswd=String.valueOf(pwd);
            String repswd=String.valueOf(repw);
            if(!passwordMatch(pswd,repswd)){
                JOptionPane.showMessageDialog(null,"Password did not match !","Empty value!",JOptionPane.ERROR_MESSAGE);
                return;
            }
            UserPojo user=new UserPojo();
            DoctorPojo d=new DoctorPojo();
           d.setUserId(userid);
           d.setQualification(txtQuali.getText());
           d.setSpecialist(txtSpecial.getText());
           d.setActive('Y');
           d.setDocId(txtDocId.getText());
            user.setUserid(userid);
            user.setUsername(txtEmpName.getText());
            user.setEmpId(id);
            user.setPassword(pswd);
            user.setUsertype("DOCTOR");
            boolean result=DoctorDao.addDoctor(d);
            if(result){
                JOptionPane.showMessageDialog(null,"Record sucessfully added to Database","success!",JOptionPane.INFORMATION_MESSAGE);
                clearText();
                loadDoctorDetails();
            }
            else{
                JOptionPane.showMessageDialog(null,"could not add Doctor to Database","ERROR!",JOptionPane.ERROR_MESSAGE);

            }
        }
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"SQL error","Error!",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }

    }//GEN-LAST:event_btnAddEmpActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
         MngDoctorFrame mef=new MngDoctorFrame();
        mef.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void jcbEmpIdItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbEmpIdItemStateChanged
        // TODO add your handling code here:
        if(jcbEmpId.getItemCount()==0){
            return;
        }
        txtEmpName.setText(doctor.get(jcbEmpId.getSelectedItem()));
       // try{
     //   txtDocId.setText(DoctorDao.getNewId());
       // }
       // catch(SQLException s){
           // s.printStackTrace();
           // JOptionPane.showMessageDialog(null,"SQL error","Error!",JOptionPane.ERROR_MESSAGE);
      //  }
    }//GEN-LAST:event_jcbEmpIdItemStateChanged

    private void jcbEmpIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbEmpIdActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jcbEmpIdActionPerformed

    private void pwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pwActionPerformed

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
            java.util.logging.Logger.getLogger(RegisterDoctorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterDoctorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterDoctorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterDoctorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterDoctorFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddEmp;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPane6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> jcbEmpId;
    private javax.swing.JLabel lblUserId;
    private javax.swing.JPasswordField pw;
    private javax.swing.JPasswordField repwd;
    private javax.swing.JLabel txtDocId;
    private javax.swing.JTextField txtEmpName;
    private javax.swing.JTextField txtQuali;
    private javax.swing.JTextField txtSpecial;
    private javax.swing.JTextField txtSpecial1;
    private javax.swing.JTextField txtUserId;
    // End of variables declaration//GEN-END:variables
}

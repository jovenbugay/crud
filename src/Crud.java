/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TERMINAL
 */
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Crud extends javax.swing.JFrame {

    /**
     * Creates new form Crud
     */
    public Crud() {
        initComponents();
        btnGrpGender.add(rm);
        btnGrpGender.add(rf);
        displayAll();
        /*DefaultTableModel model = (DefaultTableModel)tblemployee.getModel();
        model.addRow(new Object[]{
        "1",
        "Joyce Ann C. Artacho",
        "1999-10-29",
        "F",
        "Programmer",
        "IT"
        });*/
       /*try {
            Connection cn = null;
            cn = DriverManager.getConnection("jdbc:mysql://127.0.0.1/employeedb", "root", "");
            String sql = "SELECT * FROM `tblemployee`";
            
            Statement stmt = cn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            
            DefaultTableModel model = (DefaultTableModel)tblemployee.getModel();
            while(rs.next() == true){
            model.addRow(new Object[]{
                rs.getInt("id"),
                rs.getString("fullName"),
                rs.getString("birthdate"),
                rs.getString("gender"),
                rs.getString("position"),
                rs.getString("department")
            });
       }
            cn.close();
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, e.toString());
        }*/
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGrpGender = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lblid = new javax.swing.JLabel();
        lblid1 = new javax.swing.JLabel();
        lblid2 = new javax.swing.JLabel();
        lblid3 = new javax.swing.JLabel();
        lblid4 = new javax.swing.JLabel();
        lblid5 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtfullName = new javax.swing.JTextField();
        txtbirthdate = new javax.swing.JTextField();
        txtdepartment = new javax.swing.JTextField();
        rm = new javax.swing.JRadioButton();
        rf = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblemployee = new javax.swing.JTable();
        cboposition = new javax.swing.JComboBox<>();
        btnadd = new javax.swing.JButton();
        btnedit = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));

        lblid.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblid.setForeground(new java.awt.Color(255, 255, 255));
        lblid.setText("ID:");

        lblid1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblid1.setForeground(new java.awt.Color(255, 255, 255));
        lblid1.setText("fullName:");

        lblid2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblid2.setForeground(new java.awt.Color(255, 255, 255));
        lblid2.setText("birthdate:");

        lblid3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblid3.setForeground(new java.awt.Color(255, 255, 255));
        lblid3.setText("gender:");

        lblid4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblid4.setForeground(new java.awt.Color(255, 255, 255));
        lblid4.setText("position:");

        lblid5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblid5.setForeground(new java.awt.Color(255, 255, 255));
        lblid5.setText("depatment:");

        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
            }
        });

        rm.setForeground(new java.awt.Color(255, 255, 255));
        rm.setText("Male");

        rf.setForeground(new java.awt.Color(255, 255, 255));
        rf.setText("Female");

        tblemployee.setBackground(new java.awt.Color(0, 102, 102));
        tblemployee.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tblemployee.setForeground(new java.awt.Color(255, 255, 255));
        tblemployee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "fullName", "birthdate", "gender", "position", "department"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblemployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblemployeeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblemployee);

        cboposition.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CEO", "IT Manager", "Solution Architech", "IT Technician", "Network Administrator", "IT Assistant", "Janitor" }));

        btnadd.setText("ADD");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });

        btnedit.setText("EDIT");
        btnedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditActionPerformed(evt);
            }
        });

        btndelete.setText("DELETE");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblid1)
                            .addComponent(lblid))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtfullName)
                            .addComponent(txtid)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblid5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtdepartment))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblid3)
                            .addComponent(lblid4)
                            .addComponent(lblid2))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtbirthdate, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(rm)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(rf))
                                .addComponent(cboposition, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btndelete)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnadd, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnedit, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblid)
                            .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblid1)
                            .addComponent(txtfullName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblid2)
                            .addComponent(txtbirthdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblid3)
                            .addComponent(rm)
                            .addComponent(rf))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblid4)
                            .addComponent(cboposition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblid5)
                            .addComponent(txtdepartment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnadd)
                                .addGap(18, 18, 18)
                                .addComponent(btnedit)
                                .addGap(18, 18, 18)
                                .addComponent(btndelete))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidActionPerformed

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        try {
            Connection cn = null;
            cn = DriverManager.getConnection("jdbc:mysql://127.0.0.1/employeedb", "root", "");
            String sql = "";
            String gender = rm.isSelected() ? "M" : "F";
            sql += "INSERT INTO `tblemployee` (`fullName`, `birthdate`, `position`, `department`, `gender`)";

            sql += "VALUES (";
            sql += "'" + txtfullName.getText() + "',";
            sql += "'" + txtbirthdate.getText() + "',";
            sql += "'" + String.valueOf(cboposition.getSelectedItem()) + "',";
            sql += "'" + txtdepartment.getText() + "',";
            sql += "'" + gender + "'";
            sql += ")";

            Statement stmt = cn.createStatement();
            stmt.execute(sql);
            cn.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.toString(), "Title", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnaddActionPerformed

    private void tblemployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblemployeeMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)tblemployee.getModel();
        
        int selectdrow = tblemployee.getSelectedRow();
        int id = Integer.parseInt(model.getValueAt(selectdrow, 0).toString());
        txtid.setText(String.valueOf(id));
        
        String fullName = model.getValueAt(selectdrow, 1).toString();
        txtfullName.setText(String.valueOf(fullName));
        
        String birthdate = model.getValueAt(selectdrow, 2).toString();
        txtbirthdate.setText(String.valueOf(birthdate));
        
       
        if (model.getValueAt(selectdrow, 3).equals("M")){
            rm.setSelected(true);
        }
        else if(model.getValueAt(selectdrow, 3).equals("F")){
            rf.setSelected(true);
        }
        
        if (model.getValueAt(selectdrow, 4).equals("CEO")){
            cboposition.setSelectedIndex(0);
        }
        else if (model.getValueAt(selectdrow, 4).equals("IT Manager")){
            cboposition.setSelectedIndex(1);
        }
        else if (model.getValueAt(selectdrow, 4).equals("Solution Architech")){
            cboposition.setSelectedIndex(2);
        }
        else if (model.getValueAt(selectdrow, 4).equals("IT Technician")){
            cboposition.setSelectedIndex(3);
        }
        else if (model.getValueAt(selectdrow, 4).equals("Network Administrator")){
            cboposition.setSelectedIndex(4);
        }
        else if (model.getValueAt(selectdrow, 4).equals("IT Assistant")){
            cboposition.setSelectedIndex(5);
        }
        else if (model.getValueAt(selectdrow, 4).equals("Janitor")){
            cboposition.setSelectedIndex(6);
        }
        
        String department = model.getValueAt(selectdrow, 5).toString();
        txtdepartment.setText(String.valueOf(department));
    }//GEN-LAST:event_tblemployeeMouseClicked

    private void btneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditActionPerformed

        try {
            Connection cn = null;
            cn = DriverManager.getConnection("jdbc:mysql://127.0.0.1/employeedb", "root", "");
            String sql = "";
            String gender = rm.isSelected() ? "M" : "F";
            sql += "UPDATE `tblemployee`";
            sql += "SET";
            sql += " `fullName` = '" + txtfullName.getText() + "',";
            sql += " `birthdate` = '" + txtbirthdate.getText() + "',";
            sql += " `gender`= '" + gender + "',";
            sql += " `position` = '" + String.valueOf(cboposition.getSelectedItem()) + "',";
            sql += "`department` = ' " + txtdepartment.getText() + "'";
            sql +=  " WHERE  id = " + Integer.parseInt(txtid.getText());

            Statement stmt = cn.createStatement();
            stmt.execute(sql);
            cn.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.toString(), "Title", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }//GEN-LAST:event_btneditActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        // TODO add your handling code here:
        try {
            Connection cn = null;
            cn = DriverManager.getConnection("jdbc:mysql://127.0.0.1/employeedb", "root", "");
            String sql = "";
            String gender = rm.isSelected() ? "M" : "F";
            sql += "DELETE FROM `tblemployee`";
            sql += "WHERE id = " + Integer.parseInt(txtid.getText());

            Statement stmt = cn.createStatement();
            stmt.execute(sql);
            cn.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.toString(), "Title", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btndeleteActionPerformed

    /**
     * @param args the command line arguments
     */
    public void displayAll(){
    try {
        Connection cn = null;
            cn = DriverManager.getConnection("jdbc:mysql://127.0.0.1/employeedb", "root", "");
            String sql = "SELECT * FROM `tblemployee`";
            
            Statement stmt = cn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            
            DefaultTableModel model = (DefaultTableModel)tblemployee.getModel();
            while(rs.next() == true){
            model.addRow(new Object[]{
                rs.getInt("id"),
                rs.getString("fullName"),
                rs.getString("birthdate"),
                rs.getString("gender"),
                rs.getString("position"),
                rs.getString("department")
            });
       }
            cn.close();
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, e.toString(), "Title", JOptionPane.INFORMATION_MESSAGE);
        }
    }
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
            java.util.logging.Logger.getLogger(Crud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Crud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Crud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Crud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Crud().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnGrpGender;
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnedit;
    private javax.swing.JComboBox<String> cboposition;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblid;
    private javax.swing.JLabel lblid1;
    private javax.swing.JLabel lblid2;
    private javax.swing.JLabel lblid3;
    private javax.swing.JLabel lblid4;
    private javax.swing.JLabel lblid5;
    private javax.swing.JRadioButton rf;
    private javax.swing.JRadioButton rm;
    private javax.swing.JTable tblemployee;
    private javax.swing.JTextField txtbirthdate;
    private javax.swing.JTextField txtdepartment;
    private javax.swing.JTextField txtfullName;
    private javax.swing.JTextField txtid;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Employee;
import model.EmployeeInfo;

/**
 *
 * @author doshi
 */
public class ViewJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewJPanel
     */
    
    EmployeeInfo history;
    public ViewJPanel(EmployeeInfo history) {
        initComponents();
        
        this.history = history;
        
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmployee = new javax.swing.JTable();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        lblEmplyeeId = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblCellNumber = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        txtEmployeeID = new javax.swing.JTextField();
        lblStartdate = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        lblLevel = new javax.swing.JLabel();
        txtLevel = new javax.swing.JTextField();
        lblTeaminfo = new javax.swing.JLabel();
        txtStartdate = new javax.swing.JTextField();
        txtCellNumber = new javax.swing.JTextField();
        lblContactinfo = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        txtTeaminfo = new javax.swing.JTextField();
        btnView = new javax.swing.JButton();

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("View Employee");

        tblEmployee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Employee ID", "Age", "Gender", "Start Date", "Level", "Team Info", "Cell Number", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblEmployee);

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        lblEmplyeeId.setText("Employee ID :");

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        lblCellNumber.setText("Cell Number :");

        lblAge.setText("Age :");

        lblEmail.setText("Email :");

        lblStartdate.setText("Start date :");

        lblLevel.setText("Level :");

        txtLevel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLevelActionPerformed(evt);
            }
        });

        lblTeaminfo.setText("Team info :");

        txtCellNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCellNumberActionPerformed(evt);
            }
        });

        lblContactinfo.setText("Contact Info ");

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        lblName.setText("Name :");

        txtTeaminfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTeaminfoActionPerformed(evt);
            }
        });

        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 761, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnView)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdate)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblAge)
                    .addComponent(lblEmplyeeId)
                    .addComponent(lblStartdate)
                    .addComponent(lblLevel)
                    .addComponent(lblTeaminfo)
                    .addComponent(lblName)
                    .addComponent(lblContactinfo)
                    .addComponent(lblCellNumber)
                    .addComponent(lblEmail))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTeaminfo)
                    .addComponent(txtEmail)
                    .addComponent(txtStartdate)
                    .addComponent(txtEmployeeID)
                    .addComponent(txtName)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                    .addComponent(txtLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCellNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblTitle)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete)
                    .addComponent(btnUpdate)
                    .addComponent(btnView))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmplyeeId)
                    .addComponent(txtEmployeeID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAge)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStartdate)
                    .addComponent(txtStartdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLevel)
                    .addComponent(txtLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTeaminfo)
                    .addComponent(txtTeaminfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblContactinfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCellNumber)
                    .addComponent(txtCellNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(127, 127, 127))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblEmployee.getSelectedRow();
        
        if (selectedRowIndex<0){
            
            JOptionPane.showMessageDialog(this, "PLease select a row to delete.");
            
            return;
            
        }
        
        DefaultTableModel model = (DefaultTableModel) tblEmployee.getModel();
        Employee selectedEmployee = (Employee) model.getValueAt(selectedRowIndex, 0);
        
        history.deleteEmployee(selectedEmployee);
        
        JOptionPane.showMessageDialog(this, "Employees deleted.");
            
        populateTable();
        
        
        

             
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
         DefaultTableModel model= (DefaultTableModel) tblEmployee.getModel();
        if(tblEmployee.getSelectedRowCount()==1){
        String Name = txtName.getText();
        int EmployeeID = Integer.parseInt(txtEmployeeID.getText());
        int age = Integer.parseInt(txtAge.getText());
        String StartDate = txtStartdate.getText();
        String Level = txtLevel.getText();
        String TeamInfo = txtTeaminfo.getText();
        
        String ContactNo = txtCellNumber.getText();
        String Email = txtEmail.getText();
        
        model.setValueAt(Name, tblEmployee.getSelectedRow(),0);
        model.setValueAt(EmployeeID, tblEmployee.getSelectedRow(),1);
        //model.setValueAt(Age, tblEmployee.getSelectedRow(),2);
        //model.setValueAt(Gender, tblEmployee.getSelectedRow(),3);

        model.setValueAt(StartDate, tblEmployee.getSelectedRow(),4);
        model.setValueAt(Level, tblEmployee.getSelectedRow(),5);
        model.setValueAt(TeamInfo, tblEmployee.getSelectedRow(),6);
        
        model.setValueAt(ContactNo, tblEmployee.getSelectedRow(),8);
        model.setValueAt(Email, tblEmployee.getSelectedRow(),9);
        
        JOptionPane.showMessageDialog(this, "Following Row Has Been Successfully Changed");
        
        }
        else{
            if(tblEmployee.getSelectedRowCount()==0){
                JOptionPane.showMessageDialog(this, "Table is Empty");
            }
            else{
                JOptionPane.showMessageDialog(this, "Select A row to update");
            }
        }
        
        
        
       // int selectedRowIndex = tblEmployee.getSelectedRow();
        
       // if (selectedRowIndex<0){
            
       //     JOptionPane.showMessageDialog(this, "PLease select a row to delete.");
            
       //     return;
            
       // }
        
       // DefaultTableModel model = (DefaultTableModel) tblEmployee.getModel();
       // Employee selectedEmployees = (Employee) model.getValueAt(selectedRowIndex, 0);
       
        
       // txtEmployeeID.setText(String.valueOf(selectedEmployees.getEmplyeeID()));
        //txtAge.setText(String.valueOf(selectedEmplyees.getAge()));
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtLevelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLevelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLevelActionPerformed

    private void txtCellNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCellNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCellNumberActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtTeaminfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTeaminfoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTeaminfoActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
       
                
        int selectedRowIndex = tblEmployee.getSelectedRow();
       
        if (selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please Select a row to view");
            return;
        }
       
        DefaultTableModel model = (DefaultTableModel) tblEmployee.getModel();
        Employee selectedEmployee = (Employee) model.getValueAt(selectedRowIndex , 0);
       
        txtName.setText(String.valueOf(selectedEmployee.getName()));
        txtEmployeeID.setText(String.valueOf(selectedEmployee.getEmployeeID()));
        txtAge.setText(String.valueOf(selectedEmployee.getAge()));
        txtStartdate.setText(selectedEmployee.getStartDate());
        txtLevel.setText(String.valueOf(selectedEmployee.getLevel()));
        txtTeaminfo.setText(String.valueOf(selectedEmployee.getTeamInfo()));
        //txtPosition.setText(String.valueOf(selectedEmployee.getDesignation()));
        txtCellNumber.setText(String.valueOf(selectedEmployee.getCellNumber()));
        txtEmail.setText(String.valueOf(selectedEmployee.getEmail()));
        
       
        
        
    }//GEN-LAST:event_btnViewActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnView;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblCellNumber;
    private javax.swing.JLabel lblContactinfo;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEmplyeeId;
    private javax.swing.JLabel lblLevel;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblStartdate;
    private javax.swing.JLabel lblTeaminfo;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblEmployee;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtCellNumber;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEmployeeID;
    private javax.swing.JTextField txtLevel;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtStartdate;
    private javax.swing.JTextField txtTeaminfo;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblEmployee.getModel();
        model.setRowCount(0);
        
        for (Employee em : history.getHistory()){
            
            Object[] row = new Object[11];
            row[0] = em;
            row[1] = em.getEmployeeID();
            row[2] = em.getAge();
            row[3] = em.getGender();
            row[4] = em.getStartDate();
            row[5] = em.getLevel();
            row[6] = em.getTeamInfo();
            row[7] = em.getPositionTitle();
            row[8] = em.getCellNumber();
            row[9] = em.getEmail();
            row[10] = em.getPhoto();
            
            model.addRow(row);
            
            
        }
        
        
        
    }
    
    
}
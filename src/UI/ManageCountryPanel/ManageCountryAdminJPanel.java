/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.ManageCountryPanel;


import Business.Country.Country;
import Business.Employee.Employee;
import Business.Logger;
import Business.Role.CountryAdminRole;
import Business.Role.StateAdminRole;
import Business.State.State;
import Business.UserAccount.UserAccount;
import Business.WHO;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rohitjain
 */
public class ManageCountryAdminJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManagerCityRequestViewJPanel
     */
    JPanel userProcessContainer;
    Country country;
    WHO who;
    State state;

    public ManageCountryAdminJPanel(JPanel userProcessContainer, State state, Country country, WHO who) {
        initComponents();
        this.who = who;
        this.userProcessContainer = userProcessContainer;
        this.state = state;    
        this.country = country;
        countryTextField.setText(country.getCountryName());
        populateTable();
    }
   
   private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) stateJTable.getModel();
        model.setRowCount(0);
        
        for (State state : country.getStateDirectory().getStateList()) {
                for (UserAccount userAccount : state.getUserAccountDirectory().getUserAccountList()) {
                    Object[] row = new Object[2];
                    row[0] = state.getStateName();
                    row[1] = userAccount.getUsername();
                    model.addRow(row);
                }
            
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backJButton = new javax.swing.JButton();
        stateAdminTextBox = new javax.swing.JTextField();
        StateAdminUserID = new javax.swing.JTextField();
        stateAdminPwdLabel = new javax.swing.JLabel();
        stateAdminNameJLabel = new javax.swing.JLabel();
        stateAdminUserIdJLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        stateJTable = new javax.swing.JTable();
        stateAdminPasswordField = new javax.swing.JPasswordField();
        AddStateAdminjButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        countryTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(210, 215, 211));
        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        backJButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        backJButton.setForeground(new java.awt.Color(31, 58, 147));
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        stateAdminPwdLabel.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        stateAdminPwdLabel.setText("State Admin Password");

        stateAdminNameJLabel.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        stateAdminNameJLabel.setText("State Admin Name");

        stateAdminUserIdJLabel.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        stateAdminUserIdJLabel.setText("State Admin User Id");

        stateJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "State", "Username"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(stateJTable);

        AddStateAdminjButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        AddStateAdminjButton.setForeground(new java.awt.Color(52, 73, 94));
        AddStateAdminjButton.setText("Add State Admin");
        AddStateAdminjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddStateAdminjButtonActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 16)); // NOI18N
        jLabel4.setText("Country");

        countryTextField.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 110, 123));
        jLabel5.setText("STATE ADMIN");

        jLabel6.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        jLabel6.setText("W E L C O M E !!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(37, 37, 37)
                .addComponent(countryTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(backJButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(stateAdminUserIdJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stateAdminPwdLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                    .addComponent(stateAdminNameJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(StateAdminUserID, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stateAdminPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stateAdminTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 784, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(AddStateAdminjButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(countryTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stateAdminNameJLabel)
                    .addComponent(stateAdminTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stateAdminUserIdJLabel)
                    .addComponent(StateAdminUserID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stateAdminPwdLabel)
                    .addComponent(stateAdminPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(AddStateAdminjButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 138, Short.MAX_VALUE)
                .addComponent(backJButton)
                .addGap(26, 26, 26))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void AddStateAdminjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddStateAdminjButtonActionPerformed
        // TODO add your handling code here:
        
        
        
         if(stateAdminTextBox.getText().equals(""))
        {    
            JOptionPane.showMessageDialog(this, "Please enter state admin's name");
            stateAdminNameJLabel.setForeground(Color.red);
        }
        else if(StateAdminUserID.getText().equals(""))
        {    
            JOptionPane.showMessageDialog(this, "Please enter state admin's user id");
            stateAdminUserIdJLabel.setForeground(Color.red);
        }
        
        else if(StateAdminUserID.getText().contains(" "))
        {    
            JOptionPane.showMessageDialog(this, "User ID should not contain space");
            stateAdminUserIdJLabel.setForeground(Color.red);
        }
        
        else  if(String.valueOf(stateAdminPasswordField.getPassword()).equals(""))
        {
            JOptionPane.showMessageDialog(this, "Please enter state admin's password");
            stateAdminPwdLabel.setForeground(Color.red);
        }
        
        else  if(String.valueOf(stateAdminPasswordField.getPassword()).contains(" "))
        {
            JOptionPane.showMessageDialog(this, "Password should not contain space");
            stateAdminPwdLabel.setForeground(Color.red);
        }
       
        else
        {    
        String username =  StateAdminUserID.getText();
        if(who.checkIfUserIsUnique(username))
        {    
        String password = String.valueOf(stateAdminPasswordField.getPassword());
        String name = stateAdminTextBox.getText();
        Employee employee = state.getEmployeeDirectory().createEmployee(name);

        UserAccount account = state.getUserAccountDirectory().createUserAccount(username, password, employee, new StateAdminRole());
        populateTable();
        Logger.logDetails("ManageCountryAdminJPanel", "Add State Admin", "New Admin added: "+stateAdminTextBox.getText() + " By : " + account.getUsername());
        
        JOptionPane.showMessageDialog(this, "State Admin succesfully created");
        StateAdminUserID.setText("");
        stateAdminPasswordField.setText("");
        stateAdminTextBox.setText("");
        }
        
         else
         {
             JOptionPane.showMessageDialog(this, "Username already taken");
                 StateAdminUserID.setText("");
                stateAdminPasswordField.setText("");
                stateAdminTextBox.setText("");
         }
        
        }
        
    }//GEN-LAST:event_AddStateAdminjButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddStateAdminjButton;
    private javax.swing.JTextField StateAdminUserID;
    private javax.swing.JButton backJButton;
    private javax.swing.JTextField countryTextField;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel stateAdminNameJLabel;
    private javax.swing.JPasswordField stateAdminPasswordField;
    private javax.swing.JLabel stateAdminPwdLabel;
    private javax.swing.JTextField stateAdminTextBox;
    private javax.swing.JLabel stateAdminUserIdJLabel;
    private javax.swing.JTable stateJTable;
    // End of variables declaration//GEN-END:variables
}

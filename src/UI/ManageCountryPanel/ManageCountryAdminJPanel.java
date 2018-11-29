/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.ManageCountryPanel;


import Business.Country.Country;
import Business.Employee.Employee;
import Business.Role.CountryAdminRole;
import Business.State.State;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
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
    State state;

    public ManageCountryAdminJPanel(JPanel userProcessContainer, State state, Country country) {
        initComponents();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        stateJTable = new javax.swing.JTable();
        stateAdminPasswordField = new javax.swing.JPasswordField();
        AddStateAdminjButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        countryTextField = new javax.swing.JTextField();

        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("State Admin Password");

        jLabel2.setText("State Admin Name");

        jLabel3.setText("State Admin User Id");

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
                false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(stateJTable);

        AddStateAdminjButton.setText("Add State Admin");
        AddStateAdminjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddStateAdminjButtonActionPerformed(evt);
            }
        });

        jLabel4.setText("Country");

        countryTextField.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backJButton)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AddStateAdminjButton)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(stateAdminPasswordField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(stateAdminTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(StateAdminUserID, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(87, 87, 87))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(countryTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(countryTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(stateAdminTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(StateAdminUserID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(stateAdminPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backJButton)
                    .addComponent(AddStateAdminjButton))
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
        
        String username =  StateAdminUserID.getText();
        String password = String.valueOf(stateAdminPasswordField.getPassword());
        String name = stateAdminTextBox.getText();
        Employee employee = state.getEmployeeDirectory().createEmployee(name);
        UserAccount account = state.getUserAccountDirectory().createUserAccount(username, password, employee, new CountryAdminRole());
        populateTable();
        
    }//GEN-LAST:event_AddStateAdminjButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddStateAdminjButton;
    private javax.swing.JTextField StateAdminUserID;
    private javax.swing.JButton backJButton;
    private javax.swing.JTextField countryTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPasswordField stateAdminPasswordField;
    private javax.swing.JTextField stateAdminTextBox;
    private javax.swing.JTable stateJTable;
    // End of variables declaration//GEN-END:variables
}

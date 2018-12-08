/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.ManageState;


import Business.City.City;
import Business.Country.Country;
import Business.Employee.Employee;
import Business.Role.AuditorRole;
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
public class ManageStateAdminAuditorJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManagerCityRequestViewJPanel
     */
    JPanel userProcessContainer;
    Country country;
    State state;
    City city;
    private WHO who;
    public ManageStateAdminAuditorJPanel(JPanel userProcessContainer, State state, Country country, City city,WHO who) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.state = state;    
        this.country = country;
        this.city = city;
        countryTextField.setText(country.getCountryName());
        stateTextField.setText(state.getStateName());
        this.who=who;
        populateTable();
    }
   
   private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) cityJTable.getModel();
        model.setRowCount(0);
        
        for (City city : state.getCityDirectory().getCityList()) {
                for (UserAccount userAccount : city.getUserAccountDirectory().getUserAccountList()) {
                    Object[] row = new Object[3];
                    row[0] = city.getCityName();
                    row[1] = userAccount.getUsername();
                    row[2] = userAccount.getRole();
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
        cityAuditorTextBox = new javax.swing.JTextField();
        cityAuditorUserID = new javax.swing.JTextField();
        cityAuditorPasswordJLabel = new javax.swing.JLabel();
        cityAuditorNameJLabel = new javax.swing.JLabel();
        cityAuditoruserIdJLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        cityJTable = new javax.swing.JTable();
        cityAuditorPasswordField = new javax.swing.JPasswordField();
        AddCityAuditorjButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        countryTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        stateTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(210, 215, 211));
        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        backJButton.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        backJButton.setForeground(new java.awt.Color(31, 58, 147));
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        cityAuditorPasswordJLabel.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        cityAuditorPasswordJLabel.setText("City Auditor Password");

        cityAuditorNameJLabel.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        cityAuditorNameJLabel.setText("City Auditor Name");

        cityAuditoruserIdJLabel.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        cityAuditoruserIdJLabel.setText("City Auditor User Id");

        cityJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "City", "Username", "Role"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(cityJTable);

        AddCityAuditorjButton.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        AddCityAuditorjButton.setForeground(new java.awt.Color(219, 10, 91));
        AddCityAuditorjButton.setText("Add City Auditor");
        AddCityAuditorjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddCityAuditorjButtonActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel4.setText("Country");

        countryTextField.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel5.setText("State");

        stateTextField.setEnabled(false);

        jLabel6.setBackground(new java.awt.Color(51, 110, 123));
        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 110, 123));
        jLabel6.setText("ADD AUDITOR ");

        jLabel7.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        jLabel7.setText("W E L C O M E !!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addGap(40, 40, 40))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(stateTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                    .addComponent(countryTextField)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cityAuditoruserIdJLabel)
                    .addComponent(cityAuditorNameJLabel)
                    .addComponent(cityAuditorPasswordJLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AddCityAuditorjButton)
                    .addComponent(cityAuditorUserID, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cityAuditorTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cityAuditorPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(119, 119, 119))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 772, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(backJButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(countryTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cityAuditorNameJLabel)
                    .addComponent(cityAuditorTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cityAuditoruserIdJLabel)
                    .addComponent(cityAuditorUserID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(cityAuditorPasswordJLabel))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cityAuditorPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(45, 45, 45)
                .addComponent(AddCityAuditorjButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(backJButton)
                .addGap(43, 43, 43))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void AddCityAuditorjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddCityAuditorjButtonActionPerformed
        // TODO add your handling code here:
        
        if(cityAuditorTextBox.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this, "Please enter a value for city auditor's name");
            cityAuditorNameJLabel.setForeground(Color.red);
        }
        
        else if(cityAuditorUserID.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this, "Please enter a value for city user id");
            cityAuditoruserIdJLabel.setForeground(Color.red);
        }
        
        else if(cityAuditorPasswordField.getPassword().equals(""))
        {
            JOptionPane.showMessageDialog(this, "Please enter a value for city admin's password");
            cityAuditorPasswordJLabel.setForeground(Color.red);
        }
        
        else
        {
            
        String username =  cityAuditorUserID.getText();
       //  String username =  cityAdminUserID.getText();
         if(who.checkIfUserIsUnique(username))
         {
        String password = String.valueOf(cityAuditorPasswordField.getPassword());
        String name = cityAuditorTextBox.getText();
        Employee employee = city.getEmployeeDirectory().createEmployee(name);
        UserAccount account = city.getUserAccountDirectory().createUserAccount(username, password, employee, new AuditorRole());
        populateTable();
         }
         else
         {
             JOptionPane.showMessageDialog(this, "Username already exist");
         }
        }
    }//GEN-LAST:event_AddCityAuditorjButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddCityAuditorjButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel cityAuditorNameJLabel;
    private javax.swing.JPasswordField cityAuditorPasswordField;
    private javax.swing.JLabel cityAuditorPasswordJLabel;
    private javax.swing.JTextField cityAuditorTextBox;
    private javax.swing.JTextField cityAuditorUserID;
    private javax.swing.JLabel cityAuditoruserIdJLabel;
    private javax.swing.JTable cityJTable;
    private javax.swing.JTextField countryTextField;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField stateTextField;
    // End of variables declaration//GEN-END:variables
}

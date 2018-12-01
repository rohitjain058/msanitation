/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import Business.UserAccount.UserAccount;
import UI.ManageCityPanel.ManageCityJPanel;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import Business.*;
import Business.City.City;
import Business.City.CityDirectory;
import Business.State.State;
import Business.Country.CountryDirectory;
import Business.Country.Country;
import javax.swing.JPanel;
import Business.UserAccount.UserAccountDirectory;
import Business.UserAccount.UserAccount;
import Business.DB4OUtil.DB4OUtil;
import Business.Request.RequestID;
import Business.Request.Requestor;
import Business.Request.Status;
import Business.Role.Role;
import java.util.Date;
import java.util.Random;



/**
 *
 * @author VAIBHAV RAJ
 */
public class MainFrame1 extends javax.swing.JFrame {
    private WHO system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();

    /**
     * Creates new form MainFrame1
     */
    public MainFrame1() {
        
        initComponents();
        system = dB4OUtil.retrieveSystem();
        this.setSize(1680, 1050);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SplitPane = new javax.swing.JSplitPane();
        UserInputPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        UserNameTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        PasswordField = new javax.swing.JPasswordField();
        LoginButton = new javax.swing.JButton();
        LogoutButton = new javax.swing.JButton();
        container = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("W E L C O M E !!");

        jLabel2.setText("User Name");

        jLabel3.setText("Password");

        LoginButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        LoginButton.setText("LOGIN");
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });

        LogoutButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        LogoutButton.setText("LOG-OUT");
        LogoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout UserInputPanelLayout = new javax.swing.GroupLayout(UserInputPanel);
        UserInputPanel.setLayout(UserInputPanelLayout);
        UserInputPanelLayout.setHorizontalGroup(
            UserInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UserInputPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(UserInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(UserInputPanelLayout.createSequentialGroup()
                        .addGroup(UserInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(UserNameTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PasswordField, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(UserInputPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(UserInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LogoutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LoginButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        UserInputPanelLayout.setVerticalGroup(
            UserInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UserInputPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UserNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(LoginButton)
                .addGap(18, 18, 18)
                .addComponent(LogoutButton)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        SplitPane.setLeftComponent(UserInputPanel);

        container.setLayout(new java.awt.CardLayout());
        SplitPane.setRightComponent(container);

        getContentPane().add(SplitPane, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
        // TODO add your handling code here:
        // Get user name
     //  ConfigureASystem.configure();
        String userName = UserNameTextField.getText();
        // Get Password
        char[] passwordCharArray = PasswordField.getPassword();
        String password = String.valueOf(passwordCharArray);
        
        //Step1: Check in the system admin user account directory if you have the user
      UserAccount userAccount=null;
        try
       {
        userAccount=system.getUserAccountDirectory().authenticateUser(userName, password);
       }
       catch(Exception ex)
       {
           System.out.println(ex.getMessage());
       }
        State inState=null;
        City inCity=null;
        Country inCountry=null;
        if(userAccount==null){
            //Step 2: Go inside each network and check each enterprise
            for(Country country:system.getCountryList()){
                userAccount=country.getUserAccountDirectory().authenticateUser(userName, password);
                inCountry=country;
         RequestID request=new RequestID();
        request.setRequestID(1);
        Date date= new Date();

	 long time = date.getTime();
        request.setRequestNo(time+"");
        Status status=new Status(1,"Unknown");
        Requestor requestor=new Requestor(1,"Rohit","rohit.jain058@gmail.com");
        request.setStatus(status);
        request.setRequestor(requestor);
        country.getRequestList().add(request);
        if(userAccount==null)
                {
                    
                //Step 2.a: check against each enterprise
                for(State state:country.getStateDirectory().getStateList()){
                    userAccount=state.getUserAccountDirectory().authenticateUser(userName, password);
                    inState=state;
                            country.getRequestList().add(request);
                    if(userAccount==null){
                       //Step 3:check against each organization for each enterprise
                       for(City city:state.getCityDirectory().getCityList()){
                           userAccount=city.getUserAccountDirectory().authenticateUser(userName, password);
                           if(userAccount!=null){
                               //inState=state;
                                       city.getRequestList().add(request);
                               inCity=city;
                               break;
                           }
                       }
                        
                    }
                    else{
                       inState=state;
                       break;
                    }
                    if(inCity!=null){
                        break;
                    }  
                }
                if(inState!=null){
                    break;
                }
            }
            else
                {
                    break;
                }
            }
        }
        
        if(userAccount==null){
            JOptionPane.showMessageDialog(null, "Invalid credentials");
            return;
        }
        else{
            CardLayout layout=(CardLayout)container.getLayout();

            container.add("workArea",userAccount.getRole().createWorkArea(container, userAccount, inCity, inState, inCountry,system));
            layout.next(container);
        }
        
        LoginButton.setEnabled(false);
        LogoutButton.setEnabled(true);
        UserNameTextField.setEnabled(false);
        PasswordField.setEnabled(false);
    }//GEN-LAST:event_LoginButtonActionPerformed

    private void LogoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutButtonActionPerformed
        // TODO add your handling code here:
        LogoutButton.setEnabled(false);
        UserNameTextField.setEnabled(true);
        PasswordField.setEnabled(true);
        LoginButton.setEnabled(true);

        UserNameTextField.setText("");
        PasswordField.setText("");

        container.removeAll();
        JPanel blankJP = new JPanel();
        container.add("blank", blankJP);
        CardLayout crdLyt = (CardLayout) container.getLayout();
        crdLyt.next(container);
        dB4OUtil.storeSystem(system);
    }//GEN-LAST:event_LogoutButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LoginButton;
    private javax.swing.JButton LogoutButton;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JSplitPane SplitPane;
    private javax.swing.JPanel UserInputPanel;
    private javax.swing.JTextField UserNameTextField;
    private javax.swing.JPanel container;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}

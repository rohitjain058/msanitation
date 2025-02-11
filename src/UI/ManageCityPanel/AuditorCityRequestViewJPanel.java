/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.ManageCityPanel;

import Business.OpenLocation;
import Business.Request.Request;
import java.awt.CardLayout;
import java.awt.Component;
import java.net.URL;
import javax.swing.JPanel;

/**
 *
 * @author VAIBHAV RAJ
 */
public class AuditorCityRequestViewJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AuditorCityRequestViewJPanel
     */
    JPanel userProcessContainer;
    Request request;
    public AuditorCityRequestViewJPanel(JPanel userProcessContainer,Request request) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.request=request;
        RequestIdTextBox.setText(request.getRequestNo());
        RequestorNameTextBox.setText(request.getRequestor().getRequestorName());
        RequestorEmail.setText(request.getRequestor().getRequestorEmail());
        statusTextField.setText(request.getStatus().getStatusMsg());
        notes.setText(request.getStatus().getStatusMsg());
       // budgetTb.setText(request.getBudget()+"");
        checkStatusForEnability();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        RequestIdTextBox = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        RequestorNameTextBox = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        RequestorEmail = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        Accept = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        notes = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        statusTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        RejectButtonJButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        viewLocation = new javax.swing.JButton();

        setBackground(new java.awt.Color(210, 215, 211));
        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setText("Request No");

        RequestIdTextBox.setEditable(false);
        RequestIdTextBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RequestIdTextBoxActionPerformed(evt);
            }
        });

        jLabel3.setText("Requestor Name");

        RequestorNameTextBox.setEditable(false);

        jLabel1.setText("Requestor Email");

        RequestorEmail.setEditable(false);

        backJButton.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        backJButton.setForeground(new java.awt.Color(31, 58, 147));
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        jLabel4.setText("Notes");

        Accept.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        Accept.setForeground(new java.awt.Color(52, 73, 94));
        Accept.setText("Accept");
        Accept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcceptActionPerformed(evt);
            }
        });

        notes.setColumns(20);
        notes.setRows(5);
        jScrollPane1.setViewportView(notes);

        jLabel5.setText("Status");

        statusTextField.setEnabled(false);

        jLabel6.setBackground(new java.awt.Color(210, 215, 211));
        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 110, 123));
        jLabel6.setText("AUDITOR REVIEW PANEL");

        RejectButtonJButton.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        RejectButtonJButton.setForeground(new java.awt.Color(52, 73, 94));
        RejectButtonJButton.setText("Reject");
        RejectButtonJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RejectButtonJButtonActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel7.setText("Location:");

        viewLocation.setText("View Location");
        viewLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewLocationActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(119, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel4))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                                        .addComponent(statusTextField)
                                        .addComponent(RequestorEmail, javax.swing.GroupLayout.Alignment.TRAILING)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel7))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(viewLocation)
                                        .addComponent(RequestIdTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(RequestorNameTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(backJButton)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(235, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Accept)
                .addGap(39, 39, 39)
                .addComponent(RejectButtonJButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(RequestIdTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(viewLocation))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(RequestorNameTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(RequestorEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(statusTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Accept)
                    .addComponent(RejectButtonJButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backJButton)
                .addGap(21, 21, 21))
        );
    }// </editor-fold>//GEN-END:initComponents
    private void checkStatusForEnability()
    {
         if(request.getStatus().getStatusId()==2 )
                {
                   // budgetTb.setEditable(true);
                    notes.setEditable(true);
                    Accept.setEnabled(true);
                    RejectButtonJButton.setEnabled(true);
                   // revertBtn.setEnabled(true);
                }
         else
         {
                 //   budgetTb.setEditable(false);
                    notes.setEditable(false);
                    Accept.setEnabled(false);
                    RejectButtonJButton.setEnabled(false);
                   // revertBtn.setEnabled(false);
         }
    }
 
    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        //CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        //layout.previous(userProcessContainer);
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        AuditorCityJPanel aurditorCityPanel = (AuditorCityJPanel) component;
        aurditorCityPanel.populateRequestTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }//GEN-LAST:event_backJButtonActionPerformed

    private void RequestIdTextBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RequestIdTextBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RequestIdTextBoxActionPerformed

    private void AcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AcceptActionPerformed
        // TODO add your handling code here:
        request.getStatus().setStatusMsg(notes.getText());
        request.getStatus().setStatusId(4);
                checkStatusForEnability();

    }//GEN-LAST:event_AcceptActionPerformed

    private void RejectButtonJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RejectButtonJButtonActionPerformed
        // TODO add your handling code here:
        request.getStatus().setStatusMsg(notes.getText());
        request.getStatus().setStatusId(11);
        checkStatusForEnability();
    }//GEN-LAST:event_RejectButtonJButtonActionPerformed

    private void viewLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewLocationActionPerformed
        // TODO add your handling code here:
        try
        {
            String url="https://www.google.com/maps/search/?api=1&query="+request.getLat()+","+request.getLong();
            OpenLocation.openWebpage(new URL(url));
        }
        catch(Exception ex)
        {
            System.out.print(ex.getMessage());
        }
    }//GEN-LAST:event_viewLocationActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Accept;
    private javax.swing.JButton RejectButtonJButton;
    private javax.swing.JTextField RequestIdTextBox;
    private javax.swing.JTextField RequestorEmail;
    private javax.swing.JTextField RequestorNameTextBox;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea notes;
    private javax.swing.JTextField statusTextField;
    private javax.swing.JButton viewLocation;
    // End of variables declaration//GEN-END:variables
}

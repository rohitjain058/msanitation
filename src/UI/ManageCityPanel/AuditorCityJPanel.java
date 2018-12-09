/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.ManageCityPanel;

import Business.City.City;
import Business.Country.Country;
import Business.Request.Request;
import Business.Request.Requestor;
import Business.Request.Status;
import Business.State.State;
import Business.UserAccount.UserAccount;
import Business.WHO;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;
import java.util.HashMap;

/**
 *
 * @author VAIBHAV RAJ
 */
public class AuditorCityJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AuditorCityJPanel
     */
    HashMap<Integer,Request> requestList;
    
    UserAccount userAccount;
    JPanel userProcessContainer;
    public AuditorCityJPanel(JPanel userProcessContainer, UserAccount account,City city, 
            State state,
            Country country,
            WHO business)  
    {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.requestList=city.getRequestList();
     this.userAccount=account;
//        RequestID request=new RequestID();
//        request.setRequestID(1);
//        request.setRequestNo("889");
//        Status status=new Status(1,"New");
//        Requestor requestor=new Requestor(1,"Rohit","rohit.jain058@gmail.com");
//        request.setStatus(status);
//        request.setRequestor(requestor);
//        requestList.add(request);
        this.userAccount=account;
//        account.setUsername("rohit");
//        account.setPassword("rohit");
//        city.setCityID(1);
//        city.setCityName("Mumbai");
        
        //Populate the requesting status table
        //requestList1=new ArrayList<RequestID>();
 
        
        populateRequestTable();
         

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ScrollJPane1 = new javax.swing.JScrollPane();
        newRequestJTable = new javax.swing.JTable();
        ScrollPane2 = new javax.swing.JScrollPane();
        newRequestJTable1 = new javax.swing.JTable();
        backJButton = new javax.swing.JButton();
        AssignRequest = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(210, 215, 211));
        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        newRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "RequestID", "Name", "Date", "Status", "EmailId", "Phone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ScrollJPane1.setViewportView(newRequestJTable);

        newRequestJTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "RequestID", "Name", "Date", "Status", "Email Id", "Phone No"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ScrollPane2.setViewportView(newRequestJTable1);

        backJButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        backJButton.setForeground(new java.awt.Color(31, 58, 147));
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        AssignRequest.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        AssignRequest.setForeground(new java.awt.Color(52, 73, 94));
        AssignRequest.setText("ASSIGN TO ME");
        AssignRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AssignRequestActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton1.setForeground(new java.awt.Color(52, 73, 94));
        jButton1.setText("AUDIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 110, 123));
        jLabel1.setText("AUDITOR");

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel2.setText("Current Queue Requests");

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel3.setText("Processed Requests in Queue");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(415, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(AssignRequest)
                        .addContainerGap(346, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(backJButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 584, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(ScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 693, Short.MAX_VALUE)
                    .addComponent(ScrollJPane1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(ScrollJPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(AssignRequest)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(backJButton)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void AssignRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AssignRequestActionPerformed

         if(!(newRequestJTable.getSelectedRow()<0)  )
        {
            Request requestID = (Request) newRequestJTable.getValueAt(newRequestJTable.getSelectedRow(), 0);
           // AuditorCityRequestViewJPanel mcvjp = new AuditorCityRequestViewJPanel(userProcessContainer, requestID);
            //userProcessContainer.add(mcvjp);
            //CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            //layout.next(userProcessContainer);
           // newRequestJTable.getSelectionModel().clearSelection();
            //RequestID request = (RequestID)newRequestJTable.getValueAt(newRequestJTable.getSelectedRowCount(), 0);
        requestID.setUserAccount(userAccount);
        requestID.getStatus().setStatusId(3);
       // userAccount.getWorkQueue().
        
        populateRequestTable();
        
        }
    }//GEN-LAST:event_AssignRequestActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(!(newRequestJTable1.getSelectedRow()<0)  )
        {
            Request requestID = (Request) newRequestJTable1.getValueAt(newRequestJTable1.getSelectedRow(), 0);
            AuditorCityRequestViewJPanel mcvjp = new AuditorCityRequestViewJPanel(userProcessContainer, requestID);
            userProcessContainer.add(mcvjp);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
           // newRequestJTable.getSelectionModel().clearSelection();
            //RequestID request = (RequestID)newRequestJTable.getValueAt(newRequestJTable.getSelectedRowCount(), 0);
//        requestID.setUserAccount(userAccount);
//        requestID.getStatus().setStatusId(3);
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AssignRequest;
    private javax.swing.JScrollPane ScrollJPane1;
    private javax.swing.JScrollPane ScrollPane2;
    private javax.swing.JButton backJButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTable newRequestJTable;
    private javax.swing.JTable newRequestJTable1;
    // End of variables declaration//GEN-END:variables

    protected void populateRequestTable() {
        
        System.out.println("Inside populate");
     
                        DefaultTableModel model = (DefaultTableModel) newRequestJTable.getModel();
        
        model.setRowCount(0);
                DefaultTableModel model1 = (DefaultTableModel) newRequestJTable1.getModel();
        
        model1.setRowCount(0);
        
        for (Request request : requestList.values()){
            if(request.getStatus().getStatusId()==2)
            {

            Object[] row = new Object[6];
            row[0] = request;
            row[1] = request.getRequestor().getRequestorName();
            row[2]=request.getDateTime();
            row[3] = request.getStatus();
            row[4] = request.getRequestor().getRequestorEmail();
            row[5] = request.getRequestor().getRequestorPhoneNumber();
            model.addRow(row);
            }
            else if(request.getStatus().getStatusId()==3 && request.getUserAccount().getUsername().equals(userAccount.getUsername()))
        {
            
        
     
            Object[] row = new Object[6];
            row[0] = request;
            row[1] = request.getRequestor().getRequestorName();
            row[2]=request.getDateTime();
            row[3] = request.getStatus();
            row[4] = request.getRequestor().getRequestorEmail();
            row[5] = request.getRequestor().getRequestorPhoneNumber();
            model1.addRow(row);
        
       }
        
                
            
     }
    }
}

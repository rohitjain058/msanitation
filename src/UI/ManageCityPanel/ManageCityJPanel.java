/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.ManageCityPanel;

import Business.City.City;
import Business.Country.Country;
import Business.Request.Request;
import Business.State.State;
import Business.UserAccount.UserAccount;
import Business.WHO;
import java.awt.CardLayout;
import java.util.HashMap;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rohitjain
 */
public class ManageCityJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageCityJPanel
     */
    HashMap<Integer,Request> requestList;
 //   ArrayList<Request> requestList1;
    JPanel userProcessContainer;
    public ManageCityJPanel(JPanel userProcessContainer, UserAccount account,City city, 
            State state,
            Country country,
            WHO business) 
    {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        //requestList=new ArrayList<RequestID>();
        this.requestList=city.getRequestList();
        
//        account.setUsername("rohit");
//        account.setPassword("rohit");
//        city.setCityID(1);
//        city.setCityName("Mumbai");
        
        //Populate the requesting status table
        //requestList1=new ArrayList<RequestID>();
       
        
        populatNewRequestTable();
         

        
    }


protected void populatNewRequestTable()
{
    
    System.out.println("Inside populate");
     
                        DefaultTableModel model = (DefaultTableModel) newRequestJTable.getModel();
        
        model.setRowCount(0);
                DefaultTableModel model1 = (DefaultTableModel) newRequestJTable1.getModel();
        
        model1.setRowCount(0);
        
        for (Request request : requestList.values()){
            if(request.getStatus().getStatusId()==0 || request.getStatus().getStatusId()==1 || request.getStatus().getStatusId()==4 || request.getStatus().getStatusId()==6)
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
            else if(request.getStatus().getStatusId()==2 || request.getStatus().getStatusId()==3 || request.getStatus().getStatusId()==7 || request.getStatus().getStatusId()==7)
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
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        newRequestJTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        newRequestJTable1 = new javax.swing.JTable();
        acceptRequest = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        viewRequest = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(210, 215, 211));
        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setForeground(new java.awt.Color(51, 110, 123));

        newRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Request No", "Name", "Date", "Status", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(newRequestJTable);

        newRequestJTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "RequestNo", "Name", "Date", "Status", "Email Id"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(newRequestJTable1);

        acceptRequest.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        acceptRequest.setForeground(new java.awt.Color(219, 10, 91));
        acceptRequest.setText("Accept");
        acceptRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptRequestActionPerformed(evt);
            }
        });

        backJButton.setFont(new java.awt.Font("Arial Black", 1, 16)); // NOI18N
        backJButton.setForeground(new java.awt.Color(31, 58, 147));
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        viewRequest.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        viewRequest.setForeground(new java.awt.Color(219, 10, 91));
        viewRequest.setText("View Request");
        viewRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewRequestActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 110, 123));
        jLabel1.setText("MANAGER");

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel2.setText("Current Queue Requests");

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel3.setText("Processed Requests in Queue");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(backJButton))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(101, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 761, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(212, 212, 212))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 764, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(212, 212, 212))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(419, 419, 419)
                        .addComponent(acceptRequest))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(393, 393, 393)
                        .addComponent(viewRequest)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(acceptRequest)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(viewRequest)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                .addComponent(backJButton)
                .addGap(44, 44, 44))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viewRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewRequestActionPerformed

 if(!(newRequestJTable1.getSelectedRow()<0))
        {
            Request requestID1 = (Request) newRequestJTable1.getValueAt(newRequestJTable1.getSelectedRow(), 0);
            ManagerCityRequestViewJPanel mcvjp1 = new ManagerCityRequestViewJPanel(userProcessContainer, requestID1);
            userProcessContainer.add(mcvjp1);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        //    newRequestJTable1.getSelectionModel().clearSelection();
        }

    }//GEN-LAST:event_viewRequestActionPerformed

    public void AcceptRequest(Request requestID)
    {
         
        
    }
    
    
    
    
    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void acceptRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptRequestActionPerformed
        // TODO add your handling code here:
          if(!(newRequestJTable.getSelectedRow()<0)  )
        {
            Request requestID = (Request) newRequestJTable.getValueAt(newRequestJTable.getSelectedRow(), 0);
//            AuditorCityRequestViewJPanel mcvjp = new AuditorCityRequestViewJPanel(userProcessContainer, requestID);
//            userProcessContainer.add(mcvjp);
//            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
//            layout.next(userProcessContainer);
//            newRequestJTable.getSelectionModel().clearSelection();
    //        RequestID request = (RequestID)newRequestJTable.getValueAt(newRequestJTable.getSelectedRow(), 0);
       // request.setUserAccount(userAccount);
        requestID.getStatus().setStatusId(2);
       // userAccount.getWorkQueue().
        
        populatNewRequestTable();
        
        }
    }//GEN-LAST:event_acceptRequestActionPerformed
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acceptRequest;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable newRequestJTable;
    private javax.swing.JTable newRequestJTable1;
    private javax.swing.JButton viewRequest;
    // End of variables declaration//GEN-END:variables
}

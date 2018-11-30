/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.ManageCityPanel;

import Business.City.City;
import Business.Country.Country;
import Business.Request.RequestID;
import Business.Request.Requestor;
import Business.Request.Status;
import Business.State.State;
import Business.UserAccount.UserAccount;
import Business.WHO;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
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
    ArrayList<RequestID> requestList;
    ArrayList<RequestID> requestList1;
    JPanel userProcessContainer;
    public ManageCityJPanel(JPanel userProcessContainer, UserAccount account,City city, 
            State state,
            Country country,
            WHO business) 
    {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        requestList=new ArrayList<RequestID>();
        RequestID request=new RequestID();
        request.setRequestID(1);
        request.setRequestNo("889");
        Status status=new Status(1,"New");
        Requestor requestor=new Requestor(1,"Rohit","rohit.jain058@gmail.com");
        request.setStatus(status);
        request.setRequestor(requestor);
        requestList.add(request);
        
//        account.setUsername("rohit");
//        account.setPassword("rohit");
//        city.setCityID(1);
//        city.setCityName("Mumbai");
        
        //Populate the requesting status table
        //requestList1=new ArrayList<RequestID>();
        RequestID request1=new RequestID();
        request1.setRequestID(200);
        request1.setRequestNo("100");
        Status status1=new Status(2,"In Process");
        Requestor requestor1=new Requestor(2,"Avinash","avinash.chourasiya787@gmail.com");
        request1.setStatus(status1);
        request1.setRequestor(requestor1);
        requestList.add(request1);
        
        populatNewRequestTable(requestList);
         

        
    }
public void refreshTable()
{
     populatNewRequestTable(requestList);
}

private void populatNewRequestTable(ArrayList<RequestID> requestList )
{
    
    System.out.println("Inside populate");
     
                        DefaultTableModel model = (DefaultTableModel) newRequestJTable.getModel();
        
        model.setRowCount(0);
                DefaultTableModel model1 = (DefaultTableModel) newRequestJTable1.getModel();
        
        model1.setRowCount(0);
        
        for (RequestID request : requestList){
            if(request.getStatus().getStatusId()==1)
            {

            Object[] row = new Object[4];
            row[0] = request;
            row[1] = request.getRequestor().getRequestorName();
            row[2]=request.getDateTime();
            row[3] = request.getStatus();
            model.addRow(row);
            }
        else
        {

     
            Object[] row = new Object[4];
            row[0] = request;
            row[1] = request.getRequestor().getRequestorName();
            row[2]=request.getDateTime();
            row[3] = request.getStatus();
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        newRequestJTable = new javax.swing.JTable();
        viewRequest = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        newRequestJTable1 = new javax.swing.JTable();

        newRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "RequestID", "Name", "Date", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(newRequestJTable);

        viewRequest.setText("View Request");
        viewRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewRequestActionPerformed(evt);
            }
        });

        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        newRequestJTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "RequestID", "Name", "Date", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(newRequestJTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(backJButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 154, Short.MAX_VALUE)
                .addComponent(viewRequest)
                .addGap(175, 175, 175))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewRequest)
                    .addComponent(backJButton))
                .addGap(48, 48, 48))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 775, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 424, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viewRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewRequestActionPerformed

        if(!(newRequestJTable.getSelectedRow()<0)  )
        {
        RequestID requestID = (RequestID) newRequestJTable.getValueAt(newRequestJTable.getSelectedRow(), 0);
        ManagerCityRequestViewJPanel mcvjp = new ManagerCityRequestViewJPanel(userProcessContainer, requestID);
        userProcessContainer.add(mcvjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        newRequestJTable.getSelectionModel().clearSelection();
      
        }
        else if(!(newRequestJTable1.getSelectedRow()<0))
        {
            RequestID requestID1 = (RequestID) newRequestJTable1.getValueAt(newRequestJTable1.getSelectedRow(), 0);
            ManagerCityRequestViewJPanel mcvjp1 = new ManagerCityRequestViewJPanel(userProcessContainer, requestID1);
            userProcessContainer.add(mcvjp1);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
            newRequestJTable1.getSelectionModel().clearSelection();
        }

    }//GEN-LAST:event_viewRequestActionPerformed

    public void AcceptRequest(RequestID requestID)
    {
         
        
    }
    
    
    
    
    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable newRequestJTable;
    private javax.swing.JTable newRequestJTable1;
    private javax.swing.JButton viewRequest;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.SalesInvoice.View;

import com.SalesInvoice.Controller.Controller;
import com.SalesInvoice.Model.SalesInvoice;
import com.SalesInvoice.Model.SalesInvoicesTableModel;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JTable;

/**
 *
 * @author Moez.Mohamed
 */
public class SalesInvoiceJFrame extends javax.swing.JFrame {

    /**
     * Creates new form SalesInvoiceJFrame
     */
    public SalesInvoiceJFrame() {
        initComponents();
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
        salesInvoiceTable = new javax.swing.JTable();
        salesInvoiceTable.getSelectionModel().addListSelectionListener(controller);
        createNewInvoiceButton = new javax.swing.JButton();
        createNewInvoiceButton.addActionListener(controller);
        deleteInvoiceButton = new javax.swing.JButton();
        deleteInvoiceButton.addActionListener(controller);
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        InvoiceNumberLabel = new javax.swing.JLabel();
        InvoiceDateLabel = new javax.swing.JLabel();
        CustNameLabel = new javax.swing.JLabel();
        InvoiceTotalLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        invoiceItemTable = new javax.swing.JTable();
        createNewItemButton = new javax.swing.JButton();
        createNewItemButton.addActionListener(controller);
        deleteItemButton = new javax.swing.JButton();
        deleteItemButton.addActionListener(controller);
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        LoadFileMenuItem = new javax.swing.JMenuItem();
        LoadFileMenuItem.addActionListener(controller);
        SaveFileMenuItem = new javax.swing.JMenuItem();
        SaveFileMenuItem.addActionListener(controller);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        salesInvoiceTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(salesInvoiceTable);

        createNewInvoiceButton.setText("Create New Invoice");

        deleteInvoiceButton.setText("Delete Invoice");
        deleteInvoiceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteInvoiceButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Invoice Number");

        jLabel2.setText("Invoice Date");

        jLabel3.setText("Customer Name");

        jLabel4.setText("Invoice Total");

        invoiceItemTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(invoiceItemTable);

        createNewItemButton.setText("Create New Item");

        deleteItemButton.setText("Delete Item");

        jMenu1.setText("File");

        LoadFileMenuItem.setText("Load File");
        LoadFileMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoadFileMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(LoadFileMenuItem);

        SaveFileMenuItem.setText("Save File");
        jMenu1.add(SaveFileMenuItem);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(createNewInvoiceButton)
                        .addGap(91, 91, 91)
                        .addComponent(deleteInvoiceButton))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(InvoiceTotalLabel)
                            .addComponent(CustNameLabel)
                            .addComponent(InvoiceDateLabel)
                            .addComponent(InvoiceNumberLabel))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(createNewItemButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(deleteItemButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(InvoiceNumberLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(InvoiceDateLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(CustNameLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(InvoiceTotalLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2))
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(createNewInvoiceButton)
                        .addComponent(deleteInvoiceButton)
                        .addComponent(createNewItemButton))
                    .addComponent(deleteItemButton))
                .addGap(69, 69, 69))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deleteInvoiceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteInvoiceButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteInvoiceButtonActionPerformed

    private void LoadFileMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoadFileMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LoadFileMenuItemActionPerformed

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
            java.util.logging.Logger.getLogger(SalesInvoiceJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SalesInvoiceJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SalesInvoiceJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SalesInvoiceJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SalesInvoiceJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CustNameLabel;
    private javax.swing.JLabel InvoiceDateLabel;
    private javax.swing.JLabel InvoiceNumberLabel;
    private javax.swing.JLabel InvoiceTotalLabel;
    private javax.swing.JMenuItem LoadFileMenuItem;
    private javax.swing.JMenuItem SaveFileMenuItem;
    private javax.swing.JButton createNewInvoiceButton;
    private javax.swing.JButton createNewItemButton;
    private javax.swing.JButton deleteInvoiceButton;
    private javax.swing.JButton deleteItemButton;
    private javax.swing.JTable invoiceItemTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable salesInvoiceTable;
    // End of variables declaration//GEN-END:variables
    private ArrayList<SalesInvoice>SalesInvoices;
    private Controller controller = new Controller (this) ;
    private SalesInvoicesTableModel salesInvoicesTableModel ;
   
    
    public ArrayList<SalesInvoice> getSalesInvoices() {
        return SalesInvoices;
    }

    public void setSalesInvoices(ArrayList<SalesInvoice> SalesInvoices) {
        this.SalesInvoices = SalesInvoices;
    }

    public JLabel getCustNameLabel() {
        return CustNameLabel;
    }

    public void setCustNameLabel(JLabel CustNameLabel) {
        this.CustNameLabel = CustNameLabel;
    }

    public JLabel getInvoiceDateLabel() {
        return InvoiceDateLabel;
    }

    public void setInvoiceDateLabel(JLabel InvoiceDateLabel) {
        this.InvoiceDateLabel = InvoiceDateLabel;
    }

    public JLabel getInvoiceNumberLabel() {
        return InvoiceNumberLabel;
    }

    public void setInvoiceNumberLabel(JLabel InvoiceNumberLabel) {
        this.InvoiceNumberLabel = InvoiceNumberLabel;
    }

    public JTable getInvoiceItemTable() {
        return invoiceItemTable;
    }

    public void setInvoiceItemTable(JTable invoiceItemTable) {
        this.invoiceItemTable = invoiceItemTable;
    }

    public JTable getSalesInvoiceTable() {
        return salesInvoiceTable;
    }

    public void setSalesInvoiceTable(JTable salesInvoiceTable) {
        this.salesInvoiceTable = salesInvoiceTable;
    }

    public Controller getController() {
        return controller;
    }
    
    public int getNextInvoiceNumber(){
        int number=0;
        for(SalesInvoice salesInvoice : SalesInvoices){
            if (salesInvoice.getNumber()> number)
                number = salesInvoice.getNumber();
        }
        return number;
    }

    public JLabel getInvoiceTotalLabel() {
        return InvoiceTotalLabel;
    }

    public void setInvoiceTotalLabel(JLabel InvoiceTotalLabel) {
        this.InvoiceTotalLabel = InvoiceTotalLabel;
    }

    public void setController(Controller controller) {
        this.controller = controller;
    }

    public SalesInvoicesTableModel getSalesInvoicesTableModel() {
        return salesInvoicesTableModel;
    }

    public void setSalesInvoicesTableModel(SalesInvoicesTableModel salesInvoicesTableModel) {
        this.salesInvoicesTableModel = salesInvoicesTableModel;
    }
    

}
     



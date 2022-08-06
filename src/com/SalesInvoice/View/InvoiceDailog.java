
 
package com.SalesInvoice.View;

import com.SalesInvoice.View.SalesInvoiceJFrame;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class InvoiceDailog extends JDialog {
    private JTextField CustomerNameField;
    private JTextField invoiceDateField;
    private JLabel CustomerNameLabel;
    private JLabel invoiceDateLabel;
    private JButton createInvoiceOKButton;
    private JButton CreateInvoiceCancelButton;

    public InvoiceDailog(SalesInvoiceJFrame frame) {
        CustomerNameLabel = new JLabel("Customer Name:");
        CustomerNameField = new JTextField(20);
        invoiceDateLabel = new JLabel("Sales Invoice Date:");
        invoiceDateField = new JTextField(20);
        createInvoiceOKButton = new JButton("OK");
        CreateInvoiceCancelButton = new JButton("Cancel");
        
        createInvoiceOKButton.setActionCommand("CreateInvoiceOK");
        CreateInvoiceCancelButton.setActionCommand("CreateInvoiceCancel");
        
        createInvoiceOKButton.addActionListener(frame.getController());
        CreateInvoiceCancelButton.addActionListener(frame.getController());
        setLayout(new GridLayout(3, 2));
        
        add(invoiceDateLabel);
        add(invoiceDateField);
        add(CustomerNameLabel);
        add(CustomerNameField);
        add(createInvoiceOKButton);
        add(CreateInvoiceCancelButton);
        
        pack();
        
    }

    public JTextField getCustomerNameField() {
        return CustomerNameField;
    }

    public JTextField getInvoiceDateField() {
        return invoiceDateField;
    }
    
}

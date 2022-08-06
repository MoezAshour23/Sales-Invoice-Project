
package com.SalesInvoice.View;
import com.SalesInvoice.View.SalesInvoiceJFrame;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class ItemsDailog extends JDialog{
    private JTextField itemNameField;
    private JTextField itemCountField;
    private JTextField itemPriceField;
    private JLabel itemNameLabel;
    private JLabel itemCountLabel;
    private JLabel itemPriceLabel;
    private JButton createItemOkButton;
    private JButton createItemCancelButton;
    
    public ItemsDailog(SalesInvoiceJFrame frame) {
        itemNameField = new JTextField(20);
        itemNameLabel = new JLabel("Item Name");
        
        itemCountField = new JTextField(20);
        itemCountLabel = new JLabel("Item Count");
        
        itemPriceField = new JTextField(20);
        itemPriceLabel = new JLabel("Item Price");
        
        createItemOkButton = new JButton("Ok");
        createItemCancelButton = new JButton("Cancel");
        
        createItemOkButton.setActionCommand("CreateItemInvoiceOK");
        createItemCancelButton.setActionCommand("CreateItemInvoiceCancel");
        
        createItemOkButton.addActionListener(frame.getController());
        createItemCancelButton.addActionListener(frame.getController());
        setLayout(new GridLayout(4, 2));
        
        add(itemNameLabel);
        add(itemNameField);
        add(itemCountLabel);
        add(itemCountField);
        add(itemPriceLabel);
        add(itemPriceField);
        add(createItemOkButton);
        add(createItemCancelButton);
        
        pack();
    }

    public JTextField getItemNameField() {
        return itemNameField;
    }

    public JTextField getItemCountField() {
        return itemCountField;
    }

    public JTextField getItemPriceField() {
        return itemPriceField;
    }
}

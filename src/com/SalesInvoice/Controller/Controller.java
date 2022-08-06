
package com.SalesInvoice.Controller;

import com.SalesInvoice.Model.Item;
import com.SalesInvoice.Model.ItemsTableModel;
import com.SalesInvoice.Model.SalesInvoice;
import com.SalesInvoice.Model.SalesInvoicesTableModel;
import com.SalesInvoice.View.InvoiceDailog;
import com.SalesInvoice.View.ItemsDailog;
import com.SalesInvoice.View.SalesInvoiceJFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


public class Controller implements ActionListener , ListSelectionListener {
    private SalesInvoiceJFrame frame;
    private InvoiceDailog invoiceDailog;  
    private ItemsDailog itemDailog; 
   
public Controller (SalesInvoiceJFrame frame ){
    this.frame = frame;
}
    @Override
    public void actionPerformed(ActionEvent e) {
        String actioncommand =e.getActionCommand();
        System.out.println("Action");
       switch(actioncommand){
            case "Load File":
                loadFile();
               break;
            case "Save File":
                saveFile();
               break;
            case "Create New Invoice":
                createNewInvoice();
               break;
            case "Delete Invoice":
                deleteInvoice();
               break;
            case "Create New Item":
                createNewItem();
               break;
            case "Delete Item":
                deleteItem();
               break;   
               case "CreateInvoiceCancel":
                createInvoiceCancel ();
               break;
            case "CreateInvoiceOK":
                createInvoiceOK ();
               break;
               case "CreateItemInvoiceOK":
                createItemOK ();
               break;
               case "CreateItemInvoiceCancel":
                createItemCancel ();
               break;
                       
        }
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        int selectedIndex = frame.getSalesInvoiceTable().getSelectedRow();
        if (selectedIndex != -1) {
        System.out.println("U have Selected row"+selectedIndex );
        SalesInvoice existingSalesInvoice = frame.getSalesInvoices().get(selectedIndex);
        frame.getInvoiceNumberLabel().setText(""+existingSalesInvoice.getNumber());
        frame.getInvoiceDateLabel().setText(existingSalesInvoice.getDate());
        frame.getCustNameLabel().setText(existingSalesInvoice.getCustomer());
        frame.getInvoiceTotalLabel().setText(""+existingSalesInvoice.getSalesinvoiceTotal());
        ItemsTableModel itemsTableModel = new ItemsTableModel (existingSalesInvoice.getItems());
        frame.getInvoiceItemTable().setModel(itemsTableModel);
        itemsTableModel.fireTableDataChanged();}
        
        
    }
    
    private void loadFile() {
        JFileChooser fc = new JFileChooser();
        try {
       int select = fc.showOpenDialog(frame);
       if (select == JFileChooser.APPROVE_OPTION){
       File  headerFile =  fc.getSelectedFile();
       Path headerpath = Paths.get(headerFile.getAbsolutePath());
        List<String> headerlines = Files.readAllLines(headerpath);
        System.out.println("sales invoice read done");
           ArrayList<SalesInvoice> salesinvoicesArray = new ArrayList<>();
        for (String headerline : headerlines){
            String [] headerspertors = headerline.split(",");
            int invoiceNumber = Integer.parseInt(headerspertors[0]);
            String invoiceDate = headerspertors[1];
            String custName = headerspertors[2];
            SalesInvoice salesinvoice = new SalesInvoice(invoiceNumber, invoiceDate, custName);
            salesinvoicesArray.add(salesinvoice);
        }
                        System.out.println("Check1");
            
           select = fc.showOpenDialog(frame);
          
                       if (select == JFileChooser.APPROVE_OPTION){
                      File  ItemFile =  fc.getSelectedFile();
                    Path Itempath = Paths.get(ItemFile.getAbsolutePath());
                     List<String> itemlines = Files.readAllLines(Itempath);
           // ArrayList<Item> itemsArray = new ArrayList<>();
            System.out.println("sales items read done");
                       
             for (String itemline : itemlines){
            String [] itemspertors = itemline.split(",");
            int itemNumber = Integer.parseInt(itemspertors[0]);
            String itemName = itemspertors[1];
            double itemPrice = Double.parseDouble(itemspertors[2]);
             int itemCount = Integer.parseInt(itemspertors[3]);
             SalesInvoice invoice = null;
             for (SalesInvoice salesInvoice : salesinvoicesArray){
             
                if (salesInvoice.getNumber() == itemNumber) {
                     invoice = salesInvoice;
                     break;
                }
             
             }
             Item item = new Item(itemName, itemPrice, itemCount, invoice);
             invoice.getItems().add(item);

              }
                            System.out.println("Check2");
        }
        frame.setSalesInvoices(salesinvoicesArray);
        SalesInvoicesTableModel salesInvoicesTableModel = new SalesInvoicesTableModel(salesinvoicesArray);
        frame.setSalesInvoicesTableModel(salesInvoicesTableModel);
        frame.getSalesInvoiceTable().setModel(salesInvoicesTableModel);
        frame.getSalesInvoicesTableModel().fireTableDataChanged();
      }
    }      catch (IOException exc){
        exc.printStackTrace();
        
        }
    }
        

    private void saveFile() {
        
          ArrayList<SalesInvoice> salesInvoices = frame.getSalesInvoices();
        String headers = "";
        String items = "";
        for (SalesInvoice salesInvoice : salesInvoices) {
            String salesInvoicevCSV = salesInvoice.getAsCSV();
            headers += salesInvoicevCSV;
            headers += "\n";

            for (Item item : salesInvoice.getItems()) {
                String itemCSV = item.getAsCSV();
                items += itemCSV;
                items += "\n";
            }
        }
        
        try {
            JFileChooser fc = new JFileChooser();
            int result = fc.showSaveDialog(frame);
            if (result == JFileChooser.APPROVE_OPTION) {
                File headerFile = fc.getSelectedFile();
                FileWriter hfw = new FileWriter(headerFile);
                hfw.write(headers);
                hfw.flush();
                hfw.close();
                result = fc.showSaveDialog(frame);
                if (result == JFileChooser.APPROVE_OPTION) {
                    File lineFile = fc.getSelectedFile();
                    FileWriter lfw = new FileWriter(lineFile);
                    lfw.write(items);
                    lfw.flush();
                    lfw.close();
                }
            }
        } catch (Exception ex) {

        }
    }

    private void createNewInvoice() {
        
        invoiceDailog = new InvoiceDailog(frame);
        invoiceDailog.setVisible(true);
        
    }

    private void deleteInvoice() {
       int selectedRow = frame.getSalesInvoiceTable().getSelectedRow();
        if (selectedRow != -1) {
            frame.getSalesInvoices().remove(selectedRow);
            frame.getSalesInvoicesTableModel().fireTableDataChanged();
        }
        
    }

    private void createNewItem() {
        
      itemDailog = new ItemsDailog(frame);
      itemDailog.setVisible(true);
    }

    private void deleteItem() {
        int selectedRow = frame.getInvoiceItemTable().getSelectedRow();
        if ( selectedRow != -1) {
            
            ItemsTableModel itemTableModel =(ItemsTableModel) frame.getInvoiceItemTable().getModel();
            itemTableModel.getItems().remove(selectedRow);
            
            itemTableModel.fireTableDataChanged();
            frame.getSalesInvoicesTableModel().fireTableDataChanged();
            
        }
    }

    private void createInvoiceCancel() {
        invoiceDailog.setVisible(false);
        invoiceDailog.dispose();
        invoiceDailog=null;
        
    }

    private void createInvoiceOK() {
        String date = invoiceDailog.getInvoiceDateField().getText();
        String customer = invoiceDailog.getCustomerNameField().getText();
        int number = frame.getNextInvoiceNumber();
        SalesInvoice salesInvoice = new SalesInvoice(number, date, customer);
        frame.getSalesInvoices().add(salesInvoice);
        frame.getSalesInvoicesTableModel().fireTableDataChanged();
        invoiceDailog.setVisible(false);
        invoiceDailog.dispose();
        invoiceDailog=null;
    }

    private void createItemOK() {
        String item = itemDailog.getItemNameField().getText();
        String countStr =itemDailog.getItemCountField().getText();
        String priceStr = itemDailog.getItemPriceField().getText();
        int count = Integer.parseInt(countStr);
        double price = Double.parseDouble(priceStr);
        int selectedSalesInvoice = frame.getSalesInvoiceTable().getSelectedRow();
        if (selectedSalesInvoice != -1 ){
            SalesInvoice salesInvoice = frame.getSalesInvoices().get(selectedSalesInvoice); 
            Item salesitem = new Item(item, price, count, salesInvoice);
            salesInvoice.getItems().add(salesitem);
            ItemsTableModel itemsTableModel = (ItemsTableModel) frame.getInvoiceItemTable().getModel();
            itemsTableModel.fireTableDataChanged();
            frame.getSalesInvoicesTableModel().fireTableDataChanged();
        }
        
        itemDailog.setVisible(false);
        itemDailog.dispose();
        itemDailog = null;
        
    }

    private void createItemCancel() {
        itemDailog.setVisible(false);
        itemDailog.dispose();
        itemDailog = null;
    }

}

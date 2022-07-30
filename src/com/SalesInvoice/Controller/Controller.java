
package com.SalesInvoice.Controller;

import com.SalesInvoice.Model.Item;
import com.SalesInvoice.Model.SalesInvoice;
import com.SalesInvoice.View.SalesInvoiceJFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFileChooser;


public class Controller implements ActionListener {
    private SalesInvoiceJFrame frame;
    
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
        }
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
                        System.out.println("Check1");
            
           select = fc.showOpenDialog(frame);
          File  ItemFile =  fc.getSelectedFile();
           Path Itempath = Paths.get(ItemFile.getAbsolutePath());
            List<String> itemlines = Files.readAllLines(Itempath);
                       if (select == JFileChooser.APPROVE_OPTION){

            ArrayList<Item> itemsArray = new ArrayList<>();
            System.out.println("sales items read done");
                       }
        for (String itemline : itemlines){
            String [] itemspertors = itemline.split(",");
            int itemNumber = Integer.parseInt(itemspertors[0]);
            String itemName = itemspertors[1];
            double itemPrice = Double.parseDouble(itemspertors[2]);
             int itemCount = Integer.parseInt(itemspertors[3]);
             SalesInvoice invoice = null;
             for (SalesInvoice salesInvoice : salesinvoicesArray){
             
                if (salesinvoice.getNumber()== itemNumber) {
                     invoice = salesinvoice;
                     break;
                }
             
             }
             Item item = new Item(itemNumber, itemName, itemPrice, itemCount, invoice);
             invoice.getItems().add(item);

              }
                            System.out.println("Check2");
        }
        frame.setSalesInvoices(salesinvoicesArray);
      }
    }      catch (IOException exc){
        exc.printStackTrace();
        
        }
    }
        

    private void saveFile() {
    }

    private void createNewInvoice() {
    }

    private void deleteInvoice() {
    }

    private void createNewItem() {
    }

    private void deleteItem() {
    }
    
}

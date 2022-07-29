
package com.SalesInvoice.Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JFileChooser;


public class Controller implements ActionListener {

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
       int select = fc.showOpenDialog(null);
       if (select == JFileChooser.APPROVE_OPTION){
       File  headerFile =  fc.getSelectedFile();
       
        
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

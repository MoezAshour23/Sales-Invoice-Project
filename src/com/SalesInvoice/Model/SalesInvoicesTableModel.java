
package com.SalesInvoice.Model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


public class SalesInvoicesTableModel extends AbstractTableModel{
    private ArrayList<SalesInvoice> salesInvoices;

    private String [] cloumns = {"Number","Date","Customer","Total"};
    public SalesInvoicesTableModel(ArrayList<SalesInvoice> salesInvoices) {
        this.salesInvoices = salesInvoices;
    }

    
    @Override
    public int getRowCount() {
     return salesInvoices.size();
    }

    @Override
    public int getColumnCount() {
        return cloumns.length;
    }

    @Override
    public String getColumnName(int column) {
        return cloumns[column];
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        SalesInvoice salesinvoice = salesInvoices.get(rowIndex);
        
        switch (columnIndex){
            case 0 : return salesinvoice.getNumber();
            case 1 : return salesinvoice.getDate();
            case 2 : return salesinvoice.getCustomer();
            case 3 : return salesinvoice.getSalesinvoiceTotal();
            default:return "";


            
        }
        
    }
    
}

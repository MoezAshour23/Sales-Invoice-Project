
package com.SalesInvoice.Model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


public class ItemsTableModel extends AbstractTableModel {

    private ArrayList<Item> items;
    private String [] cloumns = {"Number","Item Name","ItemPrice","Count","Item Total"};

    public ItemsTableModel(ArrayList<Item> items) {
        this.items = items;
    }
    
    @Override
    public int getRowCount() {
        return items.size();
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
        Item item = items.get(rowIndex);
        switch(columnIndex){
       
            
            case 0 : return item.getSalesInvoice().getNumber();
            case 1 : return item.getItem();
            case 2 : return item.getPrice();
            case 3 : return item.getCount();
            case 4 : return item.getItemTotal();
            default:return "";
        }
    }

    public ArrayList<Item> getItems() {
        return items;
    }
    
}


 
package com.SalesInvoice.Model;

import com.SalesInvoice.View.InvoiceDailog;
import java.util.ArrayList;


public class Item {
   
   private String item;
   private double price;
   private int count;
   private SalesInvoice salesInvoice;
   
      public String getAsCSV() {
        return salesInvoice.getNumber()+ "," + item + "," + price + "," + count;
    }

    public Item() {
    }

    public Item( String item, double price, int count, SalesInvoice salesInvoice) {
        this.item = item;
        this.price = price;
        this.count = count;
        this.salesInvoice = salesInvoice;
    }

    public Item(Item salesitem, double price, int count, SalesInvoice salesInvoice) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

     

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

     public double getItemTotal() {
        return price * count;
    }
    
    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Item{" + "number=" + salesInvoice.getNumber() + ", item=" + item + ", price=" + price + ", count=" + count + '}';
    }

    public SalesInvoice getSalesInvoice() {
        return salesInvoice;
    }
     
    

  

    
}

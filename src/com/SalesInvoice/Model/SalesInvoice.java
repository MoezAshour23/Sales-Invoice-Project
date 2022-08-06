
package com.SalesInvoice.Model;

import java.util.ArrayList;


public class SalesInvoice {
    
    private int number;
    private String date;
    private String customer;
    private ArrayList<Item>Items;

    
        public String getAsCSV() {
        return number + "," + date + "," + customer;
    }

    public ArrayList<Item> getItems() {
       if (Items==null){
           Items = new ArrayList<>();
       }
        return Items;
    }

    public void setItems(ArrayList<Item> Items) {
        this.Items = Items;
    }
    
    public double getSalesinvoiceTotal (){
       double total = 0.0;
       for (Item item :getItems()){
           total += item.getItemTotal();
       }
        return total;
        
    }

    public SalesInvoice() {
    }

    public SalesInvoice(int number, String date, String customer) {
        this.number = number;
        this.date = date;
        this.customer = customer;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "SalesInvoice{" + "number=" + number + ", date=" + date + ", customer=" + customer + '}';
    }
    



   
    
    
    
}

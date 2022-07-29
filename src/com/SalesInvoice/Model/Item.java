
 
package com.SalesInvoice.Model;


public class Item {
   private int number;
   private String item;
   private double price;
   private int count;
   private SalesInvoice SalesInvoice;
   
    

    public Item() {
    }

    public Item(int number, String item, double price, int count, SalesInvoice SalesInvoice) {
        this.number = number;
        this.item = item;
        this.price = price;
        this.count = count;
        this.SalesInvoice = SalesInvoice;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
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

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    
}

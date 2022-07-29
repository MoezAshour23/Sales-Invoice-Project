
package com.SalesInvoice.Model;

import java.util.ArrayList;


public class SalesInvoice {
    
    private int number;
    private String date;
    private String customer;
    private ArrayList<Item>Items;
    

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
    
    
    
    
}

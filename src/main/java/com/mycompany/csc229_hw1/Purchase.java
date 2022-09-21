/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc229_hw1;

/**
 *
 * @author johnf
 */
public class Purchase {
//member variables
    String itemName;
    double quantity;
    double itemPrice;
    
//default constructor
    public Purchase() {
        itemName = "";
        quantity = 0;
        itemPrice = 0;
    }
    
//constructor with parameters
    public Purchase(String item, double amt, double price) {
        itemName = item;
        quantity = amt;
        itemPrice = price;
    }
    
//deep copy constructor
    public Purchase(Purchase other) {
        itemName = other.getItemName();
        quantity = other.getQuantity();
        itemPrice = other.getItemPrice();
    }
    
//get/set methods for member variables
    public String getItemName() {
        return itemName;
    }
    public void setItemName(String newItemName) {
        this.itemName = newItemName;
    }
    public double getQuantity(){
        return quantity;
    }
    public void setQuantity(double newQuantity) {
        this.quantity = newQuantity;
    }
    public double getItemPrice() {
        return itemPrice;
    }
    public void setItemPrice(double newItemPrice) {
        this.itemPrice = newItemPrice;
    }
    
//cost method
    public double cost() {
        return itemPrice * quantity;
    }
    
//method to make deep copies
    public Purchase makeCopy() {
        Purchase copy = new Purchase();
        copy.itemName = itemName;
        copy.quantity = quantity;
        copy.itemPrice = itemPrice;
        return copy;
    }
    
//equals override
    @Override
    public boolean equals(Object o) {
        if (o == this){
            return true;
        }
        
        if (!(o instanceof Purchase)) {
            return false;
        }
        
        Purchase p = (Purchase) o;
        
        return p.itemName == itemName && p.quantity == quantity && p.itemPrice == itemPrice;
    }  
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc229_hw1;

/**
 *
 * @author johnf
 */
public class PurchaseCollection {    
//member variables
    private Purchase[] purchaseArr;
    int size = 5;
    
//default constructor    
    public PurchaseCollection() {
        purchaseArr = new Purchase[size];
        int length = purchaseArr.length;
        
        for (int i = 0; i < size; i++){
            purchaseArr[i] = new Purchase();
        }
    }
    
//default constructor with size as input    
    public PurchaseCollection(int size) {
        purchaseArr = new Purchase[size];
        int length = purchaseArr.length;
        
        for (int i = 0; i < size; i++){
            purchaseArr[i] = new Purchase();
        }
    }

//copy constructor    
    public PurchaseCollection(PurchaseCollection other) {
        purchaseArr = new Purchase[other.getSize()];
        
        for (int i = 0; i < other.getSize(); i++) {
            purchaseArr[i] = new Purchase(other.get(i));
        }
    }
    
//sets value at index to copy of purchase    
    public void set(int index, Purchase p) {
        if (index >= getSize() || index < 0) {
            System.out.println("Please enter a valid index.");
        }
        else {
            purchaseArr[index] = p.makeCopy();
        }
    }
    
//gets index of element in array    
    public Purchase get(int index){
        return purchaseArr[index];
    }
    
//gets size of array    
    public int getSize() {
        return purchaseArr.length;
    }

//method to make deep copy of PurchaseCollection    
    public PurchaseCollection makeCopy() {
        PurchaseCollection copy = new PurchaseCollection(getSize());
        for (int i = 0; i < getSize(); i++) {
            copy.set(i, purchaseArr[i].makeCopy());
        }
        return copy;
    }

//method to resize array    
    public void resize(int newSize) {
        Purchase[] newPurArr = new Purchase[newSize];
        
        if (getSize() >= newSize) {
            for (int i = 0; i < newSize; i++) {
                newPurArr[i] = purchaseArr[i].makeCopy();                
            }
        }
        else {
            for (int i = 0; i < getSize(); i++) {
                newPurArr[i] = purchaseArr[i].makeCopy();
            }
            for (int i = getSize(); i < newSize; i++) {
                newPurArr[i] = new Purchase();
            }
        }
        purchaseArr = newPurArr;
    }
    
//equals override    
    public boolean equals(Object o) {
        if (o == this) {
        return true;
        }
        
        if(!(o instanceof Purchase)) {
            return false;
        }
        
        PurchaseCollection pc = (PurchaseCollection) o;
        
        if(getSize() != pc.getSize()) {
            return false;
        }
        
        for (int i = 0; i < getSize(); i++) {
            if(!purchaseArr[i].equals(pc.get(i))) {
                return false;
            }
        }
        return false;
    }
}

    


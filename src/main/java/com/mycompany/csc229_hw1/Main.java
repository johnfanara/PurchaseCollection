/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc229_hw1;

/**
 *
 * @author johnf
 */
public class Main {
    public static void main(String[] args) {
//creates new instance of Purchase class and sets member variables
//uses default constructor
        Purchase p1 = new Purchase();
        p1.setItemName("Vegemite");
        p1.setQuantity(5);
        p1.setItemPrice(5.99);
        
//uses constructor with member variables as parameters
        Purchase p2 = new Purchase("Bovril", 6, 10.99);
        
//deep copy using the copy constructor
        Purchase p3 = new Purchase(p2);
        
//prints purchase objects 
        System.out.println("Item Name: " + p1.itemName + " | Item Quantity: " + p1.quantity + " | Item Price: $" + p1.itemPrice);
        System.out.println("Item Name: " + p2.itemName + " | Item Quantity: " + p2.quantity + " | Item Price: $" + p2.itemPrice);
        System.out.println("Item Name: " + p3.itemName + " | Item Quantity: " + p3.quantity + " | Item Price: $" + p3.itemPrice);
        System.out.println();

//prints calculated cost        
        System.out.println("Cost: $" + p1.cost());
        System.out.println("Cost: $" + p2.cost());
        System.out.println("Cost: $" + p3.cost());
        System.out.println();

//makes copies of objects using makeCopy()        
        Purchase copyp1 = p1.makeCopy();
        Purchase copyp2 = p2.makeCopy();
        Purchase copyp3 = p3.makeCopy();

//prints copied objects        
        System.out.println("Copy - Item Name: " + copyp1.itemName + " | Item Quantity: " + copyp1.quantity + " | Item Price: $" + copyp1.itemPrice);
        System.out.println("Copy - Item Name: " + copyp2.itemName + " | Item Quantity: " + copyp2.quantity + " | Item Price: $" + copyp2.itemPrice);
        System.out.println("Copy - Item Name: " + copyp3.itemName + " | Item Quantity: " + copyp3.quantity + " | Item Price: $" + copyp3.itemPrice);
        System.out.println();

//checks if p1 and p3 are equal        
        if (p1.equals(p3)){
            System.out.println("p1 and p3 are equal");
        }
        else {
            System.out.println("p1 and p3 are not equal");
        }
        System.out.println();
//creates new purchase collection

        PurchaseCollection pc1 = new PurchaseCollection();
        int size = 5;

//sets values for pc1        
        pc1.set(0, p1);
        pc1.set(1, p2);
        pc1.set(2, p3);
        pc1.set(3, new Purchase("Marmite", 12, 4.99));
        pc1.set(4, new Purchase("Anchovie Paste", 3, 12.99));

//displays pc1        
        System.out.println("Purchase Collection 1 - ");
        for (int i = 0; i < size; i++) {
            System.out.println("Item Name: " + pc1.get(i).getItemName() +
                    " | Item Quantity: " + pc1.get(i).getQuantity() +
                    " | Item Price: " + pc1.get(i).getItemPrice());
        }
        System.out.println();

// creates and displays copy of pc1                   
        PurchaseCollection pc2 = pc1.makeCopy();
        System.out.println("Purchase Collection 2 - ");
        for (int i = 0; i < size; i++) {
            System.out.println("Item Name: " + pc2.get(i).getItemName() +
                    " | Item Quantity: " + pc2.get(i).getQuantity() +
                    " | Item Price: " + pc2.get(i).getItemPrice());
        }      
        System.out.println();

//resizes and displays pc2 to a smaller array        
        pc2.resize(3);
        System.out.println("Purchase Collection 2 - Resized Smaller");
        for (int i = 0; i < pc2.getSize(); i++) {
            System.out.println("Item Name: " + pc2.get(i).getItemName() +
                    " | Item Quantity: " + pc2.get(i).getQuantity() +
                    " | Item Price: " + pc2.get(i).getItemPrice());
        }      
        System.out.println();
        
//resizes and displays pc2 to a larger array                
        pc2.resize(7);
        System.out.println("Purchase Collection 2 - Resized Larger");
        for (int i = 0; i < pc2.getSize(); i++) {
            System.out.println("Item Name: " + pc2.get(i).getItemName() +
                    " | Item Quantity: " + pc2.get(i).getQuantity() +
                    " | Item Price: " + pc2.get(i).getItemPrice());
        }      
        System.out.println();

//checks if pc1 and pc2 are equal        
        if(pc1.equals(pc2)) {
            System.out.println("pc1 and pc2 are equal");
        }
        else {
            System.out.println("pc1 and pc2 are unequal");
        }
    }
}

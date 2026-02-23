package com.cesar.contactmanager;

import javax.swing.JOptionPane;

public class ContractManagerApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Ask user type of contact to add
        String type = JOptionPane.showInputDialog("Enter contact type (personal/client):");
        
        Contact contact = null;
        
      //hourly
        if (type.equalsIgnoreCase("personal")) { 
        	String name = JOptionPane.showInputDialog("Enter name:");
            String number = JOptionPane.showInputDialog("Enter phone number:");
            String address = JOptionPane.showInputDialog("Enter address:");
            String birthday = JOptionPane.showInputDialog("Enter birthday:");
            
            contact = new PersonalContact(name, number, address, birthday); 
        } 
         	//salaried
        else if(type.equalsIgnoreCase("client")) {
        	String name = JOptionPane.showInputDialog("Enter name:");
            String number = JOptionPane.showInputDialog("Enter phone number:");
            String email = JOptionPane.showInputDialog("Enter email:");
            String notes = JOptionPane.showInputDialog("Enter note:");
            String preferences = JOptionPane.showInputDialog("Enter preference:");
            
            
            contact = new ClientContact(name, number, email, notes, preferences); 
        }
        //exit if invalid input
        else {
        	JOptionPane.showMessageDialog(null, "Wrong Selection.");
        	System.exit(0);
        }
        
        contact.display();
        
        String choice = JOptionPane.showInputDialog("Do you need to update any info?(yes/no): ");
        
        //yes
        if (choice.equalsIgnoreCase("yes")) { 
        	String name = JOptionPane.showInputDialog("Enter info type to update:");
        	String value = JOptionPane.showInputDialog("Enter correct info:");
            
        	//will use polymorphism to use correct methods depending on correct contact (personal or client)
        	contact.update(name, value);
        	contact.display();
        
        } 
       
    	JOptionPane.showMessageDialog(null, "Thanks for using Simple Contact Manager!");
    	System.exit(0);
    	
	}
}

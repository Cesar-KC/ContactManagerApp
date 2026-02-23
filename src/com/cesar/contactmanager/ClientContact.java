package com.cesar.contactmanager;
import javax.swing.JOptionPane; //import library for Joption functionality

public class ClientContact extends Contact {

	private String email, notes, preferences;
	
	public ClientContact(String name, String number, String e, String n, String p) {
		super(name, number);
        this.email = e;
        this.notes = n;
        this.preferences = p;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getNotes() {
		return notes;
	}
	
	public String getPreferences() {
		return preferences;
	}
	
	public void setEmail(String addy) {
        this.email = addy;
    }


    public void setNotes(String note) {
        this.notes = note;
    }
    
    public void setPreferences(String pref) {
        this.preferences = pref;
    }
    
    
	//abstract method
    //console
    /*
	@Override
	public void display() {
		// TODO Auto-generated method stub
	        System.out.println("Client Contact");
	        System.out.println("Name: " + getName());
	        System.out.println("Phone: " + getNumber());
	        System.out.println("Email: " + email);
	        System.out.println("Notes: " + notes);
	        System.out.println("Preferences: " + preferences);
	} */
    
    //GUI method
    @Override
    public void display() {
        String message = String.format(
            "Client Contact%nName: %s%nPhone: %s%nEmail: %s%nNotes: %s%nPreferences: %s",
            getName(),
            getNumber(),
            email,
            notes,
            preferences
        );
        
        JOptionPane.showMessageDialog(null, message, "Contact Info", javax.swing.JOptionPane.INFORMATION_MESSAGE);
    }

	
	//interface implementation to update a certain field
	@Override
	public void update(String field, String value) {
		// TODO Auto-generated method stub
        switch (field.toLowerCase()) {
            case "email" -> setEmail(value);
            case "notes" -> setNotes(value);
            case "preferences" -> setPreferences(value);
            case "name" -> setName(value);
            case "phone" -> setNumber(value);
            default -> System.out.println("Error: " + field + " is an invalid field.");
        }
    }

}




package com.cesar.contactmanager;
import javax.swing.JOptionPane; //import library for Joption functionality

public class PersonalContact extends Contact {

	private String address, birthday;
	
	public PersonalContact(String name, String number, String address, String birthday) {
		super(name, number);
        this.address = address;
        this.birthday = birthday;
	}
	
	public String getAddress() {
		return address;
	}
	
	public String getBirthday() {
		return birthday;
	}
	
	public void setAddress(String addy) {
        this.address = addy;
    }


    public void setBirthday(String bday) {
        this.birthday = bday;
    }
	
    
    //abstract method
    //console method 
    /*
	@Override
	public void display() {
		// TODO Auto-generated method stub
	        System.out.println("Personal Contact");
	        System.out.println("Name: " + getName());
	        System.out.println("Phone: " + getNumber());
	        System.out.println("Address: " + address);
	        System.out.println("Birthday: " + birthday);
	}
	*/
    
    //GUI method
    @Override
    public void display() {
        String message = String.format(
            "Personal Contact%nName: %s%nPhone: %s%nAddress: %s%nBirthday: %s",
            getName(),
            getNumber(),
            address,
            birthday
        );
        
        JOptionPane.showMessageDialog(null, message, "Contact Info", javax.swing.JOptionPane.INFORMATION_MESSAGE);
    }
	
	//interface implemntation
	@Override
	public void update(String field, String value) {
		// TODO Auto-generated method stub
        switch (field.toLowerCase()) {
            case "address" -> setAddress(value);
            case "birthday" -> setBirthday(value);
            case "name" -> setName(value);
            case "phone" -> setNumber(value);
            default -> System.out.println("Error: " + field + " is an invalid field.");
        }
    }
}

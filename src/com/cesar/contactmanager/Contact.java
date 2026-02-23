package com.cesar.contactmanager;

public abstract class Contact implements Editable{
	private String name, number;
	
	public Contact(String n, String num) {
		this.name = n;
		this.number = num;
	}
	
	
	//setters/getters
    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }
    
    public void setName(String name) {
        this.name = name;
    }


    public void setNumber(String num) {
        this.number = num;
    }
    
    
    // abstract methods that are contracted or need to be defined elsewhere
    public abstract void display();
	
}


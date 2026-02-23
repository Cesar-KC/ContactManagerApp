//Cesar Giner
//Java Application - Homework 1
//SimpleContactManager

//Design: I decided to create Contact as my superclass with basic info fields/attributes, 
setters/getters, and a constructor.It also has an abstract method that will need to be implemneted
by subclasses. Also, it creates an interface called Editable. My two subclasses PersonalContact and ClientContact will inherit from Contact 
and will added respective but distinctive fields, constructors, and methods/abstract method implementations. Editable interfaces allows
us to update any contact info. Main class, ContractManagerApp, is the driver of the 
program that asks user for type of contact to add, ask for specific info, and creates object using polymorphism. We display and ask
user to confirm info, and if they want to update any wrong info, we can do so using Editable interface that can update any field with new
correct value regardless of Contact type.

//Notes:
- Github link with all files needed as well: https://github.com/Cesar-KC/ContactManagerApp

- main driver is 'ContactManagerApp.java'
- main driver is inside src/com/cesar/contactmanager 
- ignore 'hourly' and 'salaried' comments, as i forgot to remove as i resused some code from our payrollApp

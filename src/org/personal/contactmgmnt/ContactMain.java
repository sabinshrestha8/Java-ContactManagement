package org.personal.contactmgmnt;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class ContactMain {
    
    private static final List <Contact> contacts = new LinkedList<>();
    
    private static void save(Contact contact) {
        
        contacts.add(contact);
        
    }
    
    private static void remove(Contact contact) {
        
        contacts.remove(contacts.indexOf(contact));

    }
    
    private static void update(Contact contact) {
        
        contacts.set(contacts.indexOf(contact), contact);
  
    }
    
    private  static Contact findById(int id) {
        for(Contact c: contacts) {
            if(c.getId() == id) {
               return c;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char cont;
        int id = 1;
        
        Contact contact1 = new Contact(id++, "Aayush", "Shrestha", "Gathaghar", 9873214561L);
        Contact contact2 = new Contact(id++, "Swornima", "Shrestha", "Boudha", 9874214961L);
        contacts.add(contact1);
        contacts.add(contact2);

                
        do {
            System.out.println("*************");
            System.out.println("1. create");
            System.out.println("2. update");
            System.out.println("3. delete");
            System.out.println("4. display");
            System.out.println("*************");
            
            int choice = scan.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.println("--------------------");
                    System.out.println("Enter firstName: ");
                    String firstName = scan.next();
                    System.out.println("Enter lastName: ");
                    String lastName = scan.next();
                    System.out.println("Enter address: ");
                    String address = scan.next();
                    System.out.println("Enter contactNumber: ");
                    Long contactNumber = scan.nextLong();
                    System.out.println("--------------------");

                    Contact contactOne = new Contact(id++, firstName, lastName, address, contactNumber);
                    
                    save(contactOne);
                    break;
                case 2:
                    System.out.println("Enter an id ");
                    int updateId = scan.nextInt();

                    Contact contactUpdate = findById(updateId); 

                        if (contactUpdate != null) { 
                            
                            System.out.println("--------------------");
                            System.out.println("Enter firstName: ");
                            String firstNameUpdate = scan.next();
                            System.out.println("Enter lastName: ");
                            String lastNameUpdate = scan.next();
                            System.out.println("Enter address: ");
                            String addressUpdate = scan.next();
                            System.out.println("Enter contactNumber: ");
                            Long contactNumberUpdate = scan.nextLong();
                            System.out.println("--------------------"); 
                            contactUpdate.setFirstName(firstNameUpdate);
                            contactUpdate.setLastName(lastNameUpdate);
                            contactUpdate.setAddress(addressUpdate);
                            contactUpdate.setContactNumber(contactNumberUpdate);
                            update(contactUpdate);
                            System.out.println("Contact updated Successfully");

                        } else {
                            System.out.println("Contact not found");
                        }
                    break;
                case 3:
                    System.out.println("Enter an id ");
                    int contactId = scan.nextInt();

                    Contact contact = findById(contactId);
                        if (contact != null) { 
                            remove(contact);
                        } else {
                            System.out.println("Contact not found");
                        }
                    break;
                case 4:
                    for(Contact c: contacts) {
                        
                        System.out.println("Id " +c.getId());
                        System.out.println("firstName " +c.getFirstName());
                        System.out.println("lastName " +c.getLastName());
                        System.out.println("address " +c.getAddress());
                        System.out.println("contactNumber " +c.getContactNumber());
                  
                    }
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        
            System.out.println("Do you want to continue(y/Y)"); 
            cont = scan.next().charAt(0);
            
        } while (cont == 'Y' || cont == 'y');
        
    }
}

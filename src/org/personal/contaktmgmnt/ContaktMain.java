package org.personal.contactmgmnt;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class Contakt {
    
    private int id;
    
    private String firstName;
    
    private String lastName;
   
    private String address;
    
    private long contactNumber;

    public Contakt(int id, String firstName, String lastName, String address, long contactNumber) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.contactNumber = contactNumber;
    }
    
    public Contakt() {
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(long contactNumber) {
        this.contactNumber = contactNumber;
    }

    @Override
    public String toString() {
        return "Contact{" + "id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", contactNumber=" + contactNumber + '}';
    }

    
}

public class ContaktMain {
    
    public static void main(String[] args) {
        List <Contakt> contacts = new LinkedList<>();
        
        Contakt contactOne = new Contakt();
        contactOne.setId(1);
        contactOne.setFirstName("Sabin");
        contactOne.setLastName("Shrestha");
        contactOne.setAddress("Bode");
        contactOne.setContactNumber(9823549845L);
        
        Contakt contactTwo = new Contakt();
        contactTwo.setId(2);
        contactTwo.setFirstName("Aayush");
        contactTwo.setLastName("Shrestha");
        contactTwo.setAddress("Gathaghar");
        contactTwo.setContactNumber(9849852757L);
       
        contacts.add(contactOne);
        contacts.add(contactTwo);
        
        for(Contakt c: contacts) {
            System.out.println("Id " +c.getId());
            System.out.println("firstName " +c.getFirstName());
            System.out.println("lastName " +c.getLastName());
            System.out.println("address " +c.getAddress());
            System.out.println("contactNumber " +c.getContactNumber());
                  
        }
        
        contacts.set(0, new Contakt(1, "Bishal", "Thapa", "Thimi", 9856475812L));
        
        System.out.println("contacts updated " +contacts.get(0));
        
        contacts.remove(0);
        
        System.out.println("contacts after remove " +contacts.get(0));
        
    }
}

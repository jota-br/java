package MobilePhone.dev.lpa;

import java.util.ArrayList;
import java.util.logging.Logger;
import java.util.logging.Level;

public class MobilePhone {

    public static void main(String[] args) {
        
        MobilePhone mobilePhone = new MobilePhone("123-456-7890");
        mobilePhone.addNewContact(new Contact("J", "42"));
        mobilePhone.updateContact(new Contact("J", "42"), new Contact("J", "43"));
        mobilePhone.removeContact(new Contact("J", "42"));
        mobilePhone.printContacts();
    }
    
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact) {

        if (findContact(contact.getName()) >= 0) {
            return false;
        }
        myContacts.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact contact) {

        int hasContact = findContact(oldContact);
        int hasNewContact = findContact(contact.getName());

        if (hasContact < 0 || hasNewContact > 0) {
            return false;
        }

        this.myContacts.set(hasContact, contact);

        return true;
    }

    public boolean removeContact(Contact contact) {

        int hasContact = findContact(contact);

        if (hasContact >= 0) {
            this.myContacts.remove(hasContact);
        }
        return (hasContact >= 0);
    }

    private int findContact(Contact contact) {

        return myContacts.indexOf(contact);
    }

    private int findContact(String name) {

        for (Contact e : myContacts) {
            if (e.getName().equals(name)) {
                return myContacts.indexOf(e);
            }
        }
        return -1;
    }

    public Contact queryContact(String name) {

        int index = findContact(name);
        if (index >= 0) {
            return this.myContacts.get(index);
        }
        return null;
    }

    public void printContacts() {

        System.out.format("Contact List:%n");
        int i = 0;
        for ( Contact e : myContacts) {
            System.out.format((i + 1) + ". " + e.getName() + " -> " + e.getPhoneNumber() + "%n");
            i++;
        }
    }
}

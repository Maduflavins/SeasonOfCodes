package flavins.com.codes;

import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {
    private static Scanner input = new Scanner(System.in);

    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public void startPhone(){
        System.out.println("Please enter your Name");
        String customerName = input.nextLine();
        System.out.println("Please enter your Country of residence: ");
        String country = input.nextLine();
        System.out.println("Please enter your state of residence");
        String stateOfResidence = input.nextLine();
        System.out.println("Please enter your phone number");
        String phoneNumber = input.nextLine();
        System.out.println("Hi esteemed customer you have been registered with the following details Name: " + customerName +
                            ", " + "Country:  " +  country +  " , " + " State of residence: " + stateOfResidence + " , " + " phone number :" + phoneNumber);
        System.out.println("Thank you for using our product, \nStating Phone...");
    }

    public boolean addNewContact(Contact contact){
        if(findContact(contact.getName()) >= 0){
            System.out.println(contact + " already exist");
            return false;
        }
        myContacts.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact){
        int postion = findContact(oldContact);
        if(postion < 0){
            System.out.println(oldContact.getName() + " , was not found");
            return false;
        }else if(findContact(newContact.getName()) != -1){
            System.out.println("UUpdate not possible because " + newContact.getName() + " belongs to another contact also");

        }
        myContacts.set(postion, newContact);
        System.out.println(oldContact.getName() + " has been updated with " + newContact.getName());
        return true;
    }

    public boolean removeContact(Contact contact){
        if(findContact(contact) >= 0){
            this.myContacts.remove(contact);
            System.out.println(contact.getName() + " has been removed from your contact list ");
            return true;

        }
        System.out.println(contact.getName() + " is not present in your contact list");
        return false;
    }

    private int findContact(Contact contact){
        return myContacts.indexOf(contact);
    }

   private int findContact(String contactName){
        for(int i = 0; i < myContacts.size(); i++){
            Contact contact = myContacts.get(i);
            if(contact.getName().equals(contactName)){
                return i;
            }
        }
        return -1;
   }

   public Contact queryContact(String name){
        int position = findContact(name);
        if(position >= 0){
            return this.myContacts.get(position);
        }
        return null;
   }

   public String queryContact(Contact contact){
        if(findContact(contact) >= 0){
            return contact.getName();
        }
        return null;

   }

   public void printContacts(){
       System.out.println("Contacts Lists");
       for(int i = 0; i < myContacts.size(); i++){
           System.out.println((i + 1) + "." + myContacts.get(i).getName() + " ==> " + myContacts.get(i).getPhoneNumber() );
       }
   }


}

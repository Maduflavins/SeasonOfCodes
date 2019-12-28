package flavins.com.codes;

import java.util.Scanner;

public class Main {
    private static Scanner input = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("08063572167");

    public static void main(String[] args) {
	    boolean quit = false;
	    mobilePhone.startPhone();
	    printActions();

	    while(!quit){
            System.out.println("\nEnter action: (6 to show available actions");
            int action = input.nextInt();
            input.nextLine();

            switch(action){
                case 0:
                    System.out.println("\n Shutting down...");
                    quit = true;
                    break;

                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    searchContact();
                    break;
                case 6:
                    printActions();
                    break;
            }


        }
    }

    private static void addNewContact(){
        System.out.println("Please enter contact name");
        String contactName = input.nextLine();
        input.nextLine();
        System.out.println("Please enter contact phone number");
        String phoneNumber = input.nextLine();
        Contact newContact = Contact.createContact(contactName, phoneNumber);
        if(mobilePhone.addNewContact(newContact)){
            System.out.println(contactName + " and " + phoneNumber + " has been successfully added to your phone  contact");
        }else{
            System.out.println("can't add  contact because " + contactName + " already exist" );
        }

    }

    private static void updateContact(){
        System.out.println("P;ease enter existing contact name");
        String name = input.nextLine();
        Contact existingContact = mobilePhone.queryContact(name);
        if(existingContact == null){
            System.out.println("Contact name not found");
            return;
        }

        System.out.println("Enter new contact name");
        String newName = input.nextLine();
        input.nextLine();
        System.out.println("Enter new contact phone number");
        String newPhone = input.nextLine();
        Contact newContact = Contact.createContact(newName, newPhone);
        if(mobilePhone.updateContact(existingContact, newContact)){
            System.out.println("Successfully updated the contact");
        }
        else {
            System.out.println("Unable to update contact");
        }
    }

    private static void removeContact(){
        System.out.println("Please enter contact name: ");
        String name = input.nextLine();
        Contact contactName = mobilePhone.queryContact(name);
        if(contactName == null){
            System.out.println("Contact not found");

        }
        if(mobilePhone.removeContact(contactName)){
            System.out.println("Successfully deleted contact");
        }else{
            System.out.println("A deletion error occured");
        }
    }

    private static void searchContact(){
        System.out.println("Please enter contact name ");
        String name = input.nextLine();
        Contact contactName = mobilePhone.queryContact(name);
        if(contactName == null){
            System.out.println(name + " does not exist in the phone contact list");
        }
        System.out.println(contactName.getName() + " ==> " + contactName.getPhoneNumber());

    }

    private static void printActions(){
        System.out.println("\nAvailable actions:\npress");
        System.out.println("0 - to shutdown\n" +
                            "1 - to display contacts\n" +
                            "2 - to add a new contact\n" +
                            "3 - to update an existing contact\n" +
                            "4 - to remove an existing contact\n" +
                            "5 - to search for a contact\n" +
                            "6 - to print list of available options");
        System.out.println("choose your action");
    }
}

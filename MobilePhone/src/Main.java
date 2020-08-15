import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("12345689");
    public static void main(String[] args){
    boolean quit = false;
    startPhone();
    printActions();
    while(!quit){
        System.out.println("\nEnter action : (6 to show available action)");

        int action = scanner.nextInt();
        scanner.nextLine();

        switch (action){
            case 0 :
                System.out.println("\nShutting down...");
                quit = true;
                break;
            case 1 :
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
                queryContact();
                break;
            case 6:
                printActions();
                break;
        }
    }
    }

    private static void addNewContact(){
        System.out.println("Enter new contact name : ");
        String name = scanner.nextLine();
        System.out.println("Enter phone number: ");
        String phoneNumber = scanner.nextLine();
        Contacts newContact = Contacts.createContact(name, phoneNumber);
        if(mobilePhone.addNewContact(newContact)){
            System.out.println("New contact added: "+name + ", phone = "+phoneNumber);
        }
        else
            System.out.println("Can't added the contact name "+name+ " as it already exists int the phone directory");
    }

    private static void updateContact(){
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contacts existingContactRecord = mobilePhone.queryContact(name);
        if(existingContactRecord==null){
            System.out.println("Contact not found.");
            return;
        }
        System.out.println("Enter new contact name: ");
        String newName = scanner.nextLine();
        System.out.println("Enter new contact phone number: ");
        String newNumber = scanner.nextLine();
        Contacts newContact = Contacts.createContact(newName, newNumber);
        if(mobilePhone.updateContact(existingContactRecord, newContact)){
            System.out.println("Successfully updated record");
        }
        else
            System.out.println("Error updating record.");
    }

    private static void removeContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contacts existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found.");
            return;
        }

        if(mobilePhone.removeContact(existingContactRecord)){
            System.out.println("Successfully deleted");
        }
        else
            System.out.println("Error in deleting");
    }

    private static void queryContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contacts existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found.");
            return;
        }

        System.out.println("Name: "+existingContactRecord.getName()+
                "Phone Number: "+existingContactRecord.getPhoneNumber());
    }


    public static void startPhone(){
        System.out.println("Starting phone.....");
    }

    public static void printActions(){
        System.out.println("\nAvailable actions : \npress");
        System.out.println("0 - to shutdown\n"+
                            "1 - to print contacts\n"+
                "2 - to add a new contacts\n"+
                "3 - to update an existing contact\n"+
                "4 - to remove an existing contact\n"+
                "5 - query if an contact already exists\n"+
                "6 - to print a list of available actions.\n"+
                "Choose your action: ");
    }

}


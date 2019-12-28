package flavins.com.codes;
import java.util.Scanner;
public class Main {
    private static Scanner input = new Scanner(System.in);
    private static GloceryList groceryList = new GloceryList();

    public static void main(String[] args) {
	    boolean quit = false;
	    int choice = 0;
	    printInstructions();

	    while(!quit){
            System.out.println("Please enter your choice: ");
            choice = input.nextInt();
            input.nextLine();

            switch(choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit = true;
                    break;

            }
        }
    }

    public static void printInstructions(){
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of grocery items");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an item in the lis");
        System.out.println("\t 4 - To remove an item from the list");
        System.out.println("\t 5 - To search for an item in the list");
        System.out.println("\t 6 - To quit the application");
    }


    public static void addItem(){
        System.out.println("Please enter item: ");
        groceryList.addGroceryItem(input.nextLine());
    }

    public static void modifyItem(){
        System.out.println("Please enter current item: ");
        String currentItem = input.nextLine();
        input.nextLine();
        System.out.println("Please enter replacement item: ");
        String replacementItem = input.nextLine();
        groceryList.modifyGroceryItem(currentItem, replacementItem);
    }

    public static void removeItem(){
        System.out.println("Please enter item name: ");
        String name = input.nextLine();
        input.nextLine();
        groceryList.removeGroceryList(name);
    }

    public static void searchForItem(){
        System.out.println("Please enter search item");
        String searchItem = input.nextLine();
        input.nextLine();
        if(groceryList.onFile(searchItem)){
            System.out.println("we found " + searchItem + " in your grocery list");
        }else{
            System.out.println(searchItem + " is not in the grocery list");
        }
    }
}

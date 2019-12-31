package flavins.com.codes;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<String>();
       addInOrder(placesToVisit, "Canada");
       addInOrder(placesToVisit, "paris");
       addInOrder(placesToVisit, "Israel");
       addInOrder(placesToVisit, "Jordan");
       addInOrder(placesToVisit, "Sun city");
        printList(placesToVisit);
        visit(placesToVisit);

        //placesToVisit.add(1, "Ibadan");
       // printList(placesToVisit);

        //placesToVisit.remove(4);
        //printList(placesToVisit);



    }

    public static void printList(LinkedList<String> linkedList){
        Iterator<String>i = linkedList.iterator();
        while(i.hasNext()){
            System.out.println("Now visiting " + i.next());
        }
    }

    public static boolean addInOrder(LinkedList<String>linkedList, String newCity){
        ListIterator<String>linkedListIterator = linkedList.listIterator();
        while (linkedListIterator.hasNext()){
            int comaprison = linkedListIterator.next().compareTo(newCity);
            if(comaprison == 0){
                System.out.println("City already added");
                return false;
            }
            else if(comaprison > 0){
                linkedListIterator.previous();
                linkedListIterator.add(newCity);
                return true;
            }else if(comaprison < 0){
                 // move to the next city
            }
        }
        linkedListIterator.add(newCity);
        return true;
    }


    private static void visit(LinkedList cities){
        Scanner scanner = new Scanner(System.in);
        boolean goingForward = true;
        boolean quit = false;
        ListIterator<String>linkedListIterator = cities.listIterator();
        if(cities.isEmpty()){
            System.out.println("No cities available");
            return;
        }else{
            System.out.println("now visiting " + linkedListIterator.next());
            printMenu();
        }
        while(!quit){
            System.out.println("enter number choice: ");
            int choice = scanner.nextInt();
            switch (choice){
                case 0:
                    System.out.println("Holiday Over " + linkedListIterator.next());
                    quit=true;
                    break;
                case 1:
                    if(!goingForward){
                        if(linkedListIterator.hasNext()){
                            linkedListIterator.next();
                        }
                        goingForward=true;
                    }
                    if(linkedListIterator.hasNext()){
                        System.out.println("Now visiting " + linkedListIterator.next());
                    }
                    else{
                        System.out.println("has reached the end of the cities to visit");
                        goingForward=false;
                    }
                    break;
                case 2:
                    if(goingForward){
                        if(linkedListIterator.hasPrevious()){
                            linkedListIterator.previous();
                        }
                        goingForward=false;
                    }
                    if(linkedListIterator.hasPrevious()){
                        System.out.println("Now visiting " + linkedListIterator.previous());
                    }else{
                        System.out.println("We are at the start of the list");
                        goingForward=true;
                    }
                    break;
                case 3:
                    printMenu();
                    break;
            }
        }
    }

    private static void printMenu(){
        System.out.println("Available options:\npress");
        System.out.println("0 - to quit\n" +
                "1 - go next city\n" +
                "2 - go to previous city\n" +
                "3 - print menu options");
    }
}

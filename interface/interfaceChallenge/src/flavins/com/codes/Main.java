package flavins.com.codes;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//	Player james = new Player("Amadioha", 19, 5);
//        System.out.println(james.toString());
//        saveObjects(james);
//
//        james.setHitPoints(4);
//        System.out.println(james);
//        james.setWeapon("Ogu");
//        saveObjects(james);
//        loadObjects(james);
//        System.out.println(james);

        ISavable ekwensu = new Monster("Ekwensu", 8, 8);
        System.out.println(ekwensu.toString());
        System.out.println(ekwensu);
        System.out.println("Strength = " + ((Monster) ekwensu).getStrength());
        saveObjects(ekwensu);


    }

    public static ArrayList<String> readValues(){
        ArrayList<String> values = new ArrayList<String>();


        Scanner scanner = new Scanner(System.in);

        boolean quit = false;

        int index = 0;

        System.out.println("choose\n" +
                "1 to enter a string\n" +
                "0 t quit");

        while(!quit){
            System.out.println("Choose and option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;


    }


    public static void saveObjects(ISavable objectsToSave){
        for(int i = 0; i < objectsToSave.write().size(); i++){
            System.out.println("Saving " + objectsToSave.write().get(i) + " is been saved to the device");
        }
    }

    public static void loadObjects(ISavable objectsToLoad){
        ArrayList<String>values = readValues();
        objectsToLoad.read(values);
    }
}

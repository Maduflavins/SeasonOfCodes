package flavins.com.codes;

import java.util.ArrayList;

public class GloceryList {

    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item){
        groceryList.add(item);
    }

    public void printGroceryList(){
        System.out.println("you have " + groceryList.size() + " items in your groery list");
        for(int i=0; i < groceryList.size(); i++){
            System.out.println((i + 1) + ". " + groceryList.get(i));
        }
    }

    public void modifyGroceryItem(String currentItem, String newItem){
        int position = findIterm(currentItem);
        if(position >= 0){
            modifyGroceryItem(position, newItem);
        }
    }

    private void modifyGroceryItem(int position, String item){
        groceryList.set(position, item);
        System.out.println("item at " + position+1 + " has been modified");
    }

    public void removeGroceryList(String item){
        int position = findIterm(item);
        if(position >= 0){
            removeGroceryList(position);
        }
    }

    private void removeGroceryList(int position){
        groceryList.remove(position);
    }

    private int findIterm(String searchItem) {
        return groceryList.indexOf(searchItem);

    }

    public boolean onFile(String searchItem){
        int position = findIterm(searchItem);
        if(position >= 0){
            return true;
        }
        return false;
    }


}

package com.hongzi;

import java.util.ArrayList;


public class GroceryList {

    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " item in the list.");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println("Item " + i + " - " + groceryList.get(i));
        }
    }

    public void modifyGroceryItem(int index, String newItem) {
        groceryList.set(index, newItem);
        System.out.println("Item of index " + index + " has been modified.");
    }

    public void removeGroceryItem(int index) {
        groceryList.remove(index);
        System.out.println("Item of index " + index + " has been removed.");
    }

    public String searchGroceryItem(String searchItem) {
        // boolean doesContain = groceryList.contains(searchItem);
        int itemIndex = groceryList.indexOf(searchItem);
        if (itemIndex >= 0) {
            return groceryList.get(itemIndex);
        }
        return "no such item";

    }

    public int getSize() {
        return groceryList.size();
    }
}

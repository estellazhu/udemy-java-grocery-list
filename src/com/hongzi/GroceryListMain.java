package com.hongzi;

import java.util.Scanner;


public class GroceryListMain {

    private static Scanner sc = new Scanner(System.in);
    private static GroceryList gl = new GroceryList();

    public static void main(String[] arg) {
        boolean quit = false;
        int choice;
        printInstruction();

        while (!quit) {
            System.out.print("\nEnter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 0:
                    printInstruction();
                    break;
                case 1:
                    gl.printGroceryList();
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
                    searchItem();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }

    public static void printInstruction() {
        System.out.print("\nPress ");
        System.out.print("\t 0 - Print choice options.");
        System.out.print("\t 1 - Print the grocery list.");
        System.out.print("\t 2 - Add an item.");
        System.out.print("\t 3 - Modify an item.");
        System.out.print("\t 4 - Remove an item.");
        System.out.print("\t 5 - Search for an item.");
        System.out.print("\t 6 - Quit the application.");

    }

    public static void addItem() {
        System.out.print("Please enter the new item: ");
        String itemAdded = sc.next();
        gl.addGroceryItem(itemAdded);
        System.out.println("You have added " + itemAdded + " in the list.");
    }

    public static void modifyItem() {
        System.out.print("Please enter the index: ");
        int index = sc.nextInt();
        if (index >= 0 && index < gl.getSize()) {
            sc.nextLine();
            System.out.print("Please enter the new item: ");
            String newItem = sc.nextLine();
            gl.modifyGroceryItem(index, newItem);
        } else {
            System.out.println("Index is out of range.");
        }

    }

    public static void removeItem() {
        System.out.print("Please enter the index: ");
        int index = sc.nextInt();
        if (index >= 0 && index < gl.getSize()) {
            gl.removeGroceryItem(index);
        } else {
            System.out.println("Index is out of range.");
        }

    }

    public static void searchItem() {
        System.out.print("Please enter the item: ");
        String searchFor = sc.nextLine();
        System.out.println("Found " + gl.searchGroceryItem(searchFor) + " in the grocery list.");
    }
}

package com.training;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NameSearchDemo {

    public static void main(String[] args) {
    	// Ask user to input some names and then store those names in an arraylist.
    	//once the names are saved in arraylist show a message that names saved successfully.
    	//then ask the user again to search for a particular name.
    	//If the name is in the list display: name found
    	//else display: name not found
    	
    	
        Scanner sc = new Scanner(System.in);
        List<String> names = new ArrayList<>();

       
        System.out.println("Enter how many names you want to store:");
        int n = sc.nextInt();
        sc.nextLine(); 

        for (int i = 0; i < n; i++) {
            System.out.println("Enter name " + (i + 1) + ":");
            String name = sc.nextLine();
            names.add(name);
        }

        System.out.println("Names saved successfully!");

       
        System.out.println("Enter name to search:");
        String searchName = sc.nextLine();

        if (names.contains(searchName)) {
            System.out.println("Name found");
        } else {
            System.out.println("Name not found");
        }

        sc.close();
    }
}
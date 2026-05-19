package com.training;

import java.util.Scanner;

public class Customer {

	public static void main(String[] args) {
		//String firstName = "Maryam";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter customer name:");
		//String customerName = sc.nextLine();
		String firstName =sc.nextLine();
		System.out.println("Enter customer last name :");
		String lastName =sc.nextLine();
		// next() --> will take single string without space
		//nextIn() --> to input integer values 
		//String lastName = "salem";
		System.out.println("Enter age :");
		int age = sc.nextInt();
		
		byte b= 112;
		short s = 115;
		// b = s; can't convert byte to short 
		//s = b; can be convert it 
		b=(byte)s; 
		//int customerID = 123;
		//System.out.println("Customer class");
		//System.out.println("Customer Name: "+customerName);
        System.out.println("Customer Details: " + firstName + " "+ lastName +" " + "," +age );
        
        
     // check if the customer is more than 18 then display eligible to open an account
      //else display not yet eligible to open an account
        if (age > 18) {
            System.out.println(firstName + " is eligible to open an account.");
        } else {
            System.out.println(firstName + " is not yet eligible to open an account.");
        }

    


	}

}
// import shortcut : Ctrl +shift+o
//java is a strongly typed language
// variable is a placeholder pointing to a memory location 
//create variables that will store customer first name and customer  last name , customer age
// and display all the customer details in a single line
// take the customer detials from user using scanner class

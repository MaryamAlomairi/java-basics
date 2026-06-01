package com.training;
import java.util.InputMismatchException;
import java.util.Scanner;
public class BankClient {
	public static void main(String[] args) {
		SavingAccount savingAccount = new SavingAccount(1234, 
				                     "Anwar", 500, 4);
		System.out.println("Before deposit:"+savingAccount.displayBalance());
		savingAccount.deposit(300);
		System.out.println("After deposit:"+savingAccount.displayBalance());
		savingAccount.withdraw(100);
		System.out.println("After withdraw:"+savingAccount.displayBalance());
		savingAccount.addInterest();
		System.out.println("After adding interest:"+savingAccount.displayBalance());
		
		//dynamic polymorphism
		Account currentAccount = new CurrentAccount(
									2781,"Hassan",400,100);
		currentAccount.deposit(500);
		currentAccount.withdraw(1050);
		System.out.println("After withdraw:"+currentAccount.displayBalance());
		
		
		
	    Scanner sc = new Scanner(System.in);

        SavingAccount[] savings = new SavingAccount[3];
        CurrentAccount[] currents = new CurrentAccount[3];
        
        System.out.println("ENTER 3 SAVING ACCOUNTS");

        for (int i = 0; i < 3; i++) { 

            System.out.println("Saving Account " + (i + 1));

            while (true) { 
                try {
                    System.out.print("Enter Account Number: ");
                    int accNo = sc.nextInt();

                    System.out.print("Enter Name: ");
                    String name = sc.next();

                    System.out.print("Enter Balance: ");
                    double balance = sc.nextDouble();

                    System.out.print("Enter Interest Rate: ");
                    float interest = sc.nextFloat();

                    savings[i] = new SavingAccount(accNo, name, balance, interest);
                    break;

                } catch (InputMismatchException e) {
                    System.out.println("Invalid input! Try again.");
                    sc.next();
                }
            }
        }

        System.out.println("ENTER 3 CURRENT ACCOUNTS");

        for (int i = 0; i < 3; i++) {

            System.out.println("Current Account " + (i + 1));

            while (true) {
                try {
                    System.out.print("Enter Account Number: ");
                    int accNo = sc.nextInt();

                    System.out.print("Enter Name: ");
                    String name = sc.next();

                    System.out.print("Enter Balance: ");
                    double balance = sc.nextDouble();

                    System.out.print("Enter Overdraft Limit: ");
                    double overdraft = sc.nextDouble();

                    currents[i] = new CurrentAccount(accNo, name, balance, overdraft);
                    break;

                } catch (InputMismatchException e) {
                    System.out.println("Invalid input! Try again.");
                    sc.next();
                }
            }
        }

        System.out.println("Accounts created successfully.");
	}
		
	
}

//Method overloading:
// Same method name but different parameter list

//Use your existing code for Account, SavingAccount and CurrentAccount.
//Create 3 SavingAccounts and 3 CurrentAccounts by taking input from user.
//Whenever any exception occurs during input your code should handle that exception and allow the user to input the correct value again.
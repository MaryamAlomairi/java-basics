package com.training.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CustomerFileWriter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        File file = new File("customer.csv");

        try (BufferedWriter bw = new BufferedWriter(
                new FileWriter(file, true))) {

            // Write header only if file is empty
            if (file.length() == 0) {
                bw.write("customer_id,customer_name,gender,city,balance");
                bw.newLine();
            }

            System.out.print("Enter Customer ID: ");
            String customer_id = sc.nextLine();

            System.out.print("Enter Customer Name: ");
            String customer_name = sc.nextLine();

            System.out.print("Enter Gender: ");
            String gender = sc.nextLine();

            System.out.print("Enter City: ");
            String city = sc.nextLine();

            System.out.print("Enter Balance: ");
            double balance = sc.nextDouble();

            if (balance > 100) {

                bw.write(customer_id + "," +
                         customer_name + "," +
                         gender + "," +
                         city + "," +
                         balance);

                bw.newLine();

                System.out.println("Customer saved successfully.");

            } else {
                System.out.println(
                    "Balance must be greater than 100. Customer not saved.");
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            sc.close();
        }
    }
}
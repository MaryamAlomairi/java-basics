package com.training.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class CustomerCSVReader {

	public static void main(String[] args)throws IOException {
		//FileReader file = null;
		//BufferedReader br = null;
		//FileWriter fileW = null;
		//BufferedWriter bw = null;

		try (BufferedReader br = new BufferedReader(new FileReader("customer.csv"));
				
				BufferedWriter bw = new BufferedWriter(new FileWriter("male_customer.csv"));
				
		ObjectOutputStream oos = new ObjectOutputStream (new FileOutputStream("customer.ser")))
		 {
		 //file = new FileReader("customer.csv");
		 //br = new BufferedReader(file);
		// fileW = new FileWriter("male_customer.csv");
		 //bw = new BufferedWriter(fileW);
		 //bw.write("customer_id, customer_name, gender, city");
		 bw.newLine();
		 String line;
		 br.readLine();//skip the header
		 
		 while((line =  br.readLine()) !=null) {
			 //line"C101,sara,Female,Muscat"
			 String[] data = line.split(",");
			 Customer customer = new Customer(data[0],data[1],data[2],data[3]);
			 System.out.println(customer);
			 oos.writeObject(customer);
			 if(data[2].equalsIgnoreCase("Male")) {
			 bw.write(data[0] + "," + data[1] + "," + data[2] + "," + data[3]);
			 bw.newLine();
			 }
		 }
		 

	}
	catch(FileNotFoundException e) {
		System.out.println("File is not available or incorrect");
		e.printStackTrace();
	}
		//finally {
			//file.close();
			//br.close();
			//fileW.close();
			//if(bw != null)
				//bw.close();
		//}
		
	}


}

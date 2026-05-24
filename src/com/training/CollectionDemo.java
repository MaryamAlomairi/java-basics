package com.training;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;


public class CollectionDemo {

	public static void main(String[] args) {
		Set <String> names = new HashSet<>(); //can store only strings
		names.add("Zara");
		names.add("Tina");
		names.add("Tina"); // no duplicate
		names.add("Sayeed");
		//names.add(23); //integer --autoboxing
		Iterator it = names.iterator();
		while(it.hasNext()) {
			String name =(String)it.next();
			System.out.println(name);
			
		}
		
		Set <User> userSet = new TreeSet<>(new NameComparator() ); //HashSet
		//List <User> userList  = new ArrayList<>();
		User user1 = new User("A101","Gaith","abc@mail.com");
		User user2 = new User("A102","Anwar","sdf@mail.com");
		User user3 = new User("A103","Ayuub","gjf@mail.com");
		User user4 = new User("A104","Rohan","rho@mail.com");
		User user5 = new User("A102","Anwar","sdf@mail.com");
		
		
		userSet.add(user1);
		userSet.add(user2);
		userSet.add(user3);
		userSet.add(user4);
		//.args..add(user5);
		
		//Collections.sort(userSet, new NameComparator());
		for(User user:userSet) {
			System.out.println(user);
		}

		//userSet.add(user1);
		//userSet.add(user2);
		//userSet.add(user3);
		//userSet.add(user4);
		//userSet.add(user5);
		
		for(User user:userSet) {
			System.out.println(user);
		}
		
		Map<Integer,String> namesMap =  new HashMap<>();
		namesMap.put(101,"sara");
		namesMap.put(102,"Ibrahim");
		namesMap.put(103,"Sayyed");
		namesMap.put(104,"Zubaida");
		
		System.out.println(namesMap.get(103));
		for(Entry<Integer ,String> entry:namesMap.entrySet()) {
		 System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		
	}

}
// Ask user to input some names and then store those names in an arraylist.
//once the names are saved in arraylist show a message that names saved successfully.
//then ask the user again to search for a particular name.
//If the name is in the list display: name found
//else display: name not found

package collectionsDemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//set removes duplicate
	
		HashSet<String> cities = new HashSet<>();
		
		cities.add("London");
		cities.add("Paris");
		cities.add("New York");
		cities.add("New Delhi");
		cities.add("Moscow");
		cities.add("Mumbai");
		
		
		for (String t: cities)
		{
			System.out.println(t);
		}
		
		System.out.println(cities.size());
		
		// Check if an item exists in list or not
		System.out.println(cities.contains("Hyderabad")); 
		
		Iterator itr = cities.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}

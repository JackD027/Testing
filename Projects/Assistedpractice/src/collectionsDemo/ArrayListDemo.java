package collectionsDemo;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		ArrayList<String> cities = new ArrayList<>();
		
	
		
		cities.add("London");
		cities.add("Paris");
		cities.add(2, "New Delhi");  
		cities.add("Mumbai");
		
		//calculate Size of arrayList
		
		System.out.println(cities.size()); 
		
		//enhanced for loop		
		for(String t: cities)
		{
			System.out.println(t);
		}
		
		System.out.println(cities.get(1));
		
	}

}

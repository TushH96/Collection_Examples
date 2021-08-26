package Hashmap;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Hashmap_Sorting {

	
	public static void main(String[] args) {
		
		
		Map<Integer,String> map=new HashMap<Integer,String>();          
	      map.put(100,"Arya");    
	      map.put(101,"Vivek");    
	      map.put(102,"Rasika");  
		
	  //  map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(System.out::println);    
	      map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(System.out::println); 
	    //  map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println); 
	      map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println); 
	
	}
}

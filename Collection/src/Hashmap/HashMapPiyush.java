package Hashmap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapPiyush {

	public static void main(String[] args) {
		
		
		Map<Integer,String> map=new HashMap<Integer,String>();          
	      map.put(100,"Piyush");    
	      map.put(101,"xyz");    
	      map.put(102,"abc");
	      
	     Set set = map.entrySet();
	  
	  	for(Entry<Integer,String> piyush :map.entrySet()) {
	  		
	  		System.out.println(piyush);
	  	}
	      
	    
	    
	}
}

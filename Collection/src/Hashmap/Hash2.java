package Hashmap;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.Set;

public class Hash2 {


public static void main(String[] args) {
	

	HashMap<Integer, Student> hm = new HashMap<>();
	
	hm.put(1, new Student ("Tushar","Adholekar",1,new Phone("9850516265","225487")));
	hm.put(2, new Student ("Rasika","Adholekar",1,new Phone("9850516265","225487")));
	
	Set set = hm.entrySet();
	
	for(Entry<Integer,Student> tush :hm.entrySet()) {
		
          Integer a = tush.getKey();
          Student b= tush.getValue();
          
         System.out.println("Keys :" + a );
       //  System.out.println(b.fname+" "+b.Lname+" "+b.id+" "+b.p.mob+" "+b.p.ll);
         
         System.out.println("FirstName : "  +b.fname+" LastName: "+b.Lname+" Id: "+b.id+" Mobileno: "+b.p.mob+" PhoneNo: "+b.p.ll);
	}
	
	
	
	System.out.println(hm);
	

	
	
}

	
}

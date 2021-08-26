package Hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap.KeySetView;

public class HashMapTest {
	public static void main(String[] args) {
		HashMap<String, ArrayList<Student>> hm = new HashMap<>();
		ArrayList<Student> al = new ArrayList<>();
		al.add(new Student("Rasika", "Baviskar", 1, new Phone("34567", "2345678")));
		al.add(new Student("Tushar", "Adholekar", 2, new Phone("34567", "2345678")));
		al.add(new Student("Arya", "wani", 3, new Phone("34567", "2345678")));
		al.add(new Student("Ashish", "Baviskar", 4, new Phone("34567", "2345678")));

		hm.put("com", al);

		ArrayList<Student> al2 = new ArrayList<>();
		al2.add(new Student("Rasika2", "Baviskar", 1, new Phone("34567", "2345678")));
		al2.add(new Student("Tushar2", "Adholekar", 2, new Phone("34567", "2345678")));
		al2.add(new Student("Arya2", "wani", 3, new Phone("34567", "2345678")));
		al2.add(new Student("Ashish2", "Baviskar", 4, new Phone("34567", "2345678")));

		hm.put("elec", al2);

//		/*
//		 * Set<String> keys=hm.keySet(); for(String str: keys){
//		 * System.out.println("Deparment is "+str);
//		 * 
//		 * ArrayList<Student> list=hm.get(str); 
//		 * for(Student stu:list){
//		 * System.out.println("Id="+stu.id);
//		 * System.out.println("fname="+stu.fname);
//		 * System.out.println("Lname="+stu.Lname);
//		 * System.out.println("mon="+stu.p.mob);
//		 * System.out.println("mon="+stu.p.ll);
//		 * System.out.println("..............................................");
//		 * } }
//		 */

//		 //Set<Entry<String, ArrayList<Student>>> set = hm.entrySet();
//		 //for(Entry<String, ArrayList<Student>> entry : set)
//		//for (Map.Entry entry : hm.entrySet())//error
//		for (Map.Entry<String, ArrayList<Student>> entry : hm.entrySet()) {
//			String  st = entry.getKey();
//			System.out.println(st + " Department:");
//			ArrayList<Student> s = entry.getValue();
//			for (Student stu : s) {
//				System.out.println("Id=" + stu.id);
//				System.out.println("fname=" + stu.fname);
//				System.out.println("Lname=" + stu.Lname);
//				System.out.println("mon=" + stu.p.mob);
//				System.out.println("mon=" + stu.p.ll);
//				System.out.println("..............................................");
//			}}

//		Iterator<String> itr = hm.keySet().iterator();
//		while (itr.hasNext()) {
//			String key = itr.next();
//			ArrayList<Student> s = hm.get(key);
//			for (Student stu1 : s) {
//				System.out.println("Id=" + stu1.id);
//				System.out.println("fname=" + stu1.fname);
//				System.out.println("Lname=" + stu1.Lname);
//				System.out.println("mon=" + stu1.p.mob);
//				System.out.println("mon=" + stu1.p.ll);
//				System.out.println("..............................................");
//			}}
		
//		Iterator<Map.Entry<String, ArrayList<Student>>> itr2=hm.entrySet().iterator();
//		while(itr2.hasNext()){
//			//Map.Entry entry=(Map.Entry)itr2.next();
//			//String k= (String)entry.getKey();
//			Map.Entry<String, ArrayList<Student>> entry=(Map.Entry)itr2.next();
//			String k= entry.getKey();
//			ArrayList<Student> se = hm.get(k);
//			for (Student stu3 : se) {
//				System.out.println("Id=" + stu3.id);
//				System.out.println("fname=" + stu3.fname);
//				System.out.println("Lname=" + stu3.Lname);
//				System.out.println("mon=" + stu3.p.mob);
//				System.out.println("mon=" + stu3.p.ll);
//				System.out.println("..............................................");
//			}}
		
		HashMap<Integer, String> hash = new HashMap<>();
		
		hash.put(1, "Tushar");
		hash.put(3, "Rasika");
		hash.put(4, "aarya");
		hash.put(5, "ashish");
		
//		hm.forEach((aa,bb) -> System.out.println("Key : "+aa +" Values : "+bb));
		
		ArrayList<String> all = new ArrayList<>();
		all.add("Tushar");
		all.add("rasika");
		all.add("abc");
		
		//System.out.println(hash);
		
	//	hash.stream().forEach((a,b) -> System.out.println("key : "+a +" values :" +b));
		
	/*	for(String a : all) {
			
			System.out.println(a);
	
		}*/
		
	/*	  Set set = hash.entrySet();
		  
		     for(Entry<Integer, String> entry : hash.entrySet()){  
		            System.out.println(entry.getKey() + " : " +entry.getValue());  
		        } */
	
/*		Set set = hash.entrySet();
		
		for(Entry<Integer, String> entry:hash.entrySet() ) {
			
			System.out.println(entry.getKey() + ":" +entry.getValue());
		}
				     
		  Set<Integer> keys = hash.keySet();
		  
		  for(Integer key : keys) {
			  
			  System.out.println(key);
			  
		  }*/
		  
				
		  
		  

	}
}

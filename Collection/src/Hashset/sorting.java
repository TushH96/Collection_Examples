package Hashset;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class sorting {

	public static void main(String[] args) {
		
		
		
	//	HashSet<Integer> set = new HashSet<>();
		
		ArrayList<Integer> set= new ArrayList<>();
		
		set.add(5);
		set.add(9);
		set.add(2);
		set.add(99);
		set.add(6);
		
		Collections.sort(set);
		System.out.println(set);
		
		
	}
	
	
}

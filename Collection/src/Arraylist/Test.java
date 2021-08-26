package Arraylist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test {

	
	public static void main(String[] args) {
		
		
		ArrayList<Employee> emp = new ArrayList<>();
		
		
		//emp.add(new Employee(101,"Tushar","Delivery",90000,new Address("India","Dhule")));
		
		Employee employee = new Employee();
		//employee.
		
		for (Employee employee2 : emp) {
			
			//System.out.println(employee2);
		}
		
		HashMap<Integer, String> tush= new HashMap<Integer, String>();
		
		tush.put(1, "Tushar");
		tush.put(2, "jayraj");
		tush.put(3, "jayshree");
		tush.put(4, "janvhi");
		tush.put(5, "disha");
		
		Set st = tush.entrySet();
		
//		Iterator it = st.iterator();
//		
//		System.out.println("All keys are: " + st);
		
	/*	for(Map.Entry entry:tush.entrySet()) {
			
			System.out.print(entry.getKey() + " : "  + entry.getValue()  );
		}*/
		
		tush.forEach((a,b) -> System.out.println("key : "+a +" values :" +b));
		
		
		
		
	}
}

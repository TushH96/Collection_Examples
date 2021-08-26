package Hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapStudentArrayTest {
	public static void main(String[] args) {

		HashMap<String, Student[]> hm = new HashMap<>();
		Student[] s = new Student[10];
		Student s1 = new Student("Rasika", "Baviskar", 1, new Phone("34567", "2345678"));
		Student s2 = new Student("Tushar", "Adholekar", 2, new Phone("34567", "2345678"));
		Student s3 = new Student("Arya", "wani", 3, new Phone("34567", "2345678"));
		Student s4 = new Student("Ashish", "Baviskar", 4, new Phone("34567", "2345678"));

		s[0] = s1;
		s[1] = s2;
		s[2] = s3;
		s[3] = s4;

		hm.put("com", s);

		Student st[] = new Student[10];
		Student s5 = new Student("Rasika", "Baviskar", 1, new Phone("34567", "2345678"));
		Student s6 = new Student("Tushar", "Adholekar", 2, new Phone("34567", "2345678"));
		Student s7 = new Student("Arya", "wani", 3, new Phone("34567", "2345678"));
		Student s8 = new Student("Ashish", "Baviskar", 4, new Phone("34567", "2345678"));

		st[0] = s5;
		st[1] = s6;
		st[2] = s7;
		st[3] = s8;

		hm.put("Mechanical", st);
		
		
		System.out.println(hm);
		
//		Set<String> keys=hm.keySet();
//		for (String str : keys) {
//			Student[] v=hm.get(str);
//			for (Student stu : v) {
//				System.out.println("Id=" + stu.id);
//				System.out.println("fname=" + stu.fname);			
//				System.out.println("Lname=" + stu.Lname);
//				System.out.println("mon=" + stu.p.mob);
//				System.out.println("mon=" + stu.p.ll);
//				System.out.println("..............................................");
//			}}
		
		
/*		Set<Entry<String,Student[]>> entry=hm.entrySet();
		Iterator itr=entry.iterator();
		while(itr.hasNext()){
			Map.Entry<String, Student[]> e=(Map.Entry)itr.next();
			String k1=e.getKey();
			Student[] v1=e.getValue();
			for (Student stu1 : v1) {
				System.out.println("Id=" + stu1.id);
				System.out.println("fname=" + stu1.fname);			
				System.out.println("Lname=" + stu1.Lname);
				System.out.println("mon=" + stu1.p.mob);
				System.out.println("mon=" + stu1.p.ll);
				System.out.println("..............................................");
			}}*/
		}

	}



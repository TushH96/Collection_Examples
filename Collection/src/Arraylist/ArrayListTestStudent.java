package Arraylist;

import java.util.ArrayList;

public class ArrayListTestStudent {
	
	public static void main(String[] args) {
		ArrayList <Student> ss=new ArrayList<>();
		/*Student a1=new Student(1,"Rasika",new Phone(02344, 962557655));
		Student a2=new Student(2,"Arya",new Phone(02344, 819839552));
		Student a3=new Student(3,"Priti",new Phone(02245, 765333355));
		Student a4=new Student(4,"Vaishali",new Phone(0265, 765333335));
		Student a5=new Student(5,"Ashish",new Phone(02343, 765333335));
		Student a6=new Student(6,"Vivek",new Phone(02366, 765553443));
		Student a7=new Student(7,"Harshal",new Phone(02345, 763232355));
		Student a8=new Student(8,"Tushar",new Phone(02473, 763232255));
		Student a9=new Student(9,"Parag",new Phone(02340, 764242255));
		Student a10=new Student(10,"Nikhil",new Phone(02345, 765242225));*/
		
		ss.add(new Student(1,"Rasika",new Phone(02344, 962557655)));
		ss.add(new Student(2,"Arya",new Phone(02344, 819839552)));
		ss.add(new Student(3,"Priti",new Phone(02245, 765333355)));
		ss.add(new Student(4,"Vaishali",new Phone(0265, 765333335)));
		ss.add(new Student(5,"Ashish",new Phone(02343, 765333335)));
		ss.add(new Student(6,"Vivek",new Phone(02366, 765553443)));
		ss.add(new Student(7,"Harshal",new Phone(02345, 763232355)));
		ss.add(new Student(8,"Tushar",new Phone(02473, 763232255)));
		ss.add(new Student(9,"Parag",new Phone(02340, 764242255)));
		ss.add(new Student(10,"Nikhil",new Phone(02345, 765242225)));
		
		/*ss.add(a1);
		ss.add(a2);
		ss.add(a3);
		ss.add(a4);
		ss.add(a5);
		ss.add(a6);
		ss.add(a7);
		ss.add(a8);
		ss.add(a9);
		ss.add(a10);*/
		for(Student student:ss){
			System.out.println("Id>"+student.id);
			System.out.println("name>"+student.name);
			System.out.println("ll>"+student.pp.ll);
			System.out.println("mob>"+student.pp.mob);
			System.out.println("------------------------------");
			
		}
		
	}

}

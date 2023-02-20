package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Student {
	
	
	String name;
	int RollNo;
	int marks;
	
	
	public Student(String name, int Rollno, int Marks) {
		
		this.name=name;
		this.RollNo=Rollno;
		this.marks=Marks;
		
	}

	public static void main(String[] args) {
		
	
		
	List<Student> list=new ArrayList<>();
	list.add(new Student("Rahul", 1 , 60));
	list.add(new Student("Manish", 1, 64));
	list.add(new Student("Jon",1, 50));
	list.add(new Student("Aks",1,76));
	
	
	
//	Comparator<Student> com=new Comparator<Student>() {
//		
//		@Override
//		public int compare(Student S1, Student S2) {
//			// TODO Auto-generated method stub
//
//			if(S1.RollNo>S2.RollNo)
//			{
//				return 1;
//			}else {
//				return -1;
//			}
//			
//		}
//	};
	
	
	Collections.sort(list,(o1,o2)->o1.name.compareTo(o2.name));
	
	//Collections.sort(list, Comparator.comparing(Student::));
	list.forEach(System.out::println);
	
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", RollNo=" + RollNo + ", marks=" + marks + "]";
	}

}

package com.arrayofobject;

import java.util.Scanner;
/*
 * class Student { private int id; private String name; private int marks;
 * 
 * Student() {}
 * 
 * public Student(int id, String name, int marks) { super(); this.id = id;
 * this.name = name; this.marks = marks; }
 * 
 * public String toString() { return id+" "+name+" "+marks; } }
 * 
 * public class TestArrayObject {
 * 
 * public static void main(String[] args) {
 * 
 * 
 * Student stu[]=new Student[2];
 * 
 * for(int i=0;i<stu.length;i++) { System.out.println("Enter id,name,marks");
 * int id=new Scanner(System.in).nextInt(); String name=new
 * Scanner(System.in).next(); int marks=new Scanner(System.in).nextInt();
 * 
 * stu[i]=new Student(id,name,marks); }
 * 
 * for(int i=0;i<stu.length;i++) { System.out.println(stu[i]); } }
 * 
 * }
 */



class Student
{
	private int id;
	private String name;
	private int marks;
	
	Student()
	{}

	public Student(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	
	
	void input()
	{
		System.out.println("Enter id,name,marks");
		id=new Scanner(System.in).nextInt();
		 name=new Scanner(System.in).next();
		 marks=new Scanner(System.in).nextInt();
	}
	public String toString()
	{
		return id+" "+name+" "+marks;
	}
	
	void display()
	{
		System.out.println(id+" "+name+" "+marks);
	}
}

public class TestArrayObject {

	public static void main(String[] args) {
		
    
		Student stu[]=new Student[2];
		
		for(int i=0;i<stu.length;i++)
		{
			
			
			stu[i]=new Student();
			stu[i].input();
		}

		for(int i=0;i<stu.length;i++)
		{
			stu[i].display();
		}
	}

}

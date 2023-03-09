package ooops;

public class Student 
{
	private int rno;
	private String name;
	private int std;
	private int age;
	public Student() 
	{
		disp();
		System.out.println("START :: Default Constructor");
		rno=1;
		name="Dhairya";
		std=12;
		age =12;
		System.out.println("EXIT :: Default Constructor");
	}
	public Student(int rno,String name,int std,int age) 
	{
		this();
		System.out.println("START :: PARA Constructor");
		this.rno = rno;
		this.name = name;
		this.std = std;
		this.age = age;
		
		System.out.println("EXIT :: PARA Constructor");
	}
	// copy constructor
	public Student(Student s) 
	{
		System.out.println("START :: Copy Constructor");
		rno = s.rno;
		name = s.name;
		std = s.std;
		age = s.age;
		System.out.println("EXIT :: Copy Constructor");
	}
	public void disp() 
	{
		System.out.println(rno + " " +name + " " +std);
	}
	@Override
	public boolean equals(Object obj) 
	{
		Student s2 = (Student)obj;
		return(name.equals(s2.name));
	}
	@Override
	public int hashCode() 
	{
		return ((age*20)+82);
	}
}
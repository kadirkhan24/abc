package com.interview.program;

 final class Student
{
private	final int id;
private final String name;

 
public Student(int id,String name)
	{
	this.id=id;
	this.name=name;
	}
  	
public int getId()
  	{
  		return id;	
  	}

public String getName()
	{
	return name;
	}

}
public class ImmutableStudent 
	{
	public static void main(String[] args) 
	
	{
		
Student is = new Student(101, "salman");

System.out.println(is.getId());
System.out.println(is.getName());
}
}
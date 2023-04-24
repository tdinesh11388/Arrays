package com.dn.Arrays;

public class Student implements Comparable
{
	String name;
	int marks;
	
	public Student(String n,int m)
	{
		name=n;
		marks=m;
	}

	@Override
	public int compareTo(Object o)
	{
		String s1=name;
		Student s=(Student)o;
		return s1.compareTo(s.name);
	}
	public String toString()
	{
		return "Student[n= "+name+"marks"+marks+"]";
	}
	
	
}